# Workflow Service

This backend application is built using **Java 21 LTS** and Spring Boot.  
It provides RESTful APIs to manage customers, accounts, deposits, and payments as part of the Solance banking platform.

The live application can be accessed at:  
[http://api-solance-test.us-east-1.elasticbeanstalk.com](http://api-solance-test.us-east-1.elasticbeanstalk.com)

## Deployment

The current deployment was performed directly on the AWS Elastic Beanstalk platform by uploading the compiled `.jar` file.  

However, the project is already prepared for containerization using Docker and includes pre-configuration for automated deployment via GitHub Actions, facilitating continuous integration and continuous deployment (CI/CD) pipelines.

## Available API Endpoints

| Operation                   | HTTP Method | URL                                                                    | Description                            |
|-----------------------------|-------------|------------------------------------------------------------------------|--------------------------------------|
| Register Customer            | POST        | `http://api-solance-test.us-east-1.elasticbeanstalk.com/api/customers/register` | Registers a new customer              |
| Open Customer Account        | POST        | `http://api-solance-test.us-east-1.elasticbeanstalk.com/api/accounts/open`       | Opens a new account for a customer   |
| Create Deposit Transaction   | POST        | `http://api-solance-test.us-east-1.elasticbeanstalk.com/api/transactions/deposit`| Creates a deposit transaction (pay-in) |
| Create Payment Instruction   | POST        | `http://api-solance-test.us-east-1.elasticbeanstalk.com/api/payments/create`     | Creates a payment instruction (pay-out) |
| Get All Customers            | GET         | `http://api-solance-test.us-east-1.elasticbeanstalk.com/api/customers`           | Retrieves a list of all customers    |

---

Feel free to use tools like Postman or Insomnia to test these endpoints.
