#####Documentation:
##Project:  Theater Messenger 

####Contributors:  Hadi Efatian - Alireza Asghari

- Start Date:  Tuesday, May 1st
- End Date:   Tuesday, May 15th

###Project explanation:

This application makes the communication between a sound engineer and a sound assistant in a theater easier and more efficient by using data communication method instead of the voice communication.

###User’s manual:

Open the pom.xml file of the Theater Messenger project in an IDEA which supports Java 9, e.g. IntelliJ.
Enter your MySQL information in the application.properties file or use Docker for using your local database instead of MySQL.
Run the application and open your internet browser with localhost:8080 address.

On the homepage, you should select if you want to work as a sound engineer or an assistant. 
A sound engineer is able to create, edit or delete projects and send messages to the assistant. A sound assistant can only receive messages from the engineer.

If you have chosen to work as an engineer, you can create a new project or select an existing project.
To create a new project, enter the project name, start date, and end date into the new project field. Now that you have at least one project, press edit and start adding actors to that project by entering their first name, last name, role name and microphone number into the new actor field. You can also delete an actor or the whole project on this page. 

Now go to the projects list on sound engineer page and select a project. You’ll be forwarded to the create message page. To create a message, first, select a problem, then select the actor which is facing this problem. 

Now if you go to the sound assistant page, you will see the message there. Whenever the problem is fixed, the assistant should press “Problem Fixed” which will delete the message in the database.
