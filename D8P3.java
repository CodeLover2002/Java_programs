import java.util.*;
class InvalidRequest extends Exception
{
    public InvalidRequest(String str)
    {
        super(str);
    }
}
abstract class Accounts
{
    static String name;// 
    String address;
    long PAN;
    long CustomerID;
    double Balance;
    
    public Accounts(String n,String ad,long pan)
    {
        name=n;
        address=ad;
        PAN=pan;
        CustomerID=(int)(1000*Math.random());
    }
    void addAccount(String n,String ad,long pan)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current account balance. ");
        this.Balance=sc.nextDouble(); 
        return;
    }
    void printStatus()
    {
        System.out.println("Your current account details are:- ");
        System.out.println("Name: "+this.name+"\n"+"CustomerID: "+this.CustomerID+"\n"+"Address: "+this.address+"\n"+"Balance: "+this.Balance);
        
    }
}
class Savings extends Accounts
{
    public Savings(String n,String ad,long pan)
    {
        super(n,ad,pan);
    }
    void deposit(double amt)
    {
        this.Balance=this.Balance+amt;    
        
    }
    void withdraw(double amt)
    {
        try
        {
            if(amt>this.Balance)
                throw new InvalidRequest("The withdrawal cannot be processed as the amount exceeds balance.");
        }
        catch(InvalidRequest e)
        {
            System.out.println(e);
            return;
        }
        this.Balance=this.Balance-amt;
        
    }
    void updateAccount()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        double amt;
      while(true)
      {        
        System.out.println("Press 1 to deposit, 2 to withdraw, 3 to display your account status. ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the deposit amount.");
                amt=sc.nextDouble();
                this.deposit(amt);
                break;
            case 2:
                System.out.println("Enter the withdrawal amount.");
                amt=sc.nextDouble();
                this.withdraw(amt);
                break;
            case 3:
                this.printStatus();
                break;
            default:
                System.out.println("Invalid input.");
                
        }
        System.out.println("Press 1 to repeat, 0 to exit. ");
        ch=sc.nextInt();
        if(ch==0)
            break;
      }
        
    }

}
class Main
{
    public static void main(String[]args)
    {
        String n,ad;
        long pan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name.");
        n=sc.nextLine();
        System.out.println("Enter your address.");
        ad=sc.next();
        System.out.println("Enter your PAN number.");
        pan=sc.nextLong();        
        Savings obj = new Savings(n,ad,pan);
        obj.addAccount(n,ad,pan);
        obj.updateAccount();
        
    }
}
