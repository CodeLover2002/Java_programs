import java.util.*;
class InvalidScoreException extends Exception
{
    public InvalidScoreException(String str)
    {
        super(str);
    }
}
class Student
{
    int roll;
    String name;
    float score;
    
    public int setScore(float s)
    {
        try
        {
            if(s<0||s>100)
                throw new InvalidScoreException("The entered input is an invalid score.");
        }
        catch(InvalidScoreException e)
        {
            System.out.println(e);
            return -1;
        }
        this.score=s;
        return 0;
    }
    public void createStudentRecord()
    {
        int r; 
        String n;
        float s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        n=sc.nextLine();
        this.name=n;
        System.out.println("Enter the roll of the student: ");
        r=sc.nextInt();
        this.roll=r;
        System.out.println("Enter the score of the student: ");
        s=sc.nextFloat();        
        while(true)
        {
            int a=this.setScore(s);
            if(a==-1)
            {
                System.out.println("Please re-enter the score of the student: ");
                s=sc.nextFloat();
            }
            else
                break;
        }
        return;        
    }
    public void printRecord()
    {
        System.out.println("Name: "+this.name+"   Roll: "+this.roll+"   Score: "+this.score);
    }
}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student entries: ");
        int n=sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of STUDENT"+(i+1));
            students[i]=new Student(); 
            students[i].createStudentRecord();
        }
        System.out.println("The details of all the students are:-");
        for(int i=0;i<n;i++)
        {
            System.out.println("Student "+(i+1));
            students[i].printRecord();
        }
        
    }
}