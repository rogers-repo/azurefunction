Uber is a platform where those who drive can connect with riders and riders can request a ride.
It is a location-based platform that makes hiring an on-demand private driver. 
As a developer create few APIs listed below on Azure Functions using spring cloud functions and test those APIs.

Java:: Azure Spring Cloud Functions - Exercises

1. Uber Enrollment Service
    
    *  Add dependencies and plugins for Azure and spring cloud functions in pom.xml
    
    *  Create Proper Project Structure 
    
    *  Create, run and deploy sample Azure Spring Cloud Function and check the setup

2. Create Azure spring cloud Functions for the following Uber API's

    *  PUT /enrollments/{enrollmentId}/licenseverification/approve
    
    *  PUT /enrollments/{enrollmentId}/licenseverification/decline

    These API should update the status of Enrollment.
    
3. Create an Azure Spring Cloud Function to get the Driver if the status of Registration Certificate, Authorization, and Driving License is verified. Think about what should be the API for it.

4. All the API's in exercise 2 and 3 needs to be backed by Unit Test Cases.
