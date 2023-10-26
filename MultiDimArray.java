import java.util.*;
class AO
{
    public static void main(String[]args)
    {
        int arr[][]=new int[3][4];//syntax to declare multidimensional array in java
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=(int)(100*Math.random());   
            }
        }//generating 2 dimensional arrays
        for(int n[]:arr)// printing using enhanced for loop where n[] is 1D array extracted from arr[][]
        {
            for(int m:n)// m is the element inside the one dimensional array n[]
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        int jarr[][]=new int[3][];// this is a jagged array where no. of 1D array is specified but not the number of columns
        jarr[0]= new int[3]; // no.of elements in row 0
        jarr[1]= new int[5]; // no.of elements in row 1
        jarr[2]= new int[7];//// no.of elements in row 2
        for(int i=0;i<jarr.length;i++)//no.of rows
        {
            for(int j=0;j<jarr[i].length;j++)//no. of columns in each row
            {
                jarr[i][j]=(int)(100*Math.random());   
            }
        }
        for(int n[]:jarr)// printing using enhanced for loop where n[] is 1D array extracted from arr[][]
        {
            for(int m:n)// m is the element inside the one dimensional array n[]
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        
    }

}