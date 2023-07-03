# Versioning Project Demo - Common Models

This project holds basic common data models for the weater service.<br>
* `WindDirection` - Enum of wind directions.
* `WeatherStatus` - Data model for weather response.
These models are shared between server and client as REST API.

This project uses Java 17 and Gradle 8.1.1.

## Usage

### Clone
Repository URL: https://github.com/guyafe/common-models-java

## Gradle Usage

### Build

Using the command `gradle build` will create a jar artifact in the `build/libs` directory.<br>
Depending on the current branch:
* If the current branch is main, the artifact will be named _\<major\>_._\<minor\>_._\<patch\>_
* If the current branch is not main, the artifact will be named _\<major\>_._\<minor\>_._\<branch\>_-_SNAPSHOT_ 

### Publish
In order to publish this artifact, and have it available for other repositories, use the command `gradle publishToMavenLocal`.<br>
* If the current branch is main:
  1. The task will publish the artifact into local repository (usually in `~/.m2/repository`).
  2. Next, the task will check if the branch is clean (no uncommitted changes).. If so, it will bump the _minor_ version and commit the change with **[NO CI]** message.
* If the current branch is not main, the task will publish the artifact into local repository.
