CODE_CHANGES = true

pipeline {
    agent any
    environment {
        NEW_VERSION = '1.3.0'
    }
    stages{
        stage('build'){
            step{
                when{
                    expression {
                        BRANCH_NAME == 'master' || CODE_CHANGES ==true
                    }
                }

                echo 'Building the application'
            }
        }
        stage('test'){
            step{
                echo 'Testing the application'
            }
        }
        stage('deploy'){
            step{
                echo 'Deploying the application'
            }
        }
    }
}