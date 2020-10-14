# Test task
## This is a test_task_serv repo with mock_server, mysql and elasticsearch, which are for external-api server and db storage for test_task project.

------------

### How to run
1. Load the project test_task_serv.
2. Make sure 2300, 8080, 8090 and 3307 ports are free.
3. Open mock_serv project.
4. Build a jar file with 

    gradlew build

5. In folder where mock_serv folder and docker-compose.yml are, run 

    docker-compose up -build -d

6. Load and run test_task project
7. Make a get request with the following link http://localhost:8080/start
