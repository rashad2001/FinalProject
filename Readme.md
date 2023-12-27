# Banking Application Testing

This repository contains a set of manual and automation test cases for a banking application. The tests cover various functionalities, including user authentication, transactions, customer management, and more. Both manual and automated test cases have been included to ensure comprehensive coverage.

## Manual Test Cases

### Login Functionality

- **Test Case 1: Verify Successful Login**
  - Objective: Ensure users can successfully log in with valid credentials.
  - ...

- **Test Case 2: Verify Customer Selection**
  - Objective: Confirm that users can select their customer name during login.
  - ...

...

### Automated Test Cases

Automated test cases have been developed to streamline testing processes. The following test cases are included in the automation suite:

- **Automated Test Case 1: Login with Valid Credentials**
  - Objective: To automate the verification of successful login with valid credentials.
  - ...

- **Automated Test Case 2: Transaction Functionality**
  - Objective: Automate the verification of transaction processes.
  - ...

...

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

---

Feel free to customize and expand this README.md template based on your specific tools, frameworks, and repository structure. The goal is to provide clear documentation for anyone using or contributing to your testing project.
