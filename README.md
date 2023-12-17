## List Maker

A simple list maker application. The front-end was built using React, Javascript, CSS, and Bootstrap. The back-end was built using Java Springboot and MySQL.

## Project Status

This project is still currently in progress. Users can add and delete items to the list, which updates the MySQL database and shows on the page. Functionality to sort and edit items is in development.

## Project Screen Shot

![Alt text](image.png)

## Installation and Setup Instructions

Clone down this repository. You will need `node` and `npm` installed globally on your machine. You will also need XAMPP downloaded to be able to run Apache and MySQL. If these are not running the application will not run.

Installation:

`npm install`

To Run Back-End:

If you already have Maven installed on your computer with the maven enviornment PATH variable already set, you can simply cd into the listMaker folder within the Back-End folder and run: `mvn clean install` then `mvn spring-boot:run`.

If you don't open an IDE (I used Intellij Community Edition) and run the application from there. If you get a pop-up to import Maven please do so. To run the application, run the ListMakerApplication.java file.

To Run Front-End:

Make sure to cd into list-app within the Front-End folder, then in the CMD run: `npm run dev`.

