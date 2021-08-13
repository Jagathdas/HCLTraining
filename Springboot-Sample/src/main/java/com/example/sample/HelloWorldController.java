package com.example.sample;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
//Controller  
@RestController  
public class HelloWorldController   
{  
//using get method and hello-world as URI  
@RequestMapping(method=RequestMethod.GET, path="/hello-world")  
public String helloWorld()  
{  
return "Hello World";  
}  
@GetMapping(path="/getData")  
public String getData()  
{  
return "Welcome to Spring boot and Micro Services Training";  
}  
@Value("${spring.application.name}")
private String name;
@GetMapping(path="/getPropertyValue")  
public String getPropertyValue()  
{  
return name;  
} 
}
