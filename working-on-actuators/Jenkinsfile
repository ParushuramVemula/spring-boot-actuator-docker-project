pipeline{
    // agent{
    //     label "node"
    // }
    agent any

    environment {
        APP_NAME="BasicApplicationOnJenkins"
        APP_VERSION='1.0'
    }
    stages{
        stage("printing user defined variables in stage1"){
            steps{
                echo "Checkingout code from GIT repository"
                echo "Appplication name is ${APP_NAME}"
                echo "Application version is ${env.APP_VERSION}"
            }
            
        }
        //http://localhost:8081/env-vars.html/ will show all the global environment variables present
           stage("printing global variable in stage 2"){
            steps{
                echo "printing Global environme varialbe : BUILD_NAME ${BUILD_DISPLAY_NAME}"
                 echo "printing Global environme varialbe : JENKINS_URL ${JENKINS_URL}"
                
            }
            
        }
    }    


}