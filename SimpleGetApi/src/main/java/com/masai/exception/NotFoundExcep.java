package com.masai.exception;

public class NotFoundExcep extends Exception{
	
	NotFoundExcep(){
		
	}
	
	NotFoundExcep(String msg){
		super("Class Not Found");
	}

}