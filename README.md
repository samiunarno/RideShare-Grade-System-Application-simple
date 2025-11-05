🧩 PROJECT 1: Grade System
🎓 Overview

Grade System is a console-based Java application designed to help students and teachers manage academic grades efficiently.
It features secure login, automatic letter grade conversion, average score computation, and flexible grade management menus for both students and teachers.

✨ Features
👨‍🎓 Student

Login and access own grades

Calculate average marks

View letter grade equivalents

Interactive grade conversion checker

👩‍🏫 Teacher

View all student grades

Add new grades to students

Display conversion rules

Grade validation and conversion checker

🧮 Letter Grade Scale
Range	Letter
70–100	A
60–69	B
50–59	C
0–49	F
🗂 Project Structure
GradeSystem/
├── GradeSystem.java
├── Student.java
├── Teacher.java
├── User.java
└── README.md

🚀 How to Run
Prerequisites

Java JDK 8 or newer

Terminal or IDE (IntelliJ, Eclipse, VS Code)

Steps
# 1. Clone the repository
git clone https://github.com/yourusername/GradeSystem.git
cd GradeSystem

# 2. Compile
javac GradeSystem.java User.java Student.java Teacher.java

# 3. Run
java GradeSystem

🔑 Demo Credentials
Role	Username	Password
Student	student1	12345
Teacher	teacher1	11111
Admin	admin	12345
📈 Example Output
=== Welcome to the Grade System ===
Username: student1
Password: 12345
Login Successful! Welcome student

Student Dashboard
1. View My Grades
2. Calculate Average Grades
3. View Grades with Letter Conversion
4. Grade Conversion Checker
5. Logout

🧱 Classes Summary
Class	Description
User	Handles login and user roles
Student	Stores student details and grades
Teacher	Manages subjects and grading
GradeSystem	Main class controlling menus and logic
💡 Future Enhancements

Add database or file storage

GUI interface using JavaFX

Admin dashboard with user management

Export grades as CSV or PDF

🪪 License

This project is licensed under the MIT License
.

🚗 PROJECT 2: Ride Share App
🏁 Overview

Ride Share App is a console-based fare estimation and payment simulation system.
It calculates fares based on distance and time of day, applies surcharges for long trips, and supports multiple payment methods including membership discounts.

✨ Features

Interactive fare calculation based on distance and hour

Detects daytime vs nighttime rides

Applies 10% high-mileage surcharge for rides > 20 km

Supports multiple payment methods:

💵 Cash

💳 Card

🟩 WeChat

🟦 Alipay

🪪 Membership (5% discount)

Input validation for distance, time, and payment

Option to book multiple trips in one session

💰 Fare Logic
Rule	Description
Base fare	Calculated by rideshare.calculateFare()
> 20 km	+10% surcharge
Membership	5% discount
Invalid distance/time	Handled gracefully with validation
🗂 Project Structure
RideApp/
├── rideapp.java
├── rideshare.java
└── README.md

🚀 How to Run
Prerequisites

Java JDK 8 or newer

Terminal or any IDE

Steps
# 1. Clone the repository
git clone https://github.com/yourusername/RideShareApp.git
cd RideShareApp

# 2. Compile
javac rideapp.java rideshare.java

# 3. Run
java rideapp

💻 Example Usage
Welcome to Ride Share App
--------------------------------
Tip: enter distance in kilometers and hour in 24-hour format (0-23).

--- New Trip Calculation ---
Enter Distance in KM :
25
Enter Start Hour (0-23) :
10
High mileage surcharge applied (10%): +$3.00

--- Trip Summary ---
Distance: 25.00 km
Hour: 10
Time: Day Time
Estimated Fare: $33.00

Select Payment Method:
1. Cash
2. Card
3. WeChat
4. Alipay
5. Membership

🧱 Main Classes
Class	Description
rideapp	Handles user interaction, inputs, and menu flow
rideshare	Contains fare calculation and payment processing logic
💡 Future Improvements
Add driver and user profiles
Integrate real-time fare prediction (e.g., surge pricing)
Add receipt export (PDF or CSV)
Support Google Maps API for distance/time estimation
Create a GUI (Swing/JavaFX) version

🪪 License

This project is licensed under the MIT License.