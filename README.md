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
