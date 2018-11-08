pipeline {
  agent any
  //options {
    // skipDefaultCheckout()
  //}
  environment {
    FOO = 'BAR'
  }
  stages {
    stage('Init') {
      steps {
        sh '''
          cat .git/$(cat .git/HEAD | awk '{print $2}')
          ls -la
          pwd
          env
          echo ${scm}
        '''
      }
    }
  }
}