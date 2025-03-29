pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                echo ' Cloning repository from GitHub...'
                // Jenkins does this automatically when job is configured
            }
        }

        stage('Build') {
            steps {
                echo ' Running Maven build...'
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo ' Running unit tests...'
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo ' Simulating deployment (JAR ready)'
                // In real case, copy files or deploy to server
            }
        }
    }

    post {
        always {
            echo ' Archiving test results...'
            junit '**/target/surefire-reports/*.xml'
        }
    }
}

}
