# Spring Boot Google Cloud Project

A Java-based Spring Boot application built using Gradle and integrated with Google Cloud Platform (GCP).

## Overview

This project is a Spring Boot application developed using Java and Gradle. It is connected to Google Cloud Platform for cloud infrastructure, services, deployment, monitoring, and application management.

The project uses the Gradle Wrapper, so Gradle does not need to be installed separately on the development machine.

## Technology Stack

- Java 17+
- Spring Boot
- Gradle
- Google Cloud Platform (GCP)
- Google Cloud CLI
- Git

## Project Structure

```text
project-name/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/pharma/medicines/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── model/
│   │   │       └── Application.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application.yml
│   └── test/
│       └── java/
├── build.gradle
├── settings.gradle
├── gradle/
│   └── wrapper/
├── gradlew
├── gradlew.bat
├── .gitignore
└── README.md
```

> The actual project structure may vary depending on the application's requirements.

---

## Prerequisites

Before running the application, make sure the following are installed:

- Java 17 or later
- Git
- Google Cloud CLI
- A Google Cloud account
- Access to the required Google Cloud project

Gradle does not need to be installed separately because this project uses the Gradle Wrapper.

### Verify the Installation

Check the installed versions:

```bash
java -version
git --version
gcloud --version
```

---

## Google Cloud Configuration

This application can connect to a Google Cloud project to access Google Cloud services and deploy the application.

### Authenticate with Google Cloud

Run:

```bash
gcloud auth login
```

For local application development, configure Application Default Credentials:

```bash
gcloud auth application-default login
```

### Configure the Google Cloud Project

Set the active Google Cloud project:

```bash
gcloud config set project YOUR_PROJECT_ID
```

Verify the configured project:

```bash
gcloud config get-value project
```

Replace `YOUR_PROJECT_ID` with your actual Google Cloud Project ID.

---

## Application Configuration

Application configuration can be maintained in:

```text
src/main/resources/application.properties
```

or:

```text
src/main/resources/application.yml
```

### Example `application.properties`

```properties
spring.application.name=spring-gcp-project

server.port=8080

spring.cloud.gcp.project-id=${GOOGLE_CLOUD_PROJECT_ID}
```

Set the Google Cloud project ID using an environment variable.

### Linux / macOS

```bash
export GOOGLE_CLOUD_PROJECT_ID=YOUR_PROJECT_ID
```

### Windows PowerShell

```powershell
$env:GOOGLE_CLOUD_PROJECT_ID="YOUR_PROJECT_ID"
```

---

## Google Cloud Credentials

Do not commit Google Cloud credentials, service account keys, passwords, API keys, or other sensitive information to the Git repository.

For local development, use:

```bash
gcloud auth application-default login
```

For production deployments, use Google Cloud service identities and appropriate IAM permissions instead of storing credentials directly in the source code.

---

## Gradle Wrapper

This project uses the Gradle Wrapper.

The Gradle Wrapper allows the project to use the Gradle version defined by the project without requiring Gradle to be installed globally.

### Linux / macOS

Make sure the Gradle Wrapper is executable:

```bash
chmod +x ./gradlew
```

Check the Gradle version:

```bash
./gradlew --version
```

### Windows

Check the Gradle version:

```powershell
.\gradlew.bat --version
```

---

## Build the Application

### Linux / macOS

```bash
./gradlew clean build
```

### Windows

```powershell
.\gradlew.bat clean build
```

### Build Without Running Tests

Linux / macOS:

```bash
./gradlew clean build -x test
```

Windows:

```powershell
.\gradlew.bat clean build -x test
```

After a successful build, the generated JAR file will normally be available under:

```text
build/libs/
```

---

## Run the Application

### Linux / macOS

```bash
./gradlew bootRun
```

### Windows

```powershell
.\gradlew.bat bootRun
```

By default, the application will be available at:

```text
http://localhost:8080
```

---

## Run the JAR File

Build the application:

```bash
./gradlew clean build
```

The generated JAR file will normally be located inside:

```text
build/libs/
```

Run the JAR file:

```bash
java -jar build/libs/application-name.jar
```

Replace `application-name.jar` with the actual generated JAR file name.

---

## Running Tests

Run all tests:

### Linux / macOS

```bash
./gradlew test
```

### Windows

```powershell
.\gradlew.bat test
```

Run a specific test:

```bash
./gradlew test --tests "com.example.project.ExampleTest"
```

---

## Clean the Project

### Linux / macOS

```bash
./gradlew clean
```

### Windows

```powershell
.\gradlew.bat clean
```

---

## Google Cloud Services

Depending on the requirements of the application, the project can integrate with Google Cloud services such as:

- Cloud Run
- Cloud Storage
- Cloud SQL
- Firestore
- Pub/Sub
- Secret Manager
- Artifact Registry
- Cloud Logging
- Cloud Monitoring

Only enable and configure the Google Cloud services that are required by the application.

---

## Deploying to Google Cloud

The application can be deployed to Google Cloud using services such as Cloud Run.

### Build the Application

```bash
./gradlew clean build
```

### Build a Docker Image

If the project contains a `Dockerfile`, build the Docker image:

```bash
docker build -t spring-gcp-project .
```

### Tag the Docker Image

```bash
docker tag spring-gcp-project \
REGION-docker.pkg.dev/YOUR_PROJECT_ID/YOUR_REPOSITORY/spring-gcp-project:latest
```

### Push the Image to Artifact Registry

```bash
docker push \
REGION-docker.pkg.dev/YOUR_PROJECT_ID/YOUR_REPOSITORY/spring-gcp-project:latest
```

### Deploy to Cloud Run

```bash
gcloud run deploy spring-gcp-project \
  --image REGION-docker.pkg.dev/YOUR_PROJECT_ID/YOUR_REPOSITORY/spring-gcp-project:latest \
  --region YOUR_REGION \
  --platform managed
```

Replace the following values with your actual Google Cloud configuration:

```text
YOUR_PROJECT_ID
YOUR_REPOSITORY
YOUR_REGION
```

---

## IAM Permissions

The application should use the minimum Google Cloud IAM permissions required for its functionality.

Avoid granting broad permissions such as:

```text
Owner
Editor
```

unless they are specifically required.

Prefer service-specific IAM roles for resources such as:

- Cloud Run
- Cloud Storage
- Cloud SQL
- Secret Manager
- Pub/Sub
- Firestore

---

## Security

Never commit sensitive information to Git.

Do not commit files containing:

```text
*.key
*.pem
*.p12
*.env
*credentials*.json
*service-account*.json
```

Do not store the following directly in the source code:

- Passwords
- API keys
- Access tokens
- Service account credentials
- Database credentials
- Other sensitive configuration

Use environment variables or Google Cloud Secret Manager for sensitive configuration.

---

## Recommended `.gitignore`

The project should contain a `.gitignore` file similar to the following:

```gitignore
# Gradle
.gradle/
build/
!gradle/wrapper/gradle-wrapper.jar

# IDE
.idea/
*.iml
.vscode/
.classpath
.project
.settings/

# Logs
*.log
logs/

# Environment files
.env
.env.*

# Credentials and secrets
*.key
*.pem
*.p12
*credentials*.json
*service-account*.json

# OS files
.DS_Store
Thumbs.db
```

---

## Environment Variables

The application may use the following environment variables depending on its configuration:

```text
GOOGLE_CLOUD_PROJECT_ID
GOOGLE_APPLICATION_CREDENTIALS
DATABASE_URL
DATABASE_USERNAME
DATABASE_PASSWORD
```

Only configure the environment variables required by the application.

> Never commit production credentials or sensitive environment variables to the repository.

---

## Google Cloud Project Commands

### Authenticate

```bash
gcloud auth login
```

### Configure Application Default Credentials

```bash
gcloud auth application-default login
```

### List Google Cloud Projects

```bash
gcloud projects list
```

### Set the Active Project

```bash
gcloud config set project YOUR_PROJECT_ID
```

### Check the Active Project

```bash
gcloud config get-value project
```

### List Enabled APIs

```bash
gcloud services list --enabled
```

### Get Project Information

```bash
gcloud projects describe YOUR_PROJECT_ID
```

---

## Logging

For local development, application logs are displayed in the application console.

When deployed to Google Cloud, logs can be viewed using Google Cloud Logging.

Example:

```bash
gcloud logging read \
  "resource.type=cloud_run_revision" \
  --limit=50
```

---

## Health Check

If Spring Boot Actuator is enabled, the application health endpoint is:

```text
http://localhost:8080/actuator/health
```

Example response:

```json
{
  "status": "UP"
}
```

---

## Troubleshooting

### Check Java Version

```bash
java -version
```

Make sure Java 17 or later is installed.

### Check Gradle Version

Linux / macOS:

```bash
./gradlew --version
```

Windows:

```powershell
.\gradlew.bat --version
```

### Check Google Cloud Authentication

```bash
gcloud auth list
```

### Check the Current Google Cloud Project

```bash
gcloud config get-value project
```

### Re-authenticate with Google Cloud

```bash
gcloud auth login
```

For local application credentials:

```bash
gcloud auth application-default login
```

### Check Enabled Google Cloud APIs

```bash
gcloud services list --enabled
```

If a required API is not enabled:

```bash
gcloud services enable API_NAME
```

Replace `API_NAME` with the required Google Cloud API.

---

## Development Workflow

The typical development workflow is:

1. Clone the repository.
2. Configure Java.
3. Authenticate with Google Cloud.
4. Configure the required Google Cloud project.
5. Configure environment variables.
6. Build the application using Gradle.
7. Run the application locally.
8. Run the tests.
9. Make the required changes.
10. Commit the changes.
11. Push the changes to the repository.
12. Deploy the application to Google Cloud when required.

### Example

```bash
git clone YOUR_REPOSITORY_URL

cd YOUR_PROJECT_DIRECTORY

gcloud auth login

gcloud config set project YOUR_PROJECT_ID

./gradlew clean build

./gradlew bootRun
```

---

## Git Workflow

### Create a Feature Branch

```bash
git checkout -b feature/my-feature
```

### Check Current Changes

```bash
git status
```

### Add Changes

```bash
git add .
```

### Commit Changes

```bash
git commit -m "Add my feature"
```

### Push the Branch

```bash
git push origin feature/my-feature
```

---

## Google Cloud Project Cleanup

Before deleting or shutting down a Google Cloud project, verify that the project is not being used by other applications, users, databases, storage buckets, or other cloud resources.

If the project is no longer required, it can be shut down from the Google Cloud Console.

> Project deletion may affect all resources associated with the project. Make sure any required data and resources have been backed up before shutting down the project.

---

## License

Add the appropriate license for the project.

Example:

```text
Copyright © 2026 Your Organization
```

---

## Maintainer

**Your Name**

### GitHub

```text
YOUR_GITHUB_PROFILE
```

### Email

```text
YOUR_EMAIL
```

---

## Contributing

Contributions are welcome.

To contribute:

1. Fork the repository.
2. Create a feature branch.
3. Make your changes.
4. Run the tests.
5. Commit your changes.
6. Push the branch.
7. Create a Pull Request.

Before submitting changes, run:

```bash
./gradlew clean test
```

---

## Support

For issues related to the application, create an issue in the project repository.

For Google Cloud configuration issues, verify:

```bash
gcloud auth list
gcloud config get-value project
gcloud services list --enabled
```

---

## Summary

This project provides a Spring Boot Java application built with Gradle and integrated with Google Cloud Platform.

The general architecture is:

```text
Developer
    |
    v
Spring Boot Application
    |
    v
Gradle Build
    |
    v
Google Cloud Platform
    |
    +-- Cloud Run
    +-- Cloud Storage
    +-- Cloud SQL
    +-- Firestore
    +-- Pub/Sub
    +-- Secret Manager
    +-- Artifact Registry
    +-- Cloud Logging
    +-- Cloud Monitoring
```

Update the following project-specific values before committing this README:

- `YOUR_PROJECT_ID`
- `YOUR_REPOSITORY`
- `YOUR_REGION`
- `YOUR_REPOSITORY_URL`
- `YOUR_PROJECT_DIRECTORY`
- `YOUR_GITHUB_PROFILE`
- `YOUR_EMAIL`
- `Your Name`
- `Your Organization`

---

**Built with Java + Spring Boot + Gradle + Google Cloud Platform.**
