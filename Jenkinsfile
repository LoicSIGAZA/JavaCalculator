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
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
