/** To check whether a given number is perfect or not. 
Perfect number is a number whose sum of all factors is equal to the number itself.
Eg:- 6 =1*2*3=1+2+3 */
import java.util.*;

class Perfect {
    int num;

    Perfect(int nn) {
        num = nn;
    }

    int sum_of_factors(int n) {

        if(n==1)
            return 1;
        else if(num==n)
            return sum_of_factors(n-1);
        else if(num%n==0)
            return n+sum_of_factors(n-1);
        else
           return sum_of_factors(n-1); 
    }

    void check() {
        if (num == sum_of_factors(num))
            System.out.printf("%d is a perfect number.\n", num);
        else
            System.out.printf("%d is NOT a perfect number.\n", num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.printf("Enter a number\n");
        N = sc.nextInt();
        Perfect obj = new Perfect(N);
        obj.check();

    }

}