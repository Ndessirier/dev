pipeline {
    agent any

    triggers {
        pollSCM('*/3 * * * *') // Déclencher toutes les 3 minutes si des changements sont détectés dans le SCM
    }

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

        stage('Javadoc') {
            steps {
                // Générer la Javadoc
                script {
                    sh 'mvn javadoc:javadoc'
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
