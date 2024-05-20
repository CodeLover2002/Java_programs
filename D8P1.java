import java.util.*;
class AdditionNotPossibleException extends Exception
{
    public AdditionNotPossibleException(String str)
    {
        super(str);
    }
}
class Matrix
{   
    int row;
    int col;
    int mat[][];
        
    public Matrix(int r,int c)
    {
        row=r;
        col=c;
        mat=new int[row][col];
    
    }
    public int getElementAt(int r,int c)
    {
        if(r>=row||c>=col)
            return -1;
        return mat[r][c];
    }
    public void setElementAt(int el,int r,int c)
    {
        if(r>=row||c>=col)
            System.out.println("The position does not exist.");
        else
            mat[r][c]=el;       
    }
    public void findItem(int x)
    {
        int ex=0;
        for(int i=0;i<row;i++)
        {   
            for(int j=0;j<col;j++)
            {    
                if(mat[i][j]==x)
                    {
                        System.out.println("The item "+x+" exists in the matrix. ");
                        ex++;
                        return;
                    }
            }            
        }
        if(ex==0)
            System.out.println("The item "+x+" do not exist in the matrix. ");
            
    }
    public Matrix addMatrix(Matrix ob2)
    {
        Scanner so = new Scanner(System.in);
        System.out.println("Enter the exception statement you want to print if addition is not possible.");
        String s= so.nextLine();
        try
        {
            if(this.row!=ob2.row || this.col!=ob2.col)
                throw new AdditionNotPossibleException(s);
        }
        catch(AdditionNotPossibleException e)
        {
            System.out.println(e);
            return this;
        }
        int sum=0;
        Matrix ob3 = new Matrix(row,col);
        for(int i=0;i<row;i++)
        {   
            for(int j=0;j<col;j++)
            {
                sum=this.getElementAt(i,j)+ob2.getElementAt(i,j);
                ob3.setElementAt(sum,i,j);    
            }
            
        }
                
        return ob3;
    }
    public void createMatrix()
    {
        Scanner s=new Scanner(System.in);
        int el;
        for(int i=0;i<this.row;i++)
        {
            System.out.print("Enter the elements of row "+(i+1)+":  ");
            for(int j=0;j<this.col;j++)
            {
                el=s.nextInt();
                this.setElementAt(el,i,j); 
            }
            System.out.println();
        }
                     
    }
    public void printMatrix()
    {
        System.out.println("The addition matrix is: ");        
        for(int i=0;i<this.row;i++)
        {
            for(int j=0;j<this.col;j++)
            {
                System.out.print(this.getElementAt(i,j)+" ");    
            }
            System.out.println();
        }
                     
    }
}
class Main
{
    public static void main(String[]args)
    {
        int r,c; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension(r,c) of Matrix1: ");
        r=sc.nextInt();
        c=sc.nextInt();
        Matrix ob1 = new Matrix(r,c);
        ob1.createMatrix();
        System.out.println("Enter the dimension(r,c) of Matrix2: ");
        r=sc.nextInt();
        c=sc.nextInt();
        Matrix ob2 = new Matrix(r,c);
        ob2.createMatrix();
        Matrix obj = ob1.addMatrix(ob2);
        if(obj==ob1)
            System.out.println("The matrices could not be added.");
        else
            obj.printMatrix();
                
    }
}