pipeline {
        environment{
        registry="vishalrao7/scientific_calculator"
        registryCredential="docker_hub"
        dockerImage=""
    }
    agent any

    stages {
        stage('Git Clone') {
            steps {
                git branch:'master',url:'https://github.com/vishalraoPVR/SPE_miniProject.git'
            }
        }
        stage('Maven Build Stage'){
            steps{
                //maven clean and install to build the target folder
                sh "mvn clean install"
            }
        }
        stage("Building our Image"){
            steps{
                script{
                    
                    dockerImage = docker.build("vishalrao7/scientific_calculator:latest")
                }
            }
        }
            stage('Deploy our image') {
            steps{
            script {
            docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
            }
            }
            }
            }
          stage('Cleaning up') {
            steps{
            sh "docker rmi $registry"
                }
            }

        stage("Ansible Deploy"){
            steps{
                sh "ansible-playbook -i inventory playbook.yml"
            }
        }
    }
}
