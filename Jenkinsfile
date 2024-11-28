pipeline {
    agent any
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
                    bat "net stop Tomcat9.0"
                    bat "net start Tomcat9.0"
                }
                
            }
        }
    }
}
