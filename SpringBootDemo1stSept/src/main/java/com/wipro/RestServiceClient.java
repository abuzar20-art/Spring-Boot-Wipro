package com.wipro;

import org.springframework.web.client.RestTemplate;

public class RestServiceClient {

	public static void main(String[] args) {
 
		RestTemplate restTemplate  = new RestTemplate();
		 String response = restTemplate.getForObject("http://localhost:8185/empxml", String.class);
		 System.out.println(response);
	}

}
