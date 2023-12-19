## List Maker

A simple list maker application, and my very first React app. The Frontend was built using React, Javascript, CSS, and Bootstrap. The Backend was built using Java Springboot and MySQL.

## Project Status

This project is still currently in progress. Users can add and delete items to the list, which updates the MySQL database and shows on the page. Functionality to sort and edit items is in development. I also plan to add the functionality to create multiple lists.

## Project Screen Shot

![Alt text](image.png)

## Installation and Setup Instructions

Clone down this repository. You will need `node` and `npm` installed globally on your machine. You will also need XAMPP downloaded to be able to run Apache and MySQL. If these are not running the Backend of the application will not run.

XAMPP Download Link: https://www.apachefriends.org/download.html

Installation:

`npm install`

To Run Backend:

In the XAMPP Control Panel, make sure to have Apache and MySQL running for the Backend to work.
![image](https://github.com/tazim04/List-App/assets/35643104/3121e451-7788-4b5c-90ac-a8b57c26f8ed)


If you already have Maven installed on your computer with the maven enviornment PATH variable already set, you can simply open the CMD, cd into: Back-End -> listMaker, then run: `mvn clean install` then `mvn spring-boot:run`.

If you don't have maven enviornment PATH variable already set, you can also open the project in an IDE (I used Intellij Community Edition) and run the application from there. If you get a pop-up to import Maven please do so. To run the application, run the ListMakerApplication.java file.

To Run Frontend:

Make sure to cd into: Front-End -> list-app, then in the CMD run: `npm run dev`.

