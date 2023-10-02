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
                sh 'mvn clean install' // Modify this based on your testing framework
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