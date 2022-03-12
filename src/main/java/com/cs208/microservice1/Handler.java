package com.cs208.microservice1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Handler {

	@GetMapping("/prime")
	public String countPrimeNumbers(String sleepTime, String limit) {
		
		try {
			Thread.sleep(new Long(sleepTime));
		}catch(Exception e) {
			
		}
		
		int count = 0;
		for (long i = 1; i <= Long.parseLong(limit); i++) {
			   if (isPrime(i)) {
				   count = count + 1;
			   }
		}
		String returnString = "The total number of prime numbers less than " + limit + " is " + count;
		return returnString;
	}
	
	
	private static boolean isPrime(long number) {
	     if (number < 2) {
	    	 return false;
	     }

	     Boolean isPrime = true;
	     for (long i = 2; i < number; i++) {
	    	 if (number % i == 0) {
	    		 isPrime = false;
	    	 }
	       }
	     return isPrime;
	}
	
	
}
