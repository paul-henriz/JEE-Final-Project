# JEE-Final-Project

This is the repository of our final project of JEE (Efrei M1 Software Engineering)

## Informations

Developers: [Nicolas GUIBERT](https://github.com/GuibertNicolas) & [Paul-Henri ZIMMERLIN](https://github.com/spirou1997)

IDE used to develop: NetBeans 8.1/8.2


[![Build Status](https://dev.azure.com/paul-henrizimmerlin/JEE-EFREI/_apis/build/status/spirou1997.JEE-Final-Project?branchName=master&jobName=Job)](https://dev.azure.com/paul-henrizimmerlin/JEE-EFREI/_build/latest?definitionId=4&branchName=master)


## To-do

### Global features

1. Session management :
    - [x] There are 2 categories of users :
      - [x] Users with admin rights => login : admin password : admin
      - [x] Regular employees => login : empl & password : empl
    - [x] Users logged in as employees cannot delete, modifiy or add
    - [x] Users with admin rights can do any action
    - [x] Manage the user's session : the "login" action opens a standard Web session
    - [x] On the upper right of each page (except 2 pages…) you’ll show :
      - [X] "Hello <user> ! Your session is active"
      - [x] An icon that allows the user to logout (leave the session)
      - [x] Create a "Goodbye" page
      
2. Architecture & code structure roadmap :
    - [x] Loose coupling
    - [x] Separation of responsiblities
    - [x] MVC compliant (at least for V1 & V2)
    - [x] Unique servlet
    - [x] Entry point = servlet
    - [x] Variables : Declaration => global / Initialization => local
    - [ ] Elegant and efficient management of exceptions
    
3. Documentation :
    - [ ] Javadoc style
    - [ ] As much useful comments as possible in your code
    
4. Database:
    - [x] Name : JEEPRJ
    - [x] User: jee
    - [x] Password: jee

### Version 1

- [x] JSP (scriptlets accepted) + Java Beans + Servlet + JDBC
- [x] .properties file to store information about the database
- [x] SQL script in /WEB-INF
- [x] All the JSPs in /WEB-INF
- [x] DBMS : Java DB

### Version 2

- [x] Maven project
- [x] JSP (EL et JSTL only/ Please no Java code in your JSPs)
- [x] Java Beans
- [x] Servlet (optimized)
- [x] Persistance with JPA
- [x] DBMS : MySQL

### Version 3

- [ ] Use RESTful Web services
- [x] DBMS : A remote solution
- [ ] Code quality: use Sonarqube & JUnit 
