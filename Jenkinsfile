pipeline {
    agent any

    tools {
        jdk 'java'
        maven 'maven3'
    }

    stages {
 
        stage('Build'){
            steps {
                sh 'printenv'
                sh 'mvn clean package'
 
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker-compose -f docker-compose.yml up -d --build --remove-orphans '
            }
        }
    }
}
