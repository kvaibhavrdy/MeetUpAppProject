Project Title

Meetup App Test Automation Using Selenium with Page Object Model

Project Overview

This project automates the testing of the Meetup Web Application available at:
🔗 https://qameetup.ccbp.tech/

The goal is to validate the UI and Functionality of both Welcome Page and Registration Page using Selenium WebDriver, TestNG, and Page Object Model (POM).

The project includes:

Page classes for each page (WelcomePage, RegistrationPage)

Test classes executing ordered TestNG test cases

Assertions for validations

UI verification & functional testing

Dataset-based test execution

The test suite is developed using Page Object Model (POM) design pattern with Selenium WebDriver, Java, and TestNG.

🏗 Project Structure


src
 └── test
     └── java
         ├── pages
         │    ├── WelcomePage.java
         │    └── RegistrationPage.java
         └── tests
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
| Test Name                  | Description                                         |
| -------------------------- | --------------------------------------------------- |
| UI verification            | Check app logo, heading, description & Meetup image |
| Register button navigation | Validate navigation to registration page            |


📝 Registration Page Tests
| Test Name                   | Description                                             |
| --------------------------- | ------------------------------------------------------- |
| UI verification             | Verify heading, images, name & topic labels             |
| Empty input validation      | Verify error message                                    |
| Valid input dataset testing | Validate navigation & personalized Welcome page message |


🧪 Dataset Used
| Name  | Option Value           | Topic Text             |
| ----- | ---------------------- | ---------------------- |
| Jack  | ARTS_AND_CULTURE       | Arts and Culture       |
| Jerry | CAREER_AND_BUSINESS    | Career and Business    |
| John  | EDUCATION_AND_LEARNING | Education and Learning |
| Jim   | FASHION_AND_BEAUTY     | Fashion and Learning   |
| Jane  | GAMES                  | Games                  |


🔧 Tools & Technologies
| Technology         | Description                  |
| ------------------ | ---------------------------- |
| Selenium WebDriver | Browser automation           |
| TestNG             | Test execution & assertions  |
| Page Object Model  | Test structure & reusability |
| Java               | Programming language         |
| Maven              | Dependency management        |
| ChromeDriver       | Browser driver               |

         

