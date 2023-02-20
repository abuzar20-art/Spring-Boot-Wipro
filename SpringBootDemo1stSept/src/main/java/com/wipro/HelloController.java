package com.wipro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	 @GetMapping(value = "/hello", produces = "text/plain")
	public String sayHello() {		 
		 return "Hello!!!";		 
	 }
	
	 @GetMapping(value = "/helloHtml", produces = "text/html")
		public String sayHelloHTML() {		 
			 return "<body bgcolor = 'cyan'>Hello!!!</body>";		 
		 }
	 
	 @GetMapping(value = "/helloXml", produces = "text/xml")
		public String sayHelloXML() {		 
		 return "<body bgcolor = 'cyan'>Hello!!!</body>";	
		 }
	
	 @GetMapping("/emp")
	 public Employee getEmployee() {
		 return new Employee(101, "Abuzar");
	 }
	
	 @GetMapping(value= "/empxml", produces = "text/xml")
	 public Employee getEmployeeXml() {
		 return new Employee(102, "Ammad");
	 }
	 
}


