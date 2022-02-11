package stringMethods;

public class stringsAttached {
	
	public static void main(String[] args) {
		// trim()
//		replaceAll()
//		compareTo()
//		getBytes()
//		codePointAt()
//		replace()
		
		
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

	       System.out.print("Result of Test2: " );
	       System.out.println(str1.regionMatches(5, str3, 0, 4));

	       System.out.print("Result of Test3: " );
	       System.out.println(str1.regionMatches(true, 5, str3, 0, 4));

	}	

}
