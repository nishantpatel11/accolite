CODE_CHANGES = true

pipeline {
    agent any
    environment {
        NEW_VERSION = '1.3.0'
    }
    stages{
        stage("build"){
            steps {
//                 when{
//                     expression {
//                         BRANCH_NAME == 'master' || CODE_CHANGES ==true
//                     }
//                 }

                echo 'Building the application ....'
            }
        }
        stage("test"){
            steps {
                echo 'Testing the application ....'
            }
        }
        stage("deploy"){
            steps {
                echo 'Deploying the application .....'
            }
        }
    }

    post{
        always{
            echo 'Post Action perform the application........'
        }
        success{
            echo 'Build success ..........'
        }
        failure{
            echo 'Build failure ........'
        }
    }
}