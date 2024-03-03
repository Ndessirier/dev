pipeline {
    agent any
    
    tools {maven "maven-3.5.2"}
    
    stages {
        stage('Checkout'){
            steps{
                git branch: 'dev', url :'https://github.com/Ndessirier/dev.git'
            }
        }
        
        stage('Build'){
            steps{
                sh 'mvn compile'
            }
        }
        
        stage('Javadoc'){
            steps{
                sh 'mvn javadoc:javadoc'
            }
        }
        
    }
}
