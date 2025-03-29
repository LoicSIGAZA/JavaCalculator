pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                echo 'Cloning repository...'
                git 'https://github.com/LoicSIGAZA/JavaCalculator.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Running Maven clean and install to build the Java Calculator app...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests using Maven...'
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Simulating deployment: .jar file generated in target/ folder.'
            }
        }
    }

    post {
        always {
            echo 'Publishing test reports...'
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
