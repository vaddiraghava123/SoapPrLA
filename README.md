# Develop XSDs and Generate stubs and WSDL file.
-  Clean and build. To generate stub classes.
>
        gradlew clean build

# Generated Stubs under below folder
 >
 Source files :  
 
 >  [ProjectFolder]\build\generated-sources\jaxb\com\dt\rts\ladmv\services
 
 	Class files :
 
 >   [ProjectFolder]\build\classes\jaxb\com\dt\rts\ladmv\services
  
# Command To generate WSDL file.
>   gradlew bootrun
    
# Tomcat port change:   
	Go to [ProjectFolder]/src/resources/application.properties file and change the port as  
>   server.port=8888