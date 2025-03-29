pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/LoicSIGAZA/JavaCalculator.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
