pipeline {
    agent any

    triggers {
        pollSCM('* * * * *') // Lance le pipeline toutes les 3 minutes en cas de changements dans le SCM
    }

    stages {
        stage('Vérifier la compilation') {
            steps {
                script {
                    // Assurez-vous d'ajuster la commande de compilation en fonction de votre projet
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Ne lance pas de tests') {
            steps {
                // Vous pouvez ajouter des étapes supplémentaires ici, par exemple, pour copier des rapports de test
            }
        }

        stage('Publier la Javadoc') {
            steps {
                script {
                    // Assurez-vous d'ajuster la commande de génération de la Javadoc en fonction de votre projet
                    sh 'mvn javadoc:javadoc'
                    // Assurez-vous d'ajuster la commande de publication de la Javadoc en fonction de votre projet
                    // Par exemple, utiliser un plugin Jenkins dédié ou copier les fichiers générés vers un serveur web
                }
            }
        }
    }
}
