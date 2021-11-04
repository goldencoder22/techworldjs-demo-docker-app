def initBuild(){
    echo 'Building the application ...'
}

def initTest(){
    echo 'Testing the application ...'
}

def initDeploy(){
    echo 'Deploying the application ...'
}

def initRelease(){
    echo "Releasing the version ${params.version} of the application ..."
}

return this
