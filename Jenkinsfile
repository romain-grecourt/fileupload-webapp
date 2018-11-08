pipeline {
  agent any
  options {
    skipDefaultCheckout()
  }
  environment {
    FOO = 'BAR'
  }
  stages {
    stage('Init') {
      steps {
        script {
          def commitHash = checkout(scm).GIT_COMMIT
        }
        sh """
          ls -la
          pwd
          env
          echo ${scm}
        """
      }
    }
  }
}