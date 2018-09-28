package com.spring.test.spring_hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
    	
    	// AplicationContext is a bean container: class to fetch beans (normal Java objects)
    	// give argument: name of xml file to read
    	
    	// cast return type to right object, which is Person
    	
    	Person person = (Person)context.getBean("person");
    	person.haveConversation();
    }
}