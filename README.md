# Application is starting on port 8081. To run it, run UserApplication class.

# To create local mysql database
mysql -u root<br>
GRANT ALL PRIVILEGES ON \*.* TO 'root'@'localhost';<br>
CREATE DATABASE example;<br>
USE example;

# To create local postgres database using docker
docker pull postgres:11
docker run --name postgres-0 -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres
docker exec -it postgres-0 bash

## Inside cotainer
psql -h localhost -p 5432 -U postgres
CREATE DATABASE quiz;

### application.properties file for postgres
server.port=8081<br>
spring.jpa.hibernate.ddl-auto=update<br>
spring.datasource.url=jdbc:postgresql://localhost:5432/quiz<br>
spring.datasource.username=postgres<br>
spring.datasource.password=password<br>
logging.level.root=info<br>

<li>Be sure to not use `User` entity because in postgres this is keyword.<br></li>
<li>Change dependency in pom.xml from mysql to postgres</li>