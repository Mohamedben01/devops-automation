pipeline {
   agent any
   tools {
     maven 'maven_3_9_1'
   }
   stages {
      stage("build") {
          steps {
             echo "building the application..."
             sh 'mvn clean install'
          }
      }
       stage("build docker image") {
           steps {
              echo "building docker image..."
              sh 'docker build -t mohamed01ben/devops-integration-jenkins .'
           }
       }
      stage("deploy") {
          steps {
              echo "deploying the application..."
          }
      }
   }

}