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
        sh """
          git rev-parse --short HEAD
          ls -la
          pwd
          env
          echo ${scm}
        """
      }
    }
  }
}