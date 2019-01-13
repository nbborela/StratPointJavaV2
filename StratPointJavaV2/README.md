# StratPointJavaV2
This is StratPoint Application Developer Assessment for Java Developer. Simple application for viewing user profiles.

1. Application consumes [http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json](http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json).
2. Application exposes the profile list with /api/profiles.
3. Application exposes the profile info with /api/profiles/{id}.
4. Application home page /home.

## Technologies and Frameworks
* Front-end : HTML/CSS, Bootstrap, jQuery, datatables.js
* Back-end  : Spring Boot

## Server
* Apache Tomcat 8

## Installation and Deployment
* WAR file for deployment in tomcat already included
* Maven build package to create new WAR file