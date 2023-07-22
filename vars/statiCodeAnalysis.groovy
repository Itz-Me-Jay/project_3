def call(credentialsId){
    // sonarqube-api change as per ur credentials details which provided in jenkins> configure system > sonarqube section
    // credentials need to pass in call section  , replacing with sonarqube-api
    withSonarQubeEnv(credentialsId: credentialsId) {
    sh 'mvn clean package sonar:sonar'
    }
}
