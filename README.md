Project Title: Feedback Submission System
Student Information
Student Name: Aruuke Kenzhalieva

Project Description
The Feedback Submission System is a simple Java console application that allows users to submit, view, update, and delete feedback entries. The system stores all feedback data in a CSV file, enabling persistent storage between program runs. The project is structured using Object-Oriented Programming principles and is divided into packages for better organization (model, service, util, main).

Objectives
The main goals of this project are:

To implement a simple feedback management system using Java
To apply Object-Oriented Programming principles (classes, objects, encapsulation)
To practice working with Java Collections (ArrayList)
To learn file handling using CSV format for data storage and retrieval
To structure the project using packages for better code organization
To demonstrate basic CRUD (Create, Read, Update, Delete) operations
To build a functional console-based application that simulates real-world systems
Features
Add new feedback
View all feedback entries
Update existing feedback
Delete feedback by index
Automatic saving and loading from CSV file
Data Storage
All feedback data is stored in a CSV file:

Format: Name,Message Aruuke,the service in this cafe is absolutely gorgeous Eldar,it was bot. i'm still very angry with service !

How to Run
Open the project in IntelliJ IDEA
Run the Main.java file
Use the console menu to interact with the system
Technologies Used
Java
File Handling (CSV)
OOP Principles
Collections (ArrayList)
Scanner for input
Documentation
Data Structures Used
This project uses the following data structures:

ArrayList
Stores all feedback entries in memory
Allows dynamic resizing and easy iteration
CSV File Storage
Used for persistent data storage
Data is saved in name,message format
Algorithms and Logic
CRUD Operations Algorithm
Create: Add new feedback to ArrayList and save to file
Read: Load all feedback from CSV file
Update: Modify feedback by index
Delete: Remove feedback by index
File Handling Algorithm
Read file line by line using BufferedReader
Split each line using comma separator
Convert each line into Feedback objects
Write updated list back to CSV file
Functions / Modules Used
FeedbackService
Handles all business logic (add, update, delete, get)
FileManager
Handles reading/writing CSV file
Main
Handles user interaction and menu system
Feedback
Model class representing a single feedback entry
Challenges Faced
It was difficult at first to understand how to work with files in Java
I had to learn how to connect different parts of the project (main, service, file)
I forgot how to work CSV, but then I learn it.
Test Cases and Outputs
Main Menu
Menu and add Feedbackpng <img width="1920" height="1080" alt="Menu and add Feedback" src="https://github.com/user-attachments/assets/849a9196-9c5b-44df-ba0b-898f723a713e" />


Add Feedback
Menu and add Feedbackpng <img width="1920" height="1080" alt="Menu and add Feedback" src="https://github.com/user-attachments/assets/dd2792c1-1a69-4086-a45f-60289a46f290" />


View Feedback<img width="1920" height="1080" alt="View and Update Feedback" src="https://github.com/user-attachments/assets/5b75516d-2075-447b-976c-034f2dfc0571" />

View and Update Feedbackpng

Update Feedback
View and Update Feedbackpng <img width="1920" height="1080" alt="View and Update Feedback" src="https://github.com/user-attachments/assets/f70f6f73-fae0-499e-a697-0e209626aa43" />


Delete Feedback
delete Feedbackpng<img width="1920" height="1080" alt="delete Feedback" src="https://github.com/user-attachments/assets/d8d9b45c-fb3c-431f-b2b7-539b36fc238b" />


CSV File Output<img width="1920" height="1080" alt="feedback csv" src="https://github.com/user-attachments/assets/87536666-e999-4dc1-b1a2-73a6cb372a32" />

feedbackcsvpng

Exit
Exitpng<img width="1920" height="1080" alt="Exit" src="https://github.com/user-attachments/assets/834f656b-aec8-4ddc-91ec-cc4fafe6e781" />


Presentation
https://github.com/iansdusns/FeedbackSubmissionSystem/blob/master/OOP%20project%20Feedback.pptx
