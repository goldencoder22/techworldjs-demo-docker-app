pipeline{
    agent any

    parameters {
        choice(name: 'version', choices:['1.0', '2.0', '3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: false, description: '')
    }

    stages {

        stage('build') {
            steps{
                echo 'Building!!!'
               // echo "Building version ${NEW_VERSION}"
            }
        }
        
        stage('test') {
            when {
                expression {
                    // Execute only if executeTests parameter is set to true
                     params.executeTests
                }
            }
            steps {
                echo 'Testing!!!'
            }
        }
        
        stage('deploy') {
            steps {
                echo "Deploying ${params.version} ......."
                /*echo "Deploying with ${SERVER_CREDENTAILS}"
                sh "${SERVER_CREDENTAILS}"*/

                /* Wrapper Syntax of getting credentials from Jenkins agent
                withCredentials(
                    [usernamePassword(credentials: 'deploy-test-server-credentials',
                     usernameVariable: USER,
                      passwordVariable: PASSWORD)]){
                        sh "${USER} ${PASSWORD}"
                }*/
            }
        }
        
        stage('release') {
            steps{
                echo 'Releasing!!!'
            }
        }
    }
}
