📌Meetup App Automation Testing Project
🧪 Meetup App Test Automation (Selenium + TestNG + Page Object Model)

This project automates the UI and functional testing of the Meetup Web Application
🔗 Application URL: https://qameetup.ccbp.tech/

The test suite is developed using Page Object Model (POM) design pattern with Selenium WebDriver, Java, and TestNG.

🏗 Project Structure
src
 └── test
     └── java
         ├── pages
         │     ├── WelcomePage.java
         │     └── RegistrationPage.java
         ├── tests
               ├── WelcomePageTest.java
               └── RegistrationPageTest.java

🎯 Project Objective

To validate UI and functionality of the Meetup App using Selenium automation including:
1 UI validation of elements
2 Page navigation testing
3 Form validation
4 Multiple dataset-based input testing
5 Assertion based verification

💡 Test Scenarios
🏠 Welcome Page Tests
Test Case	Description
UI Verification	Validate app logo, heading, description and image
Navigation	Validate navigation to Registration page when clicking Register button

📝 Registration Page Tests
Test Case	Description
UI Verification	Validate logo, form labels, page heading and register image
Empty Name Validation	Validate error message for missing name input
Valid Input Registration	Dataset-driven input testing for names and topics

🧪 Dataset Used
Name	Option Value	Option Text
Jack	ARTS_AND_CULTURE	Arts and Culture
Jerry	CAREER_AND_BUSINESS	Career and Business
John	EDUCATION_AND_LEARNING	Education and Learning
Jim	FASHION_AND_BEAUTY	Fashion and Beauty
Jane	GAMES	Games

🔧 Tools & Technologies
Tool	Purpose
Selenium WebDriver	UI automation
TestNG	Test execution & reporting
Java	Programming language
Maven	Build tool & dependency management
Page Object Model (POM)	Test design pattern
ChromeDriver	Browser driver
         

