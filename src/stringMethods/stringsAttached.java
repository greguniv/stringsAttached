package stringMethods;

public class stringsAttached {
	

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
	    
	    
//		compareTo()
//	    codePointAt is a method that returns an int value representing the Unicode value of the character at the specified index in a string.
//      first index
//   SYNTAX:   public int codePointAt(int index)
      String myString = "Bonjour chez vous";
      int result = myString.codePointAt(3);
      System.out.println(result);
//      Change the index value by index
 
      
	    // getBytes()
	  //The getBytes() method encodes a given String into a sequence of bytes and returns an array of bytes. 
	  		//The method can be used in below two ways:	  			 
//	  	       byte[] array1 = str.getBytes();
//	  	       System.out.print("Default Charset encoding:");
//	  	       for(byte b: array1){
//	  	           System.out.print(b);
	  	           
	  	           
//		codePointAt()		 
//		    codePointAt is a method that returns an int value representing the Unicode value of the character at the specified index in a string.
//		        first index
		        String myStr = "Hello";
		        int result1 = myStr.codePointAt(0);
		        System.out.println(result1);
		
		        
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
