pipeline {
    agent any

    tools {
        maven 'maven-3.5.2'
    }

    triggers {
        pollSCM('*/3 * * * *') 
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compilation') {
            steps {
                script {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Javadoc') {
            steps {
                script {
                    // Génère la Javadoc
                    sh 'mvn javadoc:javadoc'
                }
            }
        }
    }
  }
            
