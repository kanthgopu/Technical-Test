# How to Run

  - command line 
        mvn clean test -Dbrowser=firefox -Durl=http://localhost:3003
  - IntellJ
    - Runner file in place 
    - Note: go to run > edit config > in vm option apply this "-Dbrowser=firefox  -Durl=http://localhost:3003 "
  
# Tools & Framework Used 

- Docker Tool Box
- Maven 
- Cucumber 
- Hamcrest
- Selenium
- Junit 
- Java
- Page Object Model and Page Factory


## NOTE 
Make sure you do 
docker build, docker compose up before you run tests 

docker-compose down && docker-compose up
