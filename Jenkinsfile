pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test package'
            }
        }

        parameters {
            booleanParam(
                name: 'RUN_UI_TESTS',
                defaultValue: false,
                description: 'Run Selenium UI tests'
            )
        }

        stage('UI Tests (Selenium)') {
            when {
                expression { return params.RUN_UI_TESTS }
            }
            steps {
                sh 'mvn -B verify -DskipUnitTests=true'
            }
        }
    }
}




