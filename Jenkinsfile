node {
    stage('Checkout') {
       git 'https://github.com/PSEH-4/CricAssesment-Prasenjit.git'
    }
    
    stage('Package') {
       sh "mvn clean package -DskipTests"
       sh "ls target"
    }

	stage('Docker build') {
       sh "docker build -t prasenjit/cricassesment:v1.0 ."
    }
    
    stage('Docker push') {
       sh "docker login -u prasenjit -p Arpita@2018"
       sh "docker push prasenjit/cricassesment:v1.0"
    }
    
    stage('Deploy to staging') {
    	sh "export DOCKER_HOST=tcp://18.216.246.227:2375"
    	sh "docker rm -f cricassesment || true"
        sh "docker run -d --rm -p 3000:8080 --name cricassesment prasenjit/cricassesment:v1.0"
    }
}
