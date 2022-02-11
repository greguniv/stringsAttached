package stringMethods;

public class stringsAttached {
	
	
	
	public static void compareTwoStrings(String str, String str1) {
		//compareTo()	Compares two strings lexicographically 	--> Return type --> int
		//getBytes()	Encodes this String into a sequence of bytes using the named charset,
		//storing the result into a new byte array	Returns type --> byte[]
		//An int value: 0 if the string is equal to the other string.
		//< 0 if the string is lexicographically less than the other string
		//> 0 if the string is lexicographically greater than the other string (more characters)
		//This means that the words are alphabetically ordered based on their component alphabets.
		
		int result = (str.compareTo(str1));
		
		if (result == 0) {
			System.out.println("The Strings "+ str + " and " + str1 + " are lexicographically the same");
		}else if (result < 0){
			System.out.println("The String "+ str + " is lexicographically LESS than "+ str1);			
		}else {
			System.out.println("The String "+ str + " is lexicographically GREATER than "+ str1);	
			
			
	
	public static void main(String[] args) {
		// trim()
		
//		Removes whitespace from both ends of a string
		
		String greeting = "       Whatup Doc!";
		String farewell = "       Say" + " Less";
	    System.out.println(greeting);
	    System.out.println(greeting.trim());
	    System.out.println(farewell);
	    System.out.println(farewell.trim());
	    
//	    replaceAll()	
//	    Replaces each substring of this string that matches the given regular 
//	    expression with the given replacement
	    
	    String toBeReplaced = "Show me the money";
	    String replaceWith = "You had me at hello";
        System.out.println(toBeReplaced);
	    System.out.println(toBeReplaced.replaceAll(toBeReplaced,        replaceWith));
 
	  //The getBytes() method encodes a given String into a sequence of bytes and returns an array of bytes. 
	  		//The method can be used in below two ways:
	  			 
	  	       byte[] array1 = str.getBytes();
	  	       System.out.print("Default Charset encoding:");
	  	       for(byte b: array1){
	  	           System.out.print(b);
	  	           
//		codePointAt()
		 
//		    codePointAt is a method that returns an int value representing the Unicode value of the character at the specified index in a string.
//		        first index
		        String myStr = "Hello";
		        int result = myStr.codePointAt(0);
		        System.out.println(result);
		
//		replace()
		      //Return a new string where all "l" characters are replaced with "p" characters:  
		       
		            String myStr2 = "massages";
		            System.out.println(myStr2.replace('a', 'e'));
		
		
//		regionMatches()
		// This String method tests if two Strings are equal, and returns a boolean
		// this method has 2 variants
		// SYNTAX:
//		public boolean regionMatches(int toffset,
//									 String other,
//									 int ooffset,
//									 int len);
		// VARIANT: boolean ignoreCase - if set to true, ignores case when comparing characters
		// toffset - the starting offset (index #) of the subregion in this String
		// other - the String argument
		// ooffset - the starting offset of the subregion in the String argument
		// len - the number of characters to compare
		// If the 1st String matches the specified 
		
		String str1 = new String("Hey, whats up");
	       String str2 = new String("what");
	       String str3 = new String("WHAT");

	       System.out.print("Result of Test1: " );
	       System.out.println(str1.regionMatches(5, str2, 0, 4));
	       //here we are comparing what from str1 to what from str2 - returned true bc they match

	       System.out.print("Result of Test2: " );
	       System.out.println(str1.regionMatches(5, str3, 0, 4));
	       //here we compare str1 to str3(uppercase) - returns false bc this variation of the method is Case sensitive

	       System.out.print("Result of Test3: " );
	       System.out.println(str1.regionMatches(true, 5, str3, 0, 4));
	       //here we compare str1 to str3 again - but have it IGNORE the case by setting it to true first and then specifying parameters

	}	

}
