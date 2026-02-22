pipeline{
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    sh '''
                        echo "Build stage"
                    '''
                }
            }
        }
        stage('Run Unit Tests') {
            steps {
                script {
                    sh '''
                        echo "Running unit tests"
                    '''
                }
            }
        }
        stage('SonarQube Code Scan') {
            steps {
                script {
                    sh '''
                        echo "Running SonarQube code scan"
                    '''
                }
            }
        }
        stage('Publish to Artifactory') {
            steps {
                script {
                    sh '''
                        echo "Publishing artifact to Artifactory"
                    '''
                }
            }
        }
    }
}