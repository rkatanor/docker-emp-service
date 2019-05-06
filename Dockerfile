From tomcat:8
RUN rm -rf /usr/local/tomcat/webapps/*
RUN cp ./target/empservice.war /usr/local/tomcat/webapps/emp.war
CMD ["catalina.sh","run"]
