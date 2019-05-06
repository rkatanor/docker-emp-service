From tomcat:8.0.51-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
RUN cp ./target/empservice.war /usr/local/tomcat/webapps/emp.war
CMD ["catalina.sh","run"]
