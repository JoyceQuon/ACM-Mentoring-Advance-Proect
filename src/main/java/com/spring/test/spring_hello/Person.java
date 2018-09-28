package com.spring.test.spring_hello;

import java.util.Scanner;

public class Person {
	
	
		public void haveConversation() {
			Scanner x = new Scanner(System.in);
			
			System.out.println("Whats your name?");
			
			String y = x.nextLine();
			
			System.out.println("Hello "+y);
			
			System.out.println("Hows ur day goin?");
			
			String z = x.next();
			
			if(z == "good") {
				System.out.println("Oh thats nice!");
				
			}
			else {
				System.out.println("Oh on whats wrong");
			}
			
		}
		
		

	}