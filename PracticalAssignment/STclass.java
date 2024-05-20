/** All StringBuffer Class Methods */
import java.util.*;
class STclass
{
    public static void main(String[]args)
    {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the delimeter on the basis of which you want to split the: ");
        String d = sc.next();
        
        StringTokenizer st = new StringTokenizer(s,d);
        int n= st.countTokens();
        
        System.out.println("Total number of tokens are: "+n);
            
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
        
    }
    
}