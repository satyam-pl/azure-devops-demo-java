package com.javatechie.azure;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringbootAzuresqlApplication {


 @GetMapping("/satyam")
	public String data()
	{
		return "hello satyam";
	}

 

 

    

}
