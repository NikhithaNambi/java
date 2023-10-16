package cloudvandana;

import java.util.Scanner;

public class Panagram {
	  public static boolean isPangram(String str) {
	        boolean[] ap = new boolean[26];
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	        	int k=1;
	            char c = str.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                ap[c-'a']=true;
	                k++;
	            }
	            else {
	            	continue;
	            }
	        }
	        for(int i=0;i<ap.length;i++) {
	            if (ap[i]!=true) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        Scanner s= new Scanner(System.in);
	        System.out.println("Enter the String"); 
	        String val=s.nextLine();
	        if (isPangram(val)) {
	            System.out.println("This is Pangram String");
	        } else {
	            System.out.println("This is Not A Pangram");
	        }
	    }

}
