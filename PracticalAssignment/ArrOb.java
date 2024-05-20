import java.util.*;
class Person
{
    String Name;
    long phno;
    Person(String n,long ph)
    {
        this.Name=n;
        this.phno=ph;
    }
    void toString()
    {
        System.out.println("Name: "+this.Name);
        System.out.println("Phone Number: "+this.phno);
    }
}
class Student extends Person
{
    int roll;
    int rank;
    int grade;
    Student(String n,long p,int R,int rn,int g)
    {
        super(n,p);
        roll=R;
        rank=rn;
        grade=g;
    }
    void toString()
    {   
        Person ob= new Person(this.Name,this.phno);
        ob.toString();
        System.out.println("Roll No: "+this.roll);
        System.out.println("Rank: "+this.rank);
        System.out.println("Grade: "+this.grade);
    }

}
class Teacher extends Person
{
    int exp;
    String qualf;
    Teacher(String n,long p,int y,String q)
    {
        super(n,p);
        exp=y;
        qualf=q;
    }
    
}
class Main
{
    public static void main(String[]args)
    {
        Student[] std = new Student[3];//an array storing addresses of 3 student objects
        std[0]=new Student()
        
    }
}