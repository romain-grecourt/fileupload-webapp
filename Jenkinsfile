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
        a = checkout scm
        print a
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