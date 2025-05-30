
# Spring AI Chatbot using Groq (LLaMA3) + Java + Spring Boot
- REST API to send user questions and get responses
- Powered by Groq’s LLaMA3-70B model
- API key securely managed using `.env`
- Built entirely with Spring Initializr

## Technologies used

- Java - language
- Spring Boot - Web Framework
- Spring Web - REST Controller
- Spring AI - AI Integration


### Dependencies used in Spring Initializr
- Spring Web
- Spring Boot DevTools
- OpenAI

## Configuration
- API key is added to .env file
- Key-value setting are stored in the application.properties

## Working
- A message is sent to the /api/chat endpoint.
- The backend sends the message to Groq using Spring AI.
- Groq's LLaMA3 model replies with an answer.
- Answer is recieved as plain text.
- It is tested using POSTMAN




