/** All StringBuffer Class Methods */
import java.util.*;
class SBClass
{
    public static void main(String[]args)
    {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuffer sb = new StringBuffer(s);
        
        // common methods as string
        
        System.out.println(sb.length()); // The length of a StringBuffer can be found by the length( ) method
        System.out.println(sb.append(" Everyone!")); // Used to add text at the end of the existing text.
        System.out.println(sb.charAt(3)); // returns the char value in this sequence at the specified index.
        System.out.println(sb.deleteCharAt(3)); // Deletes the character at the index specified by the loc
        System.out.println(sb.delete(0,5)); // Deletes a sequence of characters from the invoking object
        System.out.println(sb.capacity()); // the total allocated capacity can be found by the capacity( ) method
        sb.ensureCapacity(15); //If the current oldCapacity of StringBuffer > minimumCapacity, then capacity remains same.
        System.out.println(sb.capacity());
        sb.ensureCapacity(25); //If oldCapacity < the minimumCapacity && mimimumCapacity <= 2* oldCapacity+2, then newCapacity= 2*oldCapacity + 2  .
        System.out.println(sb.capacity());
        sb.ensureCapacity(92); //If oldCapacity < the minimumCapacity && mimimumCapacity > 2*oldCapacity+2, then newCapacity= minimumCapacity  .
        System.out.println(sb.capacity());
        sb.ensureCapacity(-2); // If the minimumCapacity argument passed as parameter < 0, this method takes no action.
        System.out.println(sb.capacity());
        System.out.println(sb.insert(5,"World! ")); // Inserts text at the specified index position
        System.out.println(sb.replace(10,sb.length(),"!")); // Replace one set of characters with another set inside a StringBuffer object
        System.out.println(sb.reverse()); //Reverse the characters within a StringBuffer object
        System.out.println(sb.substring(3));//It is used to return the substring from the specified beginIndex.
        
        
    
    }
}