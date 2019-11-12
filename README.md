# JEE-Final-Project

This is the repository of our final project of JEE (Efrei M1 Software Engineering)

## Informations

Group 5
Developers: [Nicolas GUIBERT](https://github.com/GuibertNicolas) & [Paul-Henri ZIMMERLIN](https://github.com/spirou1997)

IDE used to develop: NetBeans 8.1/8.2


[![Build Status](https://dev.azure.com/paul-henrizimmerlin/JEE-EFREI/_apis/build/status/spirou1997.JEE-Final-Project?branchName=master)](https://dev.azure.com/paul-henrizimmerlin/JEE-EFREI/_build/latest?definitionId=4&branchName=master)

Delivered:
- Full V1 version
- Full V2 version
- Partial V3
    - JUnit test are partially implemented
    - We use a remote database (hosting in dedicated server on Online.net (by Scaleway))
    - We have implemented the REST API, but it's not used by JSPs


Presentation:
Each group 10 (presentation) + 10 (Q&A) min
Starting at 8:05
No sequence

Plan:
1. Make a dynamic original presentation of your project
a) The structure (packages, special files, ...)
b) The architecture (M.V.C pattern, any suprise(s)?, where is located the remote db, remote deployment ...)
2. What did you learn from/while doing this project? (Unique servlet architecture ...)
3. What is the most difficult aspect of the project?

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
    - [x] Elegant and efficient management of exceptions
    
3. Documentation :
    - [x] Javadoc style
    - [x] As much useful comments as possible in your code
    
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

- [x] Use RESTful Web services (Partial)
- [x] DBMS : A remote solution
- [x] Code quality: use Sonarqube & JUnit (Partial: only JUnit tests)
