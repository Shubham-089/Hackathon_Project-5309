# Tutorials Ninja E-Commerce Testing Project

## **Overview**
The **Tutorials Ninja** platform is an e-commerce website offering a diverse range of products such as electronics, fashion, home goods, and more. This project focuses on both **manual** and **automated testing** to ensure the platform is fully functional and provides a seamless user experience.

## **Key Features**

### **Testing Scope**
-🔍 Usability Testing
-Ensure the platform is user-friendly, intuitive, and efficient for browsing, managing the cart, and completing checkout.
-✅ Functionality Testing
-Test all core features, including registration, login, product browsing, cart management, and checkout.
-⚡ Performance Testing
-Simulate high traffic (e.g., sales events) and evaluate load times, stability, and scalability.
-🔒 Security Testing
-Conduct a full security audit to identify vulnerabilities and ensure data protection.
-🌐 Compatibility Testing
-Test across multiple devices and browsers to ensure consistency and accessibility.
-🤖 Manual and Automation Testing
-📝 Manual Testing
-Perform exploratory testing to identify usability issues and edge cases.
-Validate workflows manually, focusing on critical features like login, product search, cart management, and checkout.


### **Expanded Functionalities**
1. **User Registration and Login**
2. **Product Browsing and Display**
3. **Search Functionality**
4. **Cart Management**
5. **Checkout Process**
6. **Order History**
7. **Account Management (Update Details)**
8. **Promo Codes and Discounts**
9. **Multi-Currency Support**
10. **Mobile and Cross-browser Compatibility**
11. **Security Features**
12. **Error Handling**

## **Technologies Used**
- **Programming Language**: Java
- **Automation Framework**: Selenium WebDriver with Cucumber and POM (Page Object Model)
- **TestNG/JUnit**: For test execution and reporting
- **Build Tool**: Maven
- **Version Control**: Git

## **Project Structure**
```
TutorialsNinjaProject
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── Pages         # Page Object Model classes
│   │   └── resources
│
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── StepDefinitions
│   │   │   ├── TestRunner   # Runner classes
│   │   │   └── Utilities    # Utility classes
│   │   └── resources
│
├── pom.xml                   # Maven dependencies
└── README.md                 # Project overview (this file)
```

## **Setup Instructions**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/<your-username>/tutorials-ninja-testing.git
   cd tutorials-ninja-testing
   ```

2. **Install Dependencies**:
   Ensure Maven is installed on your system. Run:
   ```bash
   mvn clean install
   ```

3. **Run Tests**:
   - To execute all tests, use:
     ```bash
     mvn test
     ```
   - To execute a specific feature file:
     ```bash
     mvn test -Dcucumber.options="src/test/resources/features/Login.feature"
     ```

4. **Generate Reports**:
   Reports will be generated in the `target/cucumber-reports` directory.

## **Automated Test Scenarios**

### **1. Login Functionality**
- Validate login using valid credentials.
- Test error messages for invalid login attempts.
- Automate the multi-factor authentication (MFA) process.

### **2. Product Search and Filters**
- Automate product searches with filters (e.g., category, price, rating).
- Validate sorting by price and best sellers.

### **3. Checkout Process**
- Automate adding items to the cart and completing checkout.
- Verify promo code functionality and discount calculations.

### **4. Error Handling**
- Validate error messages for invalid inputs.
- Test error scenarios like empty cart checkout.

- Highlights:
  - Walkthrough of the main functionalities.
  - Explanation of testing workflows.
  - Key technical insights and challenges.

## **Contributors**
- [Your Name](https://github.com/Shubham-089>)
- [Team Member 2](https://github.com/7989292662>)



Thank you for exploring the **Tutorials Ninja Testing Project**! 🚀
