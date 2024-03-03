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
                    sh 'mvn clean install'
                }
            }
        }

        stage('Javadoc') {
            steps {
                script {
                    sh 'mvn javadoc:javadoc'
                }
            }
        }
    }

    post {
        success {
            echo 'Le pipeline a réussi!'
        }
        failure {
            echo 'Le pipeline a échoué!'
        }
    }
}
