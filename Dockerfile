# Use an official  runtime as a parent image
FROM java:8-jre

# Set the working directory to /app
WORKDIR /workflowte

# Copy the current directory contents into the container at /app
ADD . /workflowte

# Make port 80 available to the world outside this container
EXPOSE 8121

ENV HOMER="Hiiiiiiiiiiiiiiii sekhar"


# Run app.py when the container launches
CMD ["java","-jar","target/testJarFile-0.0.1-SNAPSHOT.jar"]
