###  Develop XSDs 
- ######  Clean and build. To generate stub classes.

    >   gradlew clean build

- ###### Generated Stubs on below folders:  
 
    *Source files* :  
     
    >  [ProjectFolder]\build\generated-sources\jaxb\com\dt\rts\ladmv\services\\*.java
     
    *Class files* :
    >   [ProjectFolder]\build\classes\jaxb\com\dt\rts\ladmv\services\\*.class
  
- ###### Command To generate WSDL file.
    >   gradlew bootrun
    
- ###### Tomcat port change:  

	Go to [*Project Folder*]/src/resources/application.properties file and change the port as  
    >   server.port=8888

- ###### Finally how to get WSDL file ?

    >   'http://localhost:[*server.port*]/la/ladmvproxy.wsdl

  *Example*
    >   http://localhost:8888/la/ladmvproxy.wsdl        