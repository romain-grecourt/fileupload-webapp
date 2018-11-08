pipeline {
  agent any
  options {
    // skipDefaultCheckout()
  }
  environment {
    FOO = 'BAR'
  }
  stages {
    stage('Init') {
      steps {
        sh """
          git status
          ls -la
          pwd
          env
          echo ${scm}
        """
      }
    }
  }
}