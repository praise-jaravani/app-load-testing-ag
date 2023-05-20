# HTTP Endpoint Testing Application
This Java program allows you to hit a supplied HTTP endpoint multiple times and retrieve information about the response, including response code, response time, and response bytes sent. The program is executed through a bash script in a terminal.

## Prerequisites
To run this program, you need to have the following installed on your machine:

- Java Development Kit (JDK)
- Git

## Installation
Clone the GitHub repository to your local machine by running the following command:
> git clone https://github.com/praise-jaravani/app-load-testing-ag.git

Change into the repository directory:
> cd app-load-testing-ag/

Make the bash script executable by running:
> chmod +x run.sh

## Usage
Open a terminal and navigate to the repository directory.

Run the bash script using the following command:
> ./run.sh

This will compile and execute the Java program, opening the HTTP endpoint testing program.

## Results
The program will display the following information for each request made:

**Response Code:** The HTTP response code returned by the endpoint.

**Response Time:** The time taken by the endpoint to respond to the request, in milliseconds.

**Response Bytes Sent:** The number of bytes sent in the response.

## Customization
You can customize the behavior of the program by modifying the EndPointDataRequester.java file:

## License
This project is licensed under the MIT License.






