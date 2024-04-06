node{
   def WORKSPACE = "/var/lib/jenkins/workspace/springboot-deploy"
   def dockerImageTage = "springboot-deploy${env.BUILD_NUMBER}"
   try{
     stage('Clone Repo'){
          git url: 'https://github.com/DhananjayBobde/springboot_deploy.git'
          credentialsId: 'springdeploy-user'
          branch: 'main'
     }

        stage('Build docker'){
              dockerImage = docker.build("springboot-deploy:${env.BUILD_NUMBER}")
          }
           stage('Deploy docker'){
                        echo "Docker Image Tag Name:${dockerImageTage}"
                        sh "docker stop springboot-deploy || true && docker rm springboot-deploy || true"
                        sh "docker run --name springboot-deploy -d -p 8001:8080 springboot-deploy:${env.BUILD_NUMBER}"
   }

   }
   catch(e){
   throw e
   }
}