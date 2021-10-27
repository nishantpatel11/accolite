CODE_CHANGES = true;

pipeline {
    agent any
    stages {
        stage("build"){
            steps {
                when {
                    expression {
                        BRANCH_NAME == 'master' || CODE_CHANGES == true
                    }
                }
                echo 'Building the application...'

            }
        }
        stage("test"){
            steps {
                echo 'Testing the application....'
            }
        }
        stage("deploy"){
            steps {
                echo 'Deploying the application...'
            }
        }
    }

    post {
        always {
            echo ' Post action perform .....'
        }

        success{
            echo ' Success action perform .....'
        }

        failure{
            echo ' Failure action perform .....'
        }
    }
}