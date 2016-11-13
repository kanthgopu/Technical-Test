# How to Run

  - command line 
        mvn clean test -Dbrowser=firefox -Durl=http://localhost:3003
  - IntellJ
    - Runner file in place 
    - note go to run > edit config > in vm option apply this "-Dbrowser=firefox  -Durl=http://localhost:3003 "
  
# Tools & Framework Used 

- Maven 
- Cucumber 
- Hamcrest
- Selenium
- Junit 
- Java
- Page Object Model and Page Factory


## NOTE 
Make sure you do 
docker build, compose up before you run tests 
