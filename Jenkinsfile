pipeline{
    agent any

    /*
    Used to define environment varibales for the Jenkinsfile
    environment{
        NEW_VERSION = '1.0'
        // SERVER_CREDENTAILS = credentials('deploy-test-server-credentials')
    }
    */

    // Provide access to build tools for projects
    /*
    tools{
        maven   'Maven' // Name of the tool in global configuration tool
    }
    */
    // Parameters
    parameters{
        // string(name: 'version', defaultValue: '', description: 'version to deploy on production')
        choice(name: 'version', choices:['1.0', '2.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages{
        stage('build'){
            steps{
                echo 'Building!!!'
               // echo "Building version ${NEW_VERSION}"
            }
        }
        
        stage('test'){
            when{
                expression{
                    // Execute only if executeTests parameter is set to true
                     params.executeTests
                }
            }
            steps{
                echo 'Testing!!!'
            }
        }
        
        stage('deploy'){
            steps{
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
        
        stage('release'){
            steps{
                echo 'Releasing!!!'
            }
        }
    }

    // Exceute some logic after all stages executed
    post{
            /*
                Conditions: always, succees, failure
            */
            // Always executed whether success or failure
        always{

        }

        success{

        }

        failure{

        }
    }
}
