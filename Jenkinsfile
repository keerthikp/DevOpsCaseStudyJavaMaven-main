pipeline {
    agent any
    
    tools {
        jdk 'jdk-11.0.16.1'
        maven 'maven3.9.9'
    }
    environment {
        CATALINA_HOME='C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0'
    }

    stages {
        
        stage('Build WAR') {
            steps {
                bat "mvn clean package -DskipTests"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Deploy to Tomcat') {
            steps {
                script {
                    bat 'copy "target\\*.war" "%CATALINA_HOME%\\webapps\\"'
                }
                
            }
        }
        stage('Restart Tomcat') {
            steps {
                script {
                    bat "net stop Tomcat9"
                    bat "net start Tomcat9"
                }
                
            }
        }
    }
}
