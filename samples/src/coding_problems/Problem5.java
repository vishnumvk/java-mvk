package coding_problems;

import java.util.ArrayList;
import java.util.Scanner;

/*
 5: Write a program to print the repeating substring of minimum length 2 in a given sentence.

Examples:

Input: However Everyday is a Day.
Output: ever, day

Note: Not case sensitive. Substrings need to be identified irrespetive of upper case or 
lower case.

Input: Happy Holi!
Output: none
 */
public class Problem5 {
	     public static boolean checkSubstring(String str1 , String str2) {
	    	 
	    	 if(str2.length()>str1.length()) {
	    		 return false;
	    	 }
	    	 else {
	    		 
	    		 for(int i=0;i<=(str1.length()-str2.length());i++) {
	    			 int f=0;
	    			 for(int j=0;j<str2.length();j++) {
	    				 if(str1.charAt(j+i)==str2.charAt(j)) {
	    					 f++;
	    				 }
	    			 }
	    			 if(f==str2.length()) {
	    				 return true;
	    			 }
	    		 }
	    		 return false;
	    	 }
	     }
	     public static ArrayList<String> filter(ArrayList<String> sl) {
	    	 ArrayList<String> filtered = new ArrayList<>(sl);
	    	 for(int i=0; i<sl.size(); i++) {
	 			for(int j=0; j<sl.size(); j++) {
	 				if(j!=i) {	 					
	 					if(checkSubstring(sl.get(i),sl.get(j))) {
	 						
	 						filtered.remove(sl.get(j));
	 					}
	 				}
	 				
	 			}
	 		}
	    	 return filtered;
	 		
	     }
         public static void check(char[]a,int i,int j,ArrayList<String> sl) {
        	 String str="";
        	 str = str+a[i];
        	 
        	 for(int s = i+1, r=j+1;r<a.length;s++,r++) {
        		 if(a[s]==a[r] && s!=j && a[s]!=' ') {
        			 str=str+a[s];
        			
        		 }
        		 else {
        			 break;
        		 }
        	 }
        	 if(str.length()>=2) {
        		
        		 sl.add(str);
        	 }
         }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		str=str.toLowerCase();
		char []s =str.toCharArray();
		
		ArrayList<String> sl = new ArrayList<>();
		for(int i=0;i<s.length-1;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j] && s[i]!=' ') {
					
					check(s,i,j,sl);
				}
			}
			
		}

		ArrayList<String> filtered = filter(sl);
		if(filtered.isEmpty()) {
			System.out.println("none");
		}
		else {
			
		for(String sub : filtered) {
			System.out.println(sub);
		}
		}
		
	}

}
