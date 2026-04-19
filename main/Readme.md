#  Project Title: Feedback Submission System
##  Student Information
**Student Name:** Aruuke Kenzhalieva
## Project Description
The Feedback Submission System is a simple Java console application that allows users to submit, view, update, and delete feedback entries.
The system stores all feedback data in a CSV file, enabling persistent storage between program runs. The project is structured using Object-Oriented Programming principles and is divided into packages for better organization (model, service, util, main).
##  Objectives
The main goals of this project are:
- To implement a simple feedback management system using Java
- To apply Object-Oriented Programming principles (classes, objects, encapsulation)
- To practice working with Java Collections (ArrayList)
- To learn file handling using CSV format for data storage and retrieval
- To structure the project using packages for better code organization
- To demonstrate basic CRUD (Create, Read, Update, Delete) operations
- To build a functional console-based application that simulates real-world systems
##  Features
- Add new feedback
- View all feedback entries
- Update existing feedback
- Delete feedback by index
- Automatic saving and loading from CSV file
##  Data Storage
All feedback data is stored in a CSV file:

Format:
Name,Message
Aruuke,the service in this cafe is absolutely gorgeous
Eldar,it was bot. i'm still very angry with service !
##  How to Run
1. Open the project in IntelliJ IDEA
2. Run the `Main.java` file
3. Use the console menu to interact with the system
##  Technologies Used
- Java
- File Handling (CSV)
- OOP Principles
- Collections (ArrayList)
- Scanner for input
##  Documentation
###  Data Structures Used
This project uses the following data structures:
- **ArrayList<Feedback>**
    - Stores all feedback entries in memory
    - Allows dynamic resizing and easy iteration
- **CSV File Storage**
    - Used for persistent data storage
    - Data is saved in `name,message` format
###  Algorithms and Logic
- **CRUD Operations Algorithm**
    - Create: Add new feedback to ArrayList and save to file
    - Read: Load all feedback from CSV file
    - Update: Modify feedback by index
    - Delete: Remove feedback by index
- **File Handling Algorithm**
    - Read file line by line using BufferedReader
    - Split each line using comma separator
    - Convert each line into Feedback objects
    - Write updated list back to CSV file
###  Functions / Modules Used
- `FeedbackService`
    - Handles all business logic (add, update, delete, get)
- `FileManager`
    - Handles reading/writing CSV file
- `Main`
    - Handles user interaction and menu system
- `Feedback`
    - Model class representing a single feedback entry
###  Challenges Faced
- It was difficult at first to understand how to work with files in Java
- I had to learn how to connect different parts of the project (main, service, file)
- I forgot how to work CSV, but then I learn it. 
##  Test Cases and Outputs

### Main Menu
![Menu and add Feedback.png](../../screenshots/Menu%20and%20add%20Feedback.png)

### Add Feedback
![Menu and add Feedback.png](../../screenshots/Menu%20and%20add%20Feedback.png)

### View Feedback
![View and Update Feedback.png](../../screenshots/View%20and%20Update%20Feedback.png)

### Update Feedback
![View and Update Feedback.png](../../screenshots/View%20and%20Update%20Feedback.png)

### Delete Feedback
![delete Feedback.png](../../screenshots/delete%20Feedback.png)

### CSV File Output
![feedback.csv.png](../../screenshots/feedback.csv.png)
### Exit
![Exit.png](../../screenshots/Exit.png)
##  Presentation 
https://github.com/iansdusns/FeedbackSubmissionSystem/blob/master/OOP%20project%20Feedback.pptx
