
# Project:  Theater Messenger

- Start Date:  Tuesday, May 1st
- End Date:   Tuesday, May 15th

## Contributors:  
- **[Hadi Efatian](https://github.com/hadiefatian)**
- **[Alireza Asghari](https://github.com/alirezaasghari)**

We are both musicians, playing music in a band together since more than 10 years. One of us "Hadi Efatian" works as a sound engineer at theater. I experienced a lot of misunderstandings and difficulties while communicating with other sound engineers during the show. We both have been learning programming since nine months. So I decided to solve this problem by developing this application with Alireza.


### Project explanation:

This application makes the communication between a sound engineer and a sound assistant in a theater easier and more efficient by using data communication method instead of the voice communication.

### Project usage:

In a theater during the show, the sound engineer is continuously busy checking and mixing the sound sitting at the mixer which is placed normally behind the audience. On the other side, there is a sound assistant which is responsible for the microphones and other sound equipment being used by actors on the stage. This place is called micro port station which is placed near the stage. All the actors should go to this station and have their microphones installed on their face or body before the show. But during the show, there are several reasons that might cause problems to these mics which should be quickly fixed by the assistant. 
A sound engineer position is a good place for listening carefully to the show and informing the sound assistant whenever a problem occurs. This communication should be very short and fast so that the engineer is able to continue listening to the show. 
A common method is voice communication by using a radio set. One problem with this method is that the engineer should remove his main headphones and wear the radio headset which distracts him/her from listening to the show and doing other tasks. Another problem is that he/she has to talk quietly and fast to not disturb the audience which sometimes causes communication misunderstandings considering the assistant placement near the stage which is affected by the orchestra and actors loud sound monitoring on the stage.


This application solves these problems by having a list of actors on a screen in front of the sound engineer and a list of the common problems. He/she clicks on the actor and then on the related problem.  A message including the mic number, actor name, and the problem would be created and can be sent to the sound assistant. He/she would receive the message on a tablet and fix it.

### User’s manual:

Open the pom.xml file of the Theater Messenger project in an IDEA which supports Java 9, e.g. IntelliJ.
Enter your MySQL information in the application.properties file or use Docker for using your local database instead of MySQL.
Run the application and open your internet browser with localhost:8080 address.

On the homepage, you should select if you want to work as a sound engineer or an assistant. 
A sound engineer is able to create, edit or delete projects and send messages to the assistant. A sound assistant can only receive messages from the engineer.

If you have chosen to work as an engineer, you can create a new project or select an existing project.
To create a new project, enter the project name, start date, and end date into the new project field. Now that you have at least one project, press edit and start adding actors to that project by entering their first name, last name, role name and microphone number into the new actor field. You can also delete an actor or the whole project on this page. 

Now go to the projects list on sound engineer page and select a project. You’ll be forwarded to the create message page. To create a message, first, select a problem, then select the actor which is facing this problem. 

Now if you go to the sound assistant page, you will see the message there. Whenever the problem is fixed, the assistant should press “Problem Fixed” which will delete the message in the database.


### CS50 Project:
This project was part of the Harvard University CS50 course that we did.

**[Project's video link can be found here](https://youtu.be/_egpteNwMxc)**
