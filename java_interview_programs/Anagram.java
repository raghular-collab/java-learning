package test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {



		        String str1 = "listen";
		        String str2 = "silent";

		        // Step 1: remove spaces & convert to lowercase
		        //str1 = str1.toLowerCase();
		        //str2 = str2.toLowerCase();

		        // Step 2: check length
		        if (str1.length() != str2.length()) {
		            System.out.println("Not Anagram");
		            return;
		        }

		        // Step 3: convert to char array
		        char[] arr1 = str1.toCharArray();
		        char[] arr2 = str2.toCharArray();

		        // Step 4: sort arrays
		        Arrays.sort(arr1);
		        Arrays.sort(arr2);

		        // Step 5: compare
		        if (Arrays.equals(arr1, arr2)) {
		            System.out.println("Anagram");
		        } else {
		            System.out.println("Not Anagram");
		        }
		    }
	}

