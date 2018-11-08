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
        checkout scm
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