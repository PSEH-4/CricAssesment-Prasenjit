node {
    stage('Checkout') {
       git 'https://github.com/PSEH-4/CricAssesment-Prasenjit.git'
    }stage('Package') {
       sh "mvn clean package -DskipTests"
    }stage('Docker build') {
       sh "docker build -t prasenjit/cricasses:v1.0 ."
    }stage('Docker push') {
       sh "docker login -u prasenjit -p Arpita@2018"
       sh "docker push prasenjit/cricasses:v1.0"
    }
    stage('Deploy to staging') {
        sh "docker run -d --rm -p 8080:8080 --name cricasses prasenjit/cricasses:v1.0"
    }

}