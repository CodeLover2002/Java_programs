import java.util.*;
interface Move
{
    int z=10;
    public int score();//abstract function
}
class Run implements Move
{
    public int score()
    {
        return 100;
    }
}
class Walk implements Move
{
    public int score()
    {
        return 50;
    }
}
class Main
{
    public static void main(String[]args)
    {
        Run ob1=new Run();
        Walk ob1= new Walk();
        System.out.println("Total Score: ",(ob1.score()+ob2.score()));
    }
}