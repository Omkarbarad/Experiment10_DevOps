# Step 1: Use Tomcat with Java 11 as base image
FROM tomcat:9.0-jdk11

# Step 2: Remove default Tomcat web apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Step 3: Set working directory
WORKDIR /usr/local/tomcat/webapps

# Step 4: Copy the WAR file built by Maven into Tomcat
COPY target/DevOpsApp-1.0-SNAPSHOT.war ROOT.war

# Step 5: Expose port 8080
EXPOSE 8080

# Step 6: Start Tomcat when container runs
CMD ["catalina.sh", "run"]