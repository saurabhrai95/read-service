pipeline {
  agent any
  stages {
    stage('CHECKOUT') {
      steps {
        git(url: 'https://github.com/saurabhrai95/helloworld-dummy.git', branch: 'master', changelog: true, credentialsId: '04c4fe5a-c72f-4e4f-8d7d-86fb3e798317')
        withSonarQubeEnv(installationName: 'sonarqube', credentialsId: '68c055b38f9034f36357777386367e12ac16642d') {
          waitForQualityGate(credentialsId: '68c055b38f9034f36357777386367e12ac16642d', abortPipeline: true)
        }

      }
    }
  }
  environment {
    JAVA_HOME = 'C:\\Users\\saurabh_rai\\Desktop\\OpenJDK8U-x64_windows_8u212b04\\openjdk-8u212-b04'
  }
}