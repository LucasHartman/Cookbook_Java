/*
--  String Class
-   Strings Are Immutable Objects
-   each character in a string is a 16-bit Unicode character.
-   Strings are objects. As with other objects, you can create an 
    instance of a string with the new keyword.  


    
--  immutable
-   Once you have assigned a String a value, that value can never change—it’s immutable
-   When changing the string the reference (s) will refer to a new String, 
    but the old one would still exist in memory, but has no reference.


--  String and Memory
-   To make Java more memory efficient, the JVM sets aside a special 
    area of memory called the String constant pool
-   When the compiler encounters a String literal, 
    it checks the pool to see if an identical String already exists.
-   If a match is found, the reference to the new literal is directed to the existing String, 
    and no new String literal object is created. 


--  String
-   Source: https://www.w3schools.com/java/java_ref_string.asp
charAt() 	            Returns the character at the specified index (position) 	char
codePointAt() 	        Returns the Unicode of the character at the specified index 	int
codePointBefore() 	    Returns the Unicode of the character before the specified index 	int
codePointCount() 	    Returns the number of Unicode values found in a string. 	int
compareTo() 	        Compares two strings lexicographically 	int
compareToIgnoreCase() 	Compares two strings lexicographically, ignoring case differences 	int
concat() 	            Appends a string to the end of another string 	String
contains() 	            Checks whether a string contains a sequence of characters 	boolean
contentEquals() 	    Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer 	boolean
copyValueOf() 	        Returns a String that represents the characters of the character array 	String
endsWith() 	            Checks whether a string ends with the specified character(s) 	boolean
equals() 	            Compares two strings. Returns true if the strings are equal, and false if not 	boolean
equalsIgnoreCase() 	    Compares two strings, ignoring case considerations 	boolean
format() 	            Returns a formatted string using the specified locale, format string, and arguments 	String
getBytes() 	            Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array 	byte[]
getChars() 	            Copies characters from a string to an array of chars 	void
hashCode() 	            Returns the hash code of a string 	int
indexOf() 	            Returns the position of the first found occurrence of specified characters in a string 	int
intern() 	            Returns the canonical representation for the string object 	String
isEmpty() 	            Checks whether a string is empty or not 	boolean
lastIndexOf() 	        Returns the position of the last found occurrence of specified characters in a string 	int
length() 	            Returns the length of a specified string 	int
matches() 	            Searches a string for a match against a regular expression, and returns the matches 	boolean
offsetByCodePoints() 	Returns the index within this String that is offset from the given index by codePointOffset code points 	int
regionMatches() 	    Tests if two string regions are equal 	boolean
replace() 	            Searches a string for a specified value, and returns a new string where the specified values are replaced 	String
replaceFirst() 	        Replaces the first occurrence of a substring that matches the given regular expression with the given replacement 	String
replaceAll() 	        Replaces each substring of this string that matches the given regular expression with the given replacement 	String
split() 	            Splits a string into an array of substrings 	String[]
startsWith() 	        Checks whether a string starts with specified characters 	boolean
subSequence() 	        Returns a new character sequence that is a subsequence of this sequence 	CharSequence
substring() 	        Returns a new string which is the substring of a specified string 	String
toCharArray() 	        Converts this string to a new character array 	char[]
toLowerCase() 	        Converts a string to lower case letters 	String
toString() 	            Returns the value of a String object 	String
toUpperCase() 	        Converts a string to upper case letters 	String
trim() 	                Removes whitespace from both ends of a string 	String
valueOf() 	            Returns the string representation of the specified value
*/
    
public class StringEx1 {
    public static void main(String args[]) {

        // create a new String object (Long)
        String s = new String();
        s = "ABCDEF";

        // create a new String object
        //String s = new String("abcdef");

        // create a new String object (Short)
        //String s = "abcdef";

        s.toLowerCase();            // no assignment, create a new, abandoned String
        System.out.println(s);      // ABCDEF


        // String Methods
        System.out.println("charAt              "+s.charAt(0));
        System.out.println("concat              "+s.concat("cat"));
        System.out.println("equalsIgnoreCase    "+s.equalsIgnoreCase("ABCDEF"));
        System.out.println("length              "+s.length());
        System.out.println("replace             "+s.replace('A', 'z'));
        System.out.println("substring           "+s.substring(0,2));
        System.out.println("toLowerCase         "+s.toLowerCase());
        System.out.println("toString            "+s.toString());
        System.out.println("toUpperCase         "+s.toUpperCase());
        System.out.println("trim                "+s.trim()); // remove spaces, front/back

    }
}