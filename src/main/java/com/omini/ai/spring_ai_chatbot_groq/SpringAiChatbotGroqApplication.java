package com.omini.ai.spring_ai_chatbot_groq;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiChatbotGroqApplication {

	static {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("GROQ_API_KEY", dotenv.get("GROQ_API_KEY"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAiChatbotGroqApplication.class, args);
	}
}
