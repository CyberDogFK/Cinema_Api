<h1 align="center">
    <img alt="cinema_logo" src="/.github/cinema_logo.webp">
</h1>

 <h1 align="center"> :movie_camera: Cinema API :movie_camera: </h1>
<h2 align="center">Solution for you cinema</h2>

## 	:mag_right: About

<table>
<tr>
<td>

The server application, written in Java and Spring, 
is prepared for use in the backend of a cinema web application. 
It implements the most necessary functions for such an application:
- logging in new users and saving them in the database
- management of films, cinemas, and movie sessions
- a custom ticket cart, the user has the opportunity to purchase a ticket for a certain movie screening in a certain auditorium

All information is received and sent in JSON format, 
which allows you to use any appearance for this API that the front-end team can implement

</td>
</tr>
</table>


## :memo: Management

Only the administration has access to the most sensitive and important endpoints.
The administrator has the ability to view the list of registered users, 
can control the available sinemas, add movies, and set sessions for them

## :link: Architecture

This project uses n-tier architecture

| Tier        | Description                                        |
|-------------|----------------------------------------------------|
| Dao         | Responsible for connection with database.          |
| Service     | Responsible for business-logic                     |
| Controllers | Responsible for responding on HTTP-methods         |
| Filters     | Responsible for authentication and authorization.  |

## :abacus: Technologies

| Stack           | Description                                                                               |
|-----------------|-------------------------------------------------------------------------------------------|
| Java 11         | One of the best standard                                                                  |
| Project Lombok  | Reduces the amount of written code and reduces the possibility of errors                  |
| Spring Core     | To ensure better performance, thanks to IoC container                                     |
| Spring WEB      | Convenient libraries, for working with HTTP methods                                       |
| Spring Security | Authentication and authorization control                                                  |
| Hibernate       | Is used to ensure the edge of working with databases.                                     |
| MySQl           | During the creation of this API was used MySQL,<br/> which I recommend you to use as well |
| Tomcat          | Convenient servlet container and web server                                               |

## :rocket: How to start

1. Download the repository to your computer
2. In the db.properties file in the /src/resources folder,
change the dependencies to your own, connecting the database.
3. Run with Tomcat. If you are working with the project through IntelliJ IDEA,
then in the top menu, select the startup configuration through Tomcat 
(in the server settings menu, you can select the 'war exploded' deployment artifact)









## :bust_in_silhouette:	Security

Security is provided by the Spring framework and the authentication system on the site.
All sensitive data is transmitted and stored in the database in encrypted form. 
Also, n-tier architecture adds security to this application. 
So the user can not worry about the safety of his purchases.


## :reminder_ribbon: Support

For any questions and suggestions for improvement, 
you can contact the address:<br>
<a href="mailto:anton.pavliuk20@gmail.com">Anton Pavliuk</a>  

