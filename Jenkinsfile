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
}