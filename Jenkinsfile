pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Récupérer le code depuis Git
                checkout scm
            }
        }

        stage('Compilation') {
            steps {
                // Compiler le projet avec Maven
                script {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Tests Maven') {
            steps {
                // Ajouter les tests Maven
                script {
                    sh 'mvn test'
                }
            }
        }

        stage('Javadoc') {
            steps {
                // Générer la Javadoc
                script {
                    sh 'mvn javadoc:javadoc'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                // Lancer SonarScanner
                script {
                    withSonarQubeEnv('SonarQube Server') {
                        sh 'mvn sonar:sonar'
                    }
                }
            }
        }
    }
    
    post {
        success {
            // Actions à effectuer en cas de succès
            echo 'Le pipeline a réussi!'
        }
        failure {
            // Actions à effectuer en cas d'échec
            echo 'Le pipeline a échoué!'
        }
    }
}
