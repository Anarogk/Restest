

# Automated REST API Testing Framework

## Overview

This project is an Automated REST API Testing Framework built using Core Java, Cucumber, TestNG, and REST Assured. The framework includes comprehensive test scenarios for various HTTP methods (GET, POST, PUT, DELETE) and error handling. It provides a modular and reusable test script structure, configuration-driven test data, detailed test reports, and integration with CI/CD pipelines.

## Use Case

This framework is designed for developers and QA engineers who need to automate the testing of REST APIs. It can be used to:

- Validate the functionality of REST APIs.
- Perform regression testing to ensure new changes do not break existing functionality.
- Provide detailed test reports and logs for better analysis and debugging.
- Integrate with CI/CD pipelines to automate the testing process in a continuous integration environment.

## Benefits

- **Modular and Reusable**: The framework allows the creation of reusable test scripts, reducing redundancy and enhancing maintainability.
- **Configuration-driven**: Test data and configurations are driven by properties files, making it easy to manage and update.
- **Detailed Reporting**: Generates detailed HTML reports using ExtentReports, providing clear insights into test execution results.
- **CI/CD Integration**: Seamlessly integrates with CI/CD pipelines (e.g., Jenkins), enabling automated testing as part of the build process.

## Technologies

- **Core Java**
- **Cucumber**
- **TestNG**
- **REST Assured**
- **ExtentReports**

## Project Structure

```
src
├── main
│   └── java
│       └── com
│           └── example
│               └── apitestingframework
│                   ├── base
│                   │   └── TestBase.java
│                   ├── config
│                   │   └── ConfigurationReader.java
│                   └── utils
│                       └── ExtentReportUtil.java
└── test
    └── java
        └── com
            └── example
                └── apitestingframework
                    ├── runners
                    │   └── TestRunner.java
                    ├── stepdefinitions
                    │   └── ApiSteps.java
                    └── features
                        └── api.feature
```

## Prerequisites

- JDK 8 or higher
- Maven
- IDE (IntelliJ IDEA, Eclipse, etc.)

## Setup Instructions

1. **Clone the Repository**

    ```bash
    git clone https://github.com/your-username/api-testing-framework.git
    cd api-testing-framework
    ```

2. **Update Configuration**

    Create a `config.properties` file in the `src/main/resources` directory and add your configurations:

    ```properties
    base.uri=https://api.example.com
    ```

3. **Build the Project**

    Navigate to the project directory and run:

    ```bash
    mvn clean install
    ```

4. **Run the Tests**

    You can run the tests using your IDE or via Maven:

    ```bash
    mvn test
    ```

## How to Use

1. **Writing Feature Files**

    Define your test scenarios in Cucumber feature files located in the `src/test/java/com/example/apitestingframework/features` directory. 

2. **Implementing Step Definitions**

    Implement the step definitions in the `ApiSteps.java` file under `src/test/java/com/example/apitestingframework/stepdefinitions`.

3. **Running Tests**

    Run the `TestRunner.java` file located under `src/test/java/com/example/apitestingframework/runners` to execute all defined feature files.

## Integration with CI/CD

### Jenkins Integration

1. **Install Jenkins**: Follow the instructions from [Jenkins official site](https://www.jenkins.io/download/).

2. **Install Maven Plugin**: In Jenkins, go to `Manage Jenkins` -> `Manage Plugins` -> `Available` and search for `Maven Integration Plugin`. Install it.

3. **Create a New Job**:
    - Click on `New Item`, enter a name, select `Maven project`, and click `OK`.
    - In the `Source Code Management` section, select `Git` and provide the repository URL.
    - In the `Build` section, add a build step `Invoke top-level Maven targets` and enter `clean test`.

4. **Post-build Actions**:
    - Add a post-build action `Publish HTML reports`.
    - Provide the report directory as `target/cucumber-reports` and index file as `cucumber.html`.

5. **Build the Project**: Save the job and click `Build Now`.

## How to Integrate with Existing Projects

1. **Add Dependencies**: Add the required dependencies for Cucumber, TestNG, REST Assured, and ExtentReports to your existing project's `pom.xml`.

2. **Project Structure**: Ensure your project structure aligns with the one mentioned above, especially for the test-related files.

3. **Configuration Files**: Create a `config.properties` file in the resources directory for configuration-driven data.

4. **Feature Files and Step Definitions**: Write your feature files and step definitions according to the existing API endpoints and requirements.

5. **Test Runner**: Implement a test runner class to execute the tests.

6. **CI/CD Integration**: Follow the Jenkins integration steps mentioned above or integrate with your existing CI/CD pipeline accordingly.

## Conclusion

This framework simplifies the process of automating REST API testing, providing a structured approach to validate APIs, ensuring reliability, and facilitating continuous integration. By following the setup and usage instructions, you can integrate this framework into your projects and enhance your testing capabilities.

---

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```
