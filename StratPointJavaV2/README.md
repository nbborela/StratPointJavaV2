# StratPointJavaV2
This is StratPoint Application Developer Assessment for Java Developer. Simple application for viewing user profiles.

1. Application consumes [http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json](http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json).
2. Application home page /home.
3. Application exposes the profile list with /api/profiles.
4. Application exposes the profile info with /api/profiles/{id}. 

## Technologies and Frameworks
* Front-end : HTML/CSS, Bootstrap, jQuery, datatables.js
* Back-end  : Spring Boot

## Server
* Apache Tomcat 8

## Installation and Deployment
* Maven build package to create new WAR file
* Deploy WAR file in apache tomcat