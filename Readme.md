Here's an updated version of the README file with proper formatting and detailed steps:

# Project Name - Readme

## Introduction

This project provides steps to run the `datamigration-platformv2` application using Docker and Spark. Follow the instructions below to get started.

## Prerequisites

Make sure you have the following dependencies installed on your system:

- Docker
- Spark

## Getting Started

1. Clone the repository:

   ```shell
   git clone https://github.com/your-username/your-repo.git
   ```

2. Change into the project directory:

   ```shell
   cd your-repo
   ```

3. Start the Docker containers:

   ```shell
   docker-compose up
   ```

4. Access the Docker container:

   ```shell
   docker exec -it container-name bash
   ```

5. Create a `myjars` folder:

   ```shell
   mkdir myjars
   ```

6. Copy the JAR file from your local machine to the container:

   ```shell
   docker cp /path/to/datamigration-platformv2.jar container-name:/opt/bitnami/spark/myjars
   ```
In this case
   ```shell
   docker cp /home/prasoon/Downloads/datamigration-platformv2/out/artifacts/datamigration_platformv2_jar/datamigration-platformv2.jar f707edbdb93b:/opt/bitnami/spark/myjars
   ```

7. Run the Spark submit command:

   ```shell
   spark-submit --master local[*] --class com.its.project1.framework.jobs.controllers.Job1 /opt/bitnami/spark/myjars/datamigration-platformv2.jar
   ```

   Make sure to replace `container-name` with the actual name of your Docker container and `/path/to/datamigration-platformv2.jar` with the correct path to the JAR file on your local machine.

## Conclusion

Follow the steps provided in this README to set up and run the `datamigration-platformv2` application using Docker and Spark. For more information or troubleshooting, refer to the official documentation or contact the project maintainer.

Please note that the instructions provided assume a basic understanding of Docker, Spark, and command-line interfaces.
