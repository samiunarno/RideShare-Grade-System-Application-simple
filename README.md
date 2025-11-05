# Java Projects Collection

Two complete Java applications for educational and transportation management.

## 📁 Projects Overview

### 🎓 Student Grade System
A comprehensive grading system for educational institutions.

### 🚗 RideShare Application
A taxi fare calculation and ride management system.

---

## 🎓 Student Grade System

### Quick Start
Features
Teacher Portal: Manage students and grades

Student Portal: View grades and performance

Secure Login: Role-based access control

Default Logins
Teacher: teacher1 / password123
Students: student1 / pass123

🚗 RideShare Application
Quick Start
Features
Fare Calculation: Day/night rate calculation

Distance-based Pricing: Tiered pricing system

Time-based Rates: Different rates for day and night

Fare Structure
Day Time (7:00-22:59):

Base: 10 YUAN

Additional: 1.9 YUAN/km after 4km

Night Time (23:00-6:59):

Base: 11 YUAN

Additional: 2.2 YUAN/km after 4km

🛠️ Installation
Prerequisites
Java JDK 8 or higher

Terminal/Command Prompt

Setup
Clone or download the project

Navigate to project directory

Compile Java files:
javac src/*.java
Run desired application:

bash
java -cp src GradeSystem      # For Grade System
java -cp src rideapp          # For RideShare
📁 Project Structure
text
Project/
├── src/
│   ├── GradeSystem.java    # Main grade system
│   ├── rideapp.java        # Main rideshare app  
│   ├── User.java          # User management
│   ├── Student.java       # Student operations
│   ├── Teacher.java       # Teacher operations
│   └── Taxicalc.java      # Taxi calculations
├── README.md
└── .gitignore
