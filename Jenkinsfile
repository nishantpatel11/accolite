CODE_CHANGES = true

pipeline {
    agent any
    tools {
            maven 'Maven 3.8.3'
            jdk 'jdk8'
    }
    environment {
        NEW_VERSION = '1.3.0'
    }
    stages{
        stage ('Initialize') {
            steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                    '''
            }
        }
        stage("build"){
            when{
                expression {
                    BRANCH_NAME == 'master' || CODE_CHANGES ==true
                   }
                }
            steps {
                echo 'Building the application ....'
                sh 'mvn -Dmaven.test.failure.ignore=true install'
                echo 'Building the application has completed ......'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
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