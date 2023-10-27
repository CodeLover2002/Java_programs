import java.util.*;
class Student
{
    int roll;
    String name;
    double marks;
}
class Main
{
    public static void main(String[]args)
    {
        Student s1= new Student();//allocating memory for an object s1 of Student class
        s1.roll =10;
        s1.name="Ritadri";
        Scanner sc = new Scanner(System.in);
        
        // what if we want to create multiple objects we do the following:-
        
        Student stdar[] = new Student[3];//declaring an array stdar that holds address of 3 objects of Student class
        for(int i=0;i<stdar.length;i++)
        {
            stdar[i]= new Student();//allocating memory for each object and storing its address at stdar[i]
            System.out.println("Enter the roll no, marks and name of Student"+(i+1)+" : ");// initialization of each object
            stdar[i].roll=sc.nextInt();
            stdar[i].marks= sc.nextDouble();
            stdar[i].name=sc.next();
        }
        for(Student s:stdar)//printing the value of each object using enhanced for loop
        {
            System.out.println("Name : "+s.name+"   Marks: "+s.marks+"  Roll No. "+s.roll);
        }
        
        
    }
}