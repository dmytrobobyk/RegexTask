### Documentation
---

#### Application Description

The `RegexValidatorUtil` is a utility class designed to validate strings against specific criteria. It ensures that a string has a predefined maximum length, contains at least one uppercase letter, one lowercase letter, one digit, and a special character. The class also checks that the string does not contain any whitespace characters.

#### Regex Implementation Description

The core of the `RegexValidatorUtil` class is a regular expression defined in the `stringValidationRegex` function. This regex dynamically adjusts based on the provided maximum string length and special characters. The regex ensures the string meets the following criteria:
1. The string length should not exceed the defined maximum length.
2. It should contain at least one uppercase letter, one lowercase letter, and one digit.
3. It should have at least one of the provided special characters.
4. The string should not have any whitespace characters.
The `isValidString` method uses this regex to validate an input string and returns `true` if the string matches the criteria, otherwise `false`.

#### How to Open and Run the Project Tests Locally

(Note: The actual steps may vary depending on how you've structured your project. Here's a general guide.)

1. **Clone the Repository**: If the utility class is hosted on a platform like GitHub, start by cloning the repository to your local machine using the command:
    ```bash
    git clone <repository_url>
    ```
2. **Navigate to the Project Directory**: Once cloned, navigate to the directory containing the project.
    ```bash
    cd path/to/project_directory
    ```
3. **Open the Project in Android Studio**: Launch Android Studio and choose 'Open an existing Android Studio project'. Then select your project directory to open it.

4. **Locate the Tests**: In Android Studio, navigate to the test directory or locate the test class associated with `RegexValidatorUtil`.

5. **Run the Tests**: Right-click on the test file and select the 'Run' option. This will execute the tests and display the results in the 'Run' window.

6. **Review Results**: After running the tests, review the test results in the 'Run' window to ensure all tests pass and the utility class functions as expected.

Make sure you have all necessary dependencies installed and properly configured to avoid any issues during testing.
