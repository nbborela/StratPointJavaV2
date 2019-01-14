# StratPointJavaV2
This is StratPoint Application Developer Assessment for Java Developer. Simple application for viewing user profiles. Application consumes [http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json](http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json).

## RequestMapping
1. Application home page.

* [/home]()


2. Application return list of all profiles.

* [/api/profiles]()


3. Application return a single profile with its details, parameter: id - String, profile_id. 

* [/api/profiles/{id}]()


## Technologies and Frameworks
* Front-end : HTML/CSS, Bootstrap, jQuery, datatables.js
* Back-end  : Spring Boot - MVC, REST, Jackson-DataBind

## Server
* Apache Tomcat 8

## Installation and Deployment
* Copy project to local
* Maven build package to create new WAR file
* Access Tomcat Server
* Deploy WAR file to the tomcat server
* Test home page