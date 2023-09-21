pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out your source code from the repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build your project using Maven, Gradle, or other build tools
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run your tests using Maven, Gradle, or other testing frameworks
                sh 'mvn clean install'
            }
        }
    }

    post {
        always {
            // Archive test results
            junit '**/target/surefire-reports/*.xml'
        }

        success {
            // Send an email notification on success with an email report
            emailext subject: "Build Success - ${currentBuild.fullDisplayName}",
                body: """<p>The build was successful.</p>
                        <p>Here is the <a href="http://your-report-url.com">HTML report</a>.</p>""",
                to: 'pramodphutane02@gmail.com',
                mimeType: 'text/html',
                attachmentsPattern: '**/target/*.html'  // Specify the pattern for attaching HTML reports
        }

        failure {
            // Send an email notification on failure with an email report
            emailext subject: "Build Failure - ${currentBuild.fullDisplayName}",
                body: """<p>The build failed. Please check the Jenkins console output for details.</p>
                        <p>Here is the <a href="http://your-report-url.com">HTML report</a>.</p>""",
                to: 'pramodphutane02@gmail.com',
                mimeType: 'text/html',
                attachmentsPattern: '**/target/*.html'  // Specify the pattern for attaching HTML reports
        }
    }
}