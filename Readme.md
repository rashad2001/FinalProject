# Banking Application Testing

This repository contains a set of manual and automation test cases for a banking application. The tests cover various functionalities, including user authentication, transactions, customer management, and more. Both manual and automated test cases have been included to ensure comprehensive coverage.

## Test Cases

### Login Functionality

- **Test Case 1: Verify Successful Login**
  - Objective: Ensure users can successfully log in with valid credentials.


- **Test Case 2: Verify Customer Selection**
  - Objective: Confirm that users can select their customer name during login.

  - **Test Case 3: Verify Deposit Functionality**
 
  - **Test Case 4: Verify Withdrawal Functionality**
 
  - **Test Case 5: Verify Authentication for Bank Manager Login**
 
  - **Test Case 6: Verify Validation on Add Customer Fields**
    
  - **Test Case 7: Verify Opening an Account**
 
  - **Test Case 8: Verify Customer Search Functionality**
 
  - **Test Case 9: Verify Customer Deletion**



## Performance testing

Performance Testing Report
Overview

This repository contains the results of a comprehensive performance testing initiative conducted on our application using JMeter. The goal was to assess the robustness and scalability under different user load scenarios.
Test Scenarios
500 Users

    Home Page Request:
        Some users experienced errors due to scalability challenges.
        Optimizations initiated to improve performance.
    Transactions and Bank Manager Login:
        Generally stable performance observed.
    Generic Login:
        Connectivity issues addressed to mitigate errors.

5,000 Users

    Home Page Request:
        Continued scalability issues addressed with optimizations.
    Transactions Request:
        Errors identified, optimizations implemented for enhanced database performance.
    Bank Manager Login and Generic Login:
        Authentication and authorization optimizations applied to improve performance.

Common Observations

    Network Issues:
        Connectivity challenges resolved to improve reliability.
    Server Unavailability:
        Monitored and addressed intermittent server unresponsiveness.

Recommendations

    Optimization Measures:
        Continued optimization efforts for the home page and overall system performance.
    Monitoring:
        Implement robust server and network monitoring solutions.
    Scalability Testing:
        Consider additional scalability testing for comprehensive performance evaluation.

Errors and Screenshots

Include screenshots or pictures depicting errors encountered during the tests:
Home Page Request (500 Users)

![image](https://github.com/rashad2001/FinalProject/assets/60662650/1588551f-e519-4ba6-adfe-9f16fc1fdf5c)

Transactions Request (5,000 Users)

![image](https://github.com/rashad2001/FinalProject/assets/60662650/d319e5bf-5726-4547-a07a-abf3edba862d)

Bank Manager Login (5,000 Users)

![image](https://github.com/rashad2001/FinalProject/assets/60662650/e6079dee-6bb5-4093-ba1e-3cf4baa6847f)

Add Customer (5,000 Users)

![image](https://github.com/rashad2001/FinalProject/assets/60662650/0d35f515-d1a8-4be9-bdfd-3b6a025857c6)

Conclusion

The performance testing initiative provided valuable insights, leading to targeted optimizations and enhancements. Ongoing monitoring and optimization efforts are crucial for ensuring optimal performance under varying conditions.

For more details, refer to the detailed Performance Testing Report.

## User Stories

A set of user stories has been created to outline the requirements and expectations from the banking application:

    As a User, I want to log in to the banking application with a valid customer name so that I can access my account information easily.
        Acceptance Criteria:
            I should be able to select my customer name from the dropdown.
            After logging in, I expect to see relevant information on the post-login page.

    As a User, I want to perform transactions seamlessly to manage my account efficiently.
        Acceptance Criteria:
            I should be able to navigate to the transaction page after logging in.
            Transaction details should be displayed accurately, and the process should be smooth.

    As a Bank Manager, I want to log in securely with valid credentials to access administrative features.
        Acceptance Criteria:
            I should be prompted for valid Bank Manager credentials during login.
            Access should be restricted without proper authentication.

    As a Bank Manager, I want to add new customers to the system easily.
        Acceptance Criteria:
            The system should allow me to input customer details such as first name, last name, and post code.
            Customer information should be stored accurately, and the process should be validated.

    As a Bank Manager, I want to open accounts for customers efficiently.
        Acceptance Criteria:
            The system should provide a smooth process for opening accounts for customers.
            Account creation should not allow invalid characters or data.

    As a Bank Manager, I want to search for customers by name to access their information quickly.
        Acceptance Criteria:
            The system should allow me to search for customers using their names.
            Search results should display relevant customer details.

    As a Bank Manager, I want to delete customer records securely when necessary.
        Acceptance Criteria:
            The system should prompt for confirmation before deleting a customer record.
            Deleted customer records should no longer be accessible.

    As a User or Bank Manager, I want to log out of the application securely with a click of the home button.
        Acceptance Criteria:
            Clicking on the "Home" button should log me out securely, and I should be redirected to the home or login page.

    As a User, I want to navigate through the application easily, ensuring a responsive and user-friendly experience.
        Acceptance Criteria:
            The application should be responsive on different devices and browsers.
            Navigation buttons should work correctly without breaking the application.

## Instructions for Running Automated Tests

1. Clone the repository to your local machine.
2. Install the required dependencies (mention any specific tools or frameworks used for automation).
3. Run the automation test suite using the provided commands.

## Reporting Issues

If you encounter any issues or have suggestions for improvements, please feel free to [open an issue](link-to-issue-tracker) on this repository.


