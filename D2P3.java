import java.util.*;

class Account {
    int acno;
    double bal;
    String dot;

    Account() {
        acno = 0;
        bal = 0;
        dot = "";
    }

    public void update(int a, double b, String s) {
        this.acno = a;
        this.bal = b;
        this.dot = s;
    }

    public void deposit(double amt, String cd) {
        this.bal += amt;
        this.dot = "Amount of Rs." + amt + " deposited on " + cd;
    }

    public void withdraw(double amt, String cd) {

        if (amt <= this.bal) {
            this.bal -= amt;
            this.dot = "Amount of Rs." + amt + " withdrawn on " + cd;
        } else {
            System.out.println("Invalid Transaction");
        }

    }

    public void createAc() {
        int an;
        double ab;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last transaction with date: ");
        s = sc.nextLine();
        System.out.println("Enter your account number: ");
        an = sc.nextInt();
        System.out.println("Enter your account balance: ");
        ab = sc.nextDouble();
        update(an, ab, s);
    }

    public void display() {
        System.out.println("Your account number is: " + this.acno);
        System.out.println("Your account balance is: " + this.bal);
        System.out.println("Your last transaction: " + this.dot);
    }

}

class Transaction {

    public static void main(String[] args) {
        Account ob1 = new Account();
        Account ob2 = new Account();
        Account ob3 = new Account();
        Account ob4 = new Account();
        Account ob5 = new Account();

        System.out.println("\n");
        System.out.println("Enter details of account 1:\n ");
        ob1.createAc();
        System.out.println("Enter details of account 2:\n ");
        ob2.createAc();
        System.out.println("Enter details of account 3:\n ");
        ob3.createAc();
        System.out.println("Enter details of account 4:\n ");
        ob4.createAc();
        System.out.println("Enter details of account 5:\n ");
        ob5.createAc();

        int ch, ch2;
        double amt;
        String d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your amount of deposit or withdrawal: ");
        amt = s.nextDouble();
        System.out.println("Enter current date: ");
        d = s.next();
        System.out.println("(Press 1 for account 1, 2 for account 2...) Enter your choice: ");
        ch = s.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Press 1 to deposit 2 to withdraw:");
                ch2 = s.nextInt();
                if (ch2 == 1)
                    ob1.deposit(amt, d);
                else
                    ob1.withdraw(amt, d);
                System.out.println("Your current details are:");
                ob1.display();
                break;
            case 2:
                System.out.println("Press 1 to deposit 2 to withdraw:");
                ch2 = s.nextInt();
                if (ch2 == 1)
                    ob2.deposit(amt, d);
                else
                    ob2.withdraw(amt, d);
                System.out.println("Your current details are:");
                ob2.display();
                break;
            case 3:
                System.out.println("Press 1 to deposit 2 to withdraw:");
                ch2 = s.nextInt();
                if (ch2 == 1)
                    ob3.deposit(amt, d);
                else
                    ob3.withdraw(amt, d);
                System.out.println("Your current details are:");
                ob3.display();
                break;
            case 4:
                System.out.println("Press 1 to deposit 2 to withdraw:");
                ch2 = s.nextInt();
                if (ch2 == 1)
                    ob4.deposit(amt, d);
                else
                    ob4.withdraw(amt, d);
                System.out.println("Your current details are:");
                ob4.display();
                break;
            case 5:
                System.out.println("Press 1 to deposit 2 to withdraw:");
                ch2 = s.nextInt();
                if (ch2 == 1)
                    ob5.deposit(amt, d);
                else
                    ob5.withdraw(amt, d);
                System.out.println("Your current details are:");
                ob5.display();
                break;
            default:
                System.out.println("Wrong Choice:");
        }
    }
}
