import java.util.*;
class NotAlphabetException extends Exception
{
    public NotAlphabetException(String str)
    {
        super(str);
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char c;
        int sum=0;
        try
        {
            while(true)
            {
                System.out.println("Enter a character");
                c=sc.next().charAt(0);
                if(c<65 || (c>90 && c<97)||c>122)
                    throw new NotAlphabetException("The entered character is not an alphabet.");
                sum+=c;
                System.out.println("The sum of ASCII value of all characters entered till now is: "+sum);
                
            }
        }
        catch(NotAlphabetException e)
        {
            System.out.println(e);
        }
    }

}