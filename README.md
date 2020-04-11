

- Step-1: Visit sonarcloud.io and configure your account.
- Step-2: Connect the repository.
- Step-3: Generate token (https://sonarcloud.io/account/security/)
- Step-4: Add the following snippet in your pom.xml
	<properties>
		<sonar.projectKey>YOUR_PROJECT_KEY</sonar.projectKey>
		<sonar.organization>YOUR_ORGANIZZATION_NAME</sonar.organization>
		<sonar.host.url>https://sonarcloud.io</sonar.host.url>
		<sonar.login>GENERATED_TOKEN</sonar.login>
	</properties>
- Step-5: Make some changes in your code (local machine).
- Step-6: Push the code to git (git push ...)
- Step-7: Run the below command in your local machine from project root folder:
      mvn verify sonar:sonar
- Step-8: After verification, visit your projects in sonarcloud (https://sonarcloud.io/projects). You will see the SonarQube report. For example, the SonarQube report for this git repo is located at the below address:
  
SonarQube Report >> https://sonarcloud.io/organizations/codelovin-projects/projects
  
  
