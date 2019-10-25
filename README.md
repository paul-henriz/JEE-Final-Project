# JEE-Final-Project

This is the repository of our final project of JEE (Efrei M1 Software Engineering)

## Informations

Developers: [Nicolas GUIBERT](https://github.com/GuibertNicolas) & [Paul-Henri ZIMMERLIN](https://github.com/spirou1997)

IDE used to develop: NetBeans 8.1/8.2

## To-do

### Global features

1. Session management :
    - [x] There are 2 categories of users :
      - [x] Users with admin rights => login : admin password : admin
      - [x] Regular employees => login : empl & password : empl
    - [ ] Users logged in as employees cannot delete, modifiy or add
    - [ ] Users with admin rights can do any action
    - [x] Manage the user's session : the "login" action opens a standard Web session
    - [ ] On the upper right of each page (except 2 pages…) you’ll show :
      - [ ] "Hello <user> ! Your session is active"
      - [ ] An icon that allows the user to logout (leave the session)
      - [ ] Create a "Goodbye" page
      
2. Architecture & code structure roadmap :
    - [x] Loose coupling
    - [x] Separation of responsiblities
    - [x] MVC compliant (at least for V1 & V2)
    - [x] Unique servlet
    - [x] Entry point = servlet
    - [ ] Variables : Declaration => global / Initialization => local
    - [ ] Elegant and efficient management of exceptions
    
3. Documentation :
    - [ ] Javadoc style
    - [ ] As much useful comments as possible in your code
    
4. Database:
    - [x] Name : JEEPRJ
    - [x] User: jee
    - [x] Password: jee

### Version 1

- [ ] JSP (scriptlets accepted) + Java Beans + Servlet + JDBC
- [x] .properties file to store information about the database
- [x] SQL script in /WEB-INF
- [x] All the JSPs in /WEB-INF
- [x] DBMS : Java DB

### Version 2

- [ ] Maven project
- [ ] JSP (EL et JSTL only/ Please no Java code in your JSPs)
- [ ] Java Beans
- [ ] Servlet (optimized)
- [ ] Persistance with JPA
- [ ] DBMS : MySQL

### Version 3

- [ ] Use RESTful Web services
- [ ] DBMS : A remote solution
- [ ] Code quality: use Sonarqube & JUnit 
