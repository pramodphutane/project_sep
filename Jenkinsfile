pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your Git repository
                git branch: 'main', url: 'https://github.com/pramodphutane/project_sep.git'
            }
        }

        stage('Build') {
            steps {
                // Build a Java project (replace with your build tool)
                sh 'mvn clean package' // Assuming you use Maven
            }
        }

        stage('Test') {
            steps {
                // Run tests (if applicable)
                sh 'mvn test' // Modify this based on your testing framework
            }
        }
    }

    post {
        success {
            // Notify or perform actions on successful build
            echo 'Build successful! Deploying...'
        }
        failure {
            // Notify or perform actions on build failure
            echo 'Build failed! Notify someone...'
        }
    }
}