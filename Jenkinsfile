pipeline {
  agent any
  parameters {
    string(name: 'branchSpecifier',
           defaultValue: 'origin/master',
           description: 'Name of the kubelink branch to build.  e.g. origin/dev')
    string(name: 'imageName',
           defaultValue: 'kubelink',
           description: 'Builds with:  docker build -t ${imageName}:${tag} .')
    string(name: 'tag',
           defaultValue: 'dev',
           description: 'Builds with:  docker build -t ${imageName}:${tag} . Note:  Reusing a tag name may or may not fail.')
    booleanParam( name: 'dockerPush', defaultValue: true,
           description: 'True - pushes image to docker-internal.ilabs.io/kubelink, False - does not push image (just leaves image locally; Just test docker build)')
  }
  environment {
    FOO = 'BAR'
  }
  triggers {
      githubPullRequest {
          //admin('user_1')
          //admins(['user_2', 'user_3'])
          //userWhitelist('you@you.com')
          //userWhitelist(['me@me.com', 'they@they.com'])
          //orgWhitelist('my_github_org')
          //orgWhitelist(['your_github_org', 'another_org'])
          //cron('H/5 * * * *')
          triggerPhrase('special trigger phrase')
          onlyTriggerPhrase()
          //useGitHubHooks()
          //permitAll()
          //autoCloseFailedPullRequests()
          //displayBuildErrorsOnDownstreamBuilds()
          //whiteListTargetBranches(['master','test', 'test2'])
          //blackListTargetBranches(['master','test', 'test2'])
          //whiteListLabels(['foo', 'bar'])
          //blackListLabels(['baz'])
          //allowMembersOfWhitelistedOrgsAsAdmin()
      }//
  }
  stages {
    stage('Init') {
      // XXX assuming alpine
      steps {
        sh '''
          env
        '''
      }
    }
  }
}