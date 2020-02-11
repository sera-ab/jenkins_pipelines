pipeline {
  agent any
  stages {
    stage('Stage1') {
      parallel {
        stage('Stage1') {
          steps {
            echo 'Hello'
          }
        }

        stage('Test') {
          steps {
            sh 'ech "hello"'
          }
        }

      }
    }

    stage('Stage2') {
      steps {
        echo 'Step2'
      }
    }

    stage('Stage3') {
      steps {
        echo 'Step3'
      }
    }

  }
}