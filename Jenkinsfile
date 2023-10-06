pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your Git repository
                git branch: 'main', url: 'https://github.com/pramodphutane/project_sep.git'
            }
        }

        stage('Test') {
            steps {
                // Run tests (if applicable)
                sh 'mvn clean test' // Modify this based on your testing framework
            }
        }
    }

    post {
        always {
                   emailext subject: 'Build Notification',
                       body: 'This is the email body.',
                       to: 'pramodphutane02@gmail.com',
                       from: 'testjenkins05@gmail.com',
                       replyTo: 'pramodphutane02gmail.com',
                       mimeType: 'text/plain'
               }
    }
}