pipeline {
  agent any
  stages {
    stage('CHECKOUT') {
      steps {
        git(url: 'https://github.com/saurabhrai95/read-service.git', branch: 'master', changelog: true, credentialsId: '04c4fe5a-c72f-4e4f-8d7d-86fb3e798317')
      }
    }
  }
  environment {
    JAVA_HOME = 'C:\\Users\\saurabh_rai\\Desktop\\OpenJDK8U-x64_windows_8u212b04\\openjdk-8u212-b04'
  }
}