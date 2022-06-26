package com.basic.java;

import java.util.Base64;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token= "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJTUFRTZXJ2aWNlIiwiZXhwIjoxNjE3ODk0NzcwLCJpYXQiOjE2MTc4OTI5NzB9.r1C3dadqnNG6SwuriAoN18uBrzbpu0PK0IDrtwqWEjb98krFO1VFUkKedBMA9ikhAbmoNrmYYBz-eq4hn2pBwg";
		
		Basic b= new Basic(); 
		b.isTokenDataValid(token);
		System.out.println(b.isTokenDataValid(token));
		
		String str = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr = token.split("[.]");
  
        for (String a : arrOfStr)
            System.out.println(a);
        System.out.println("++++++++++++++++");
        String originalInput = "2e6f42dc-0e06-4bda-89e5-c7ebe8a81fbc";
        System.out.println(originalInput);
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        
        System.out.println(encodedString);
        
        String decodedstrpro = "MmU2ZjQyZGMtMGUwNi00YmRhLTg5ZTUtYzdlYmU4YTgxZmJj" ;
        
        byte[] decodedBytes = Base64.getDecoder().decode(decodedstrpro);
        String decodedString = new String(decodedBytes);
        System.out.println("-----------------------");
        System.out.println("Deocede-   " +decodedString);
        System.out.println("-----------------------");
        System.out.println("2e6f42dc-0e06-4bda-89e5-c7ebe8a81fbc".length());
        System.err.println("f1a1c355-43a5-4780-8123-de2a55e0d522".length());
        
        String unmasked ="7890777788";
        String masked = maskTrustedPhoneNumber(unmasked);
        System.out.println(masked);
        

	}
	
	public Boolean isTokenDataValid(String token) {
		String[] tokenArr = token.split("[.]");
		System.out.println(tokenArr.length);
		return tokenArr.length==3?true:false;
	}
	
	public static String maskTrustedPhoneNumber(String unmasked) {
		if (null == unmasked) {
			return null;
		}
		
		int max = 7;
		String replace = "x";
		
		StringBuffer masked = new StringBuffer();
		for (int i = 0; i < max; i++) {
			masked.append(replace);
		}
		masked.append(unmasked);

		return masked.toString();
		
	}           


}
