SONAR_TOKEN=5dfabcc2ca36e0698588365a0091fb48be487b24
mvn clean package
/opt/devops/sonar/sonar-scanner-4.7.0.2747-linux/bin/sonar-scanner -Dproject.settings=./sonar-project.properties
