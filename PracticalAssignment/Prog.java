import java.util.*;

class Student {

    boolean check(float p) {
        if (p > 0.5)
            return true;
        else
            return false;
    }

}

class Teacher {

    public static void main(String[] args) {
        Student ob = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage ratio out of 1 ");
        float z = sc.nextFloat();
        System.out.println(ob.check(z) ? "Pass" : "Fail");
    }

}
