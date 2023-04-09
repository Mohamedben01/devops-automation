pipeline {
   agent any
   tools {
      maven: "maven_3_9_1"
   }
   stages {
      stage("build") {
          steps {
             echo "building the application..."
             sh 'mvn clean install'
          }
      }
       stage("test") {
           steps {
              echo "testing the application..."
           }
       }
      stage("deploy") {
          steps {
              echo "deploying the application..."
          }
      }
   }

}