# Develop XSDs and generate stubs and WSDL file.
#clean and build. To generate stub classes.

  gradlew clean build


#Command To generate WSDL file.

  gradlew bootrun
  
  
#Tomcat port change : go to src/resources/application.properties file and change the port as server.port=8888