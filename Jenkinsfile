pipeline {
    agent any

    tools {
        maven 'maven-3.5.2'
    }
    //permet de se lancer toutes les 3 minutes dès un changement sur le repo
    triggers {
        pollSCM('*/3 * * * *') 
    }
    
    //Verifie le repo 
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        //Compile le project
        stage('Compilation') {
            steps {
                script {
                    sh 'mvn clean compile'
                }
            }
        }

        //Publie un Javadoc
        stage('Javadoc') {
            steps {
                script {
                    sh 'mvn javadoc:javadoc'
                }
            }
        }
    }
  }
            
