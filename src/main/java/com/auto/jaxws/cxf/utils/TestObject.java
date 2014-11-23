package com.auto.jaxws.cxf.utils;

public class TestObject {

	private String firstName;
	private String lastName;
	
	public TestObject(String firstName,
				String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@GetSet(numberOfTimesToInvoke=3)
	public void printFirstName(){
		System.out.println(firstName);
	}
	
	@GetSet(numberOfTimesToInvoke=6)
	public void printLastName(){
		System.out.println(lastName);
	}

	@GetSet
	public void printMessage(){
		System.out.println("printed only once");
	}
	
	public void printSecret(){
		System.out.println("this will not be printed");
	}	
}
