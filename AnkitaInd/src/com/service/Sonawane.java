package com.service;

import java.io.File;

public class Sonawane {

	public String helloAnkita() {
		// TODO Auto-generated method stub
		return "Hey Ankita";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File file = new File("C:\\Ankita74");
	        if (!file.exists()) {
	            if (file.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }

	}

}
