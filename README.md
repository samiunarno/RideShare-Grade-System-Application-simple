RideShare Grade System Application
A Java-based student grading system application that allows teachers to manage student grades and students to view their academic performance.

📋 Prerequisites
Before running this application, make sure you have the following installed:

Java Development Kit (JDK) 8 or higher

Git (for cloning the repository)

🔧 Checking Java Installation
Open your terminal/command prompt and type:

bash
java -version
javac -version
If you see version information, Java is installed. If not, download and install JDK from Oracle's website or OpenJDK.

📥 Download and Installation
Method 1: Download ZIP (Recommended for Beginners)
Download the Project

Click on the green "Code" button on the GitHub repository page

Select "Download ZIP"

Extract the ZIP file to your desired location

Navigate to Project Directory

bash
cd Downloads/RideShare-Grade-System-Application-simple-main
Method 2: Using Git Clone
Clone the Repository

bash
git clone https://github.com/your-username/RideShare-Grade-System-Application-simple.git
Navigate to Project Directory

bash
cd RideShare-Grade-System-Application-simple
🚀 How to Run the Application
Step 1: Compile the Java Files
Open terminal/command prompt in the project directory and run:

bash
# Compile all Java files
javac src/*.java
This will create .class files in the src/ directory.

Step 2: Run the Application
bash
# Run the main application
java -cp src GradeSystem
Or if you're in the src directory:

bash
cd src
java GradeSystem
👥 Default Login Credentials
The application comes with demo data. Use these credentials to login:

Teacher Account:
Username: teacher1

Password: password123

Student Accounts:
Student 1: student1 / pass123

Student 2: student2 / pass123

Student 3: student3 / pass123

🎯 Features
For Teachers:
View all students and their grades

Add new students to the system

Update student grades

Calculate class statistics

For Students:
View personal grades

Check academic performance

View grade summaries

📁 Project Structure
text
RideShare-Grade-System-Application-simple/
├── src/
│   ├── GradeSystem.java    # Main application class
│   ├── User.java          # Base user class
│   ├── Teacher.java       # Teacher functionality
│   ├── Student.java       # Student class
│   └── (other .java files)
├── .gitignore
└── README.md
🛠️ Troubleshooting
Common Issues:
"javac not found" error

Solution: Install JDK and set JAVA_HOME environment variable

"Could not find or load main class"

Solution: Make sure you're running from the correct directory and compiled successfully

Permission denied errors

Solution: Run terminal as administrator or use sudo (Mac/Linux)

Compiling Individual Files (if needed):
bash
javac src/GradeSystem.java
javac src/User.java
javac src/Teacher.java
javac src/Student.java
📞 Support
If you encounter any issues:

Check that all Java files are in the src/ directory

Verify Java is properly installed

Ensure you're running commands from the correct directory

📝 License
This project is for educational purposes.

Happy Coding! 🎉
