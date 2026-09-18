# Spring Boot Google Cloud Project

A Java-based Spring Boot application built using Gradle and integrated with Google Cloud Platform (GCP).

## Overview

This project is a Spring Boot application developed using Java and Gradle. It is connected to Google Cloud Platform for cloud infrastructure, services, deployment, monitoring, and application management.

## Technology Stack

- Java 17+
- Spring Boot
- Gradle
- Google Cloud Platform (GCP)
- Google Cloud SDK
- Git

## Prerequisites

Before running the application, make sure the following are installed:
Java 17 or later
GitGoogle Cloud CLI
A Google Cloud account

Access to the required Google Cloud project

Gradle does not need to be installed separately if the project contains the Gradle Wrapper.

Check the installed versions:
java -version
git --version
gcloud --version

## Google Cloud Configuration
This application can be connected to a Google Cloud project for accessing Google Cloud services and deploying the application.

Authenticate with Google Cloud
Run:

gcloud auth login

For local application development, configure Application Default Credentials:

gcloud auth application-default login

## Configure the Google Cloud Project
Set the active Google Cloud project:

gcloud config set project YOUR_PROJECT_ID

Verify the configured project:

gcloud config get-value project

Replace YOUR_PROJECT_ID with your actual Google Cloud Project ID.

## Application Configuration
Configure the application using application.properties or application.yml.

Example:
spring.application.name=spring-gcp-project
server.port=8080
spring.cloud.gcp.project-id=${GOOGLE_CLOUD_PROJECT_ID}
Set the Google Cloud project ID as an environment variable.

Linux / macOS
export GOOGLE_CLOUD_PROJECT_ID=YOUR_PROJECT_ID

Windows PowerShell
$env:GOOGLE_CLOUD_PROJECT_ID="YOUR_PROJECT_ID"

Google Cloud Credentials
Do not commit Google Cloud credentials, service account keys, passwords, API keys, or other sensitive information to the Git repository.

For local development, use:

gcloud auth application-default login

For production deployments, use Google Cloud service identities and IAM permissions instead of storing credentials in the source code.

## Gradle Wrapper
This project uses the Gradle Wrapper.

The Gradle Wrapper allows the project to use the Gradle version defined by the project without requiring Gradle to be installed globally.

Linux / macOS
Make sure the Gradle Wrapper is executable:

chmod +x ./gradlew

Then verify Gradle:

./gradlew --version

Windows
Use:

.\gradlew.bat --version

Build the Application
Linux / macOS
./gradlew clean build

Windows
.\gradlew.bat clean build

To build without running tests:

Linux / macOS
./gradlew clean build -x test

Windows
.\gradlew.bat clean build -x test

Run the Application
Linux / macOS
./gradlew bootRun

Windows
.\gradlew.bat bootRun

By default, the application will be available at:

http://localhost:8080

Run the JAR File
Build the application:

./gradlew clean build

The generated JAR file will normally be located inside:

build/libs/

Run the JAR:

java -jar build/libs/application-name.jar

Replace application-name.jar with the actual JAR file name.

Running Tests
Run all tests:

Linux / macOS
./gradlew test

Windows
.\gradlew.bat test

Run a specific test:

./gradlew test --tests "com.example.project.ExampleTest"

Clean the Project
Linux / macOS
./gradlew clean

Windows
.\gradlew.bat clean

## Google Cloud Services
Depending on the requirements of the application, the project can integrate with Google Cloud services such as:

Cloud Run
Cloud Storage
Cloud SQL
Firestore
Pub/Sub
Secret Manager
Artifact Registry
Cloud Logging
Cloud Monitoring

Only enable and configure the Google Cloud services required by the application.

Deploying to Google Cloud
The application can be deployed to Google Cloud using services such as Cloud Run.

Build the Application
./gradlew clean build

Build a Docker Image
If the project contains a Dockerfile, build the Docker image:

docker build -t spring-gcp-project .

Tag the Docker Image
docker tag spring-gcp-project \
REGION-docker.pkg.dev/YOUR_PROJECT_ID/YOUR_REPOSITORY/spring-gcp-project:latest

Push the Image to Artifact Registry
docker push \
REGION-docker.pkg.dev/YOUR_PROJECT_ID/YOUR_REPOSITORY/spring-gcp-project:latest

Deploy to Cloud Run
gcloud run deploy spring-gcp-project \
--image REGION-docker.pkg.dev/YOUR_PROJECT_ID/YOUR_REPOSITORY/spring-gcp-project:latest \
--region YOUR_REGION \
--platform managed

Replace:

YOUR_PROJECT_ID
YOUR_REPOSITORY
YOUR_REGION

with your actual Google Cloud configuration.

IAM Permissions
The application should use the minimum Google Cloud IAM permissions required for its functionality.

Avoid granting broad permissions such as:

Owner
Editor

unless they are specifically required.

Use service-specific IAM roles for resources such as:

Cloud Run
Cloud Storage
Cloud SQL
Secret Manager
Pub/Sub
Firestore
Security
Never commit sensitive information to Git.

Do not commit files containing:

*.key
*.pem
*.p12
*.env
*credentials*.json
*service-account*.json

Do not store passwords, API keys, tokens, or service account credentials directly in the source code.

Use environment variables or Google Cloud Secret Manager for sensitive configuration.

Recommended .gitignore
Example .gitignore:

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

Environment Variables
The application may use the following environment variables:

GOOGLE_CLOUD_PROJECT_ID
GOOGLE_APPLICATION_CREDENTIALS
DATABASE_URL
DATABASE_USERNAME
DATABASE_PASSWORD

Only configure the variables required by the application.

Never commit production credentials to the repository.

Google Cloud Project Commands
Login
gcloud auth login

Application Default Credentials
gcloud auth application-default login

List Google Cloud Projects
gcloud projects list

Set the Active Project
gcloud config set project YOUR_PROJECT_ID

Check the Active Project
gcloud config get-value project

List Enabled APIs
gcloud services list --enabled

Get Project Information
gcloud projects describe YOUR_PROJECT_ID

Logging
For local development, application logs are displayed in the application console.

When deployed to Google Cloud, logs can be viewed using Google Cloud Logging.

Example:

gcloud logging read \
"resource.type=cloud_run_revision" \
--limit=50

Health Check
If Spring Boot Actuator is enabled, the application health endpoint is:

http://localhost:8080/actuator/health

Example response:

{
  "status": "UP"
}

Troubleshooting
Check Java Version
java -version

Make sure Java 17 or later is installed.

Check Gradle Version
Linux / macOS:

./gradlew --version

Windows:

.\gradlew.bat --version

Check Google Cloud Authentication
gcloud auth list

Check Current Google Cloud Project
gcloud config get-value project

Re-authenticate
gcloud auth login

For local application credentials:

gcloud auth application-default login

Check Enabled Google Cloud APIs
gcloud services list --enabled

If a required API is not enabled:

gcloud services enable API_NAME

Replace API_NAME with the required Google Cloud API.

Development Workflow
Clone the repository.

Configure Java.

Authenticate with Google Cloud.

Configure the required Google Cloud project.

Configure environment variables.

Build the application using Gradle.

Run the application locally.

Run the tests.

Make the required changes.

Commit the changes.

Push the changes to the repository.

Deploy the application to Google Cloud when required.

Example:

git clone YOUR_REPOSITORY_URL

cd YOUR_PROJECT_DIRECTORY

gcloud auth login

gcloud config set project YOUR_PROJECT_ID

./gradlew clean build

./gradlew bootRun

Git Workflow
Create a feature branch:

git checkout -b feature/my-feature

Check the current changes:

git status

Add changes:

git add .

Commit changes:

git commit -m "Add my feature"

Push the branch:

git push origin feature/my-feature

Google Cloud Project Cleanup
Before deleting or shutting down a Google Cloud project, verify that the project is not being used by other applications, users, databases, storage buckets, or other cloud resources.

If the project is no longer required, it can be shut down from the Google Cloud Console.

Project deletion may affect all resources associated with the project.

License
Add the appropriate license for the project.

Example:

Copyright © 2026 Your Organization

Maintainer
Your Name

GitHub:

YOUR_GITHUB_PROFILE

Email:

YOUR_EMAIL

Contributing
Contributions are welcome.

To contribute:

Fork the repository.

Create a feature branch.

Make your changes.

Run the tests.

Commit your changes.

Push the branch.

Create a Pull Request.

Before submitting changes, run:

./gradlew clean test

## Project Structure

```text
project-name/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/project/
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
