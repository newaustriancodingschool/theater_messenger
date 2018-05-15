#####Design Document:

##Project:  Theater Messenger 

####Contributors:  Hadi Efatian - Alireza Asghari

- Start Date:  Tuesday May 1st.
- End Date:   Tuesday May 15th.


###Project design:

In a theater during the show, the sound engineer is continuously busy checking and mixing the sound sitting at the mixer which is placed normally behind the audience. On the other side, there is a sound assistant which is responsible for the microphones and other sound equipment being used by actors on the stage. This place is called micro port station which is placed near the stage. All the actors should go to this station and have their microphones installed on their face or body before the show. But during the show, there are several reasons that might cause problems to these mics which should be quickly fixed by the assistant. 
A sound engineer position is a good place for listening carefully to the show and informing the sound assistant whenever a problem occurs. This communication should be very short and fast so that the engineer is able to continue listening to the show. 
A common method is voice communication by using a radio set. One problem with this method is that the engineer should remove his main headphones and wear the radio headset which distracts him/her from listening to the show and doing other tasks. Another problem is that he/she has to talk quietly and fast to not disturb the audience which sometimes causes communication misunderstandings considering the assistant placement near the stage which is affected by the orchestra and actors loud sound monitoring on the stage.


This application solves these problems by having a list of actors on a screen in front of the sound engineer and a list of the common problems. He/she clicks on the actor and then on the related problem.  A message including the mic number, actor name, and the problem would be created and can be sent to the sound assistant. He/she would receive the message on a tablet and fix it.


The application is designed mostly in dark-red and gold colors which are common colors seen in a classic theater hall. 



###Used Technologies:

GitHub for a more efficient and secure way of coding in a team. 
Java 9 with IntelliJ IDEA for writing the backend code.
The Spring Framework for Java with the dependencies of:
Web for creating a web application
MySQL for a database having several tables without duplication
JPA for connecting to MySQL
H2 for test 
Thymeleaf as a Java web template engine  
Security for adding username and password
Bootstrap for front-end templates and libraries
HTML5, CSS, JavaScript for front-end design


###The second milestone of the project:

The next step of this project development is to separate the two pages of sound engineer and sound assistant so that they can access the application on two devices. The engineer has access to everything from his/her computer but the assistant has access only to the sound assistant page on his/her tablet.
