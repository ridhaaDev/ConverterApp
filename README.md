# ConverterApp
Simple api to convert from imperial units of measurement to metric.

What you need to get the Api up and running:
-Java installed with environment variables set up(JAVA_HOME) and added to path.
-(Unfortunately)An IDE such as NetBeans or Eclipse.
-Web browser
-port 8080 to be unused

As of now, the only way to run it is inside an IDE such as NetBeans or eclipse, using the "Run as" button.
If you encounter an error, add "work.boot:spring-boot-maven-plugin:1.3.2.RELEASE:run" as your runtime goal.

Once the api is launched, hit "localhost:8080". The correct response is "Hello World".

After that, check out the routes:
localhost:8080/convertCmToInches/(insert a number here)
localhost:8080/convertMetersToFeet/(insert a number here)
localhost:8080/convertKmToMiles/(insert a number here)

Coming soon:
front-end
reverse conversion
Docker environment for easier deployment
Live deployment 
(Once the developer gets access to developer environment)
