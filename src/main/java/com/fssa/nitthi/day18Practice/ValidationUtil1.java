package com.fssa.nitthi.day18Practice;


public class ValidationUtil1{
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age <= 0) {// Check if the age is a positive value
			throw new IllegalArgumentException("Invalid age");

		}  
		else {
			return true;
		}
	}
}