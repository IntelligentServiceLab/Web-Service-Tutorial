package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
		SoapClientService client = new SoapClientService();
		int result = client.callSoapService(1,2);
		System.out.println(result);
	}
}
