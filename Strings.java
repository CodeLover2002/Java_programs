/** This file contains ALL String functions */
import java.util.*;
class Strings
{
    public static void main(String[]args)
    {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2="";
        
        //All String Methods
        
        System.out.println(s.length());  // s.length() returns an integer equal to total no.of characters
        System.out.println(s.charAt(3)); // s.charAt(i) Returns the character at the specified index (position)
        System.out.println(s.codePointAt(3));    //s.codePointAt(i) returns the Unicode (int) of the character at the specified index
        System.out.println(s.codePointBefore(3));    //Returns the Unicode of the character before the specified index
        System.out.println(s.codePointCount(0,3));   //Returns the number of Unicode values found in a string.
        System.out.println(s.compareTo("hello"));    //Compares two strings lexicographically and returns int
        System.out.println(s.compareToIgnoreCase("hello"));  //Compares two strings lexicographically,ignoring case differences and returns int
        System.out.println(s.contains("ell"));   //Checks whether a string contains a sequence of characters
        System.out.println(s.contentEquals("Hello"));    //Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
        char[] charay = {'H', 'e', 'l', 'l', 'o'};
        s2=s2.copyValueOf(charay,0,charay.length);   //Returns a String that represents the characters of the character array
        System.out.println(s2);
        System.out.println(s.startsWith("H"));   //Checks whether a string ends with the specified character(s)
        System.out.println(s.endsWith("lo"));    //Checks whether a string ends with the specified character(s)
        System.out.println(s.equals("Hello"));   //Compares two strings. Returns true if the strings are equal, and false if not
        System.out.println(s.equalsIgnoreCase("hello")); //Compares two strings, ignoring case considerations
        System.out.println(s.hashCode());    // Returns the hash code of a string
        System.out.println(s.indexOf('l'));  //Returns the position of the first found occurrence of specified characters in a string
        System.out.println(s.lastIndexOf('l'));  //Returns the position of the last found occurrence of specified characters in a string
        System.out.println(s.replace("el","p")); //Searches a string for a specified value, and returns a new string where the specified values are replaced
        System.out.println(s.replaceFirst("ell","ipp")); //Replaces the first occurrence of a substring that matches the given regular expression with the given replacement
        System.out.println(s.replaceAll("e","o"));   //Replaces each substring of this string that matches the given regular expression with the given replacement
        System.out.println(s.substring(0,3));    //Returns a new string which is the substring of a from first index till the last index excluding th last index
        System.out.println(s.substring(3));  // Returns the substring after the given index        
        System.out.println(""+s.toUpperCase());  //Converts a string to upper case letters
        System.out.println(""+s.toLowerCase());  //Converts a string to lower case letters
        System.out.println(s.trim());    //Removes whitespace from both ends of a string
        
        String[] str = s.split(" "); //Splits a string into an array of substrings
        for(String a: str)
            System.out.println(a);   //extracting all words from a string
        
        char[] str2 = s.toCharArray();   //Converts this string to a new character array
        for(char a: str2)
            System.out.println(a);   // extracting all characters of a string
        
        String st = "45"; // valueOf returns the string representation of the specified value
        int a= Integer.valueOf(st);
        System.out.println(a+5);
        double b = Double.valueOf(st);
        System.out.println(b+5.5);      
        
    
    }

}
