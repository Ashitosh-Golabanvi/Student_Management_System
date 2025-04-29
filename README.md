"Create the "application.properties" file and run the project".
In Application.properties You need to add mongodb url and localhost port number:
  * spring.data.mongodb.uri= mongodb+srv://root:[your_database_password]@cluster0.1yw0nnf.mongodb.net/[database_name]?retryWrites=true&w=majority&appName=Cluster0
  * server.port=[your_port_number]

url for testing: http://localhost:8080/api/students
    
