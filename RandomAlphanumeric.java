package com.ssp.stringarray;

import java.util.Random;
public class RandomAlphanumeric
{
	    static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	    
	    static Random random = new Random();

	    public static String generateRandomString(int length){
	        StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < length; i++){
	            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args){
	        int length = 10;
	        
	        String randomString = generateRandomString(length);
	        System.out.println("Random alphanumeric string of length " + length + ": " + randomString);
	    }
}
