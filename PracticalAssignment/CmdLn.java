class Command
{
        public static void main(String[]args)
        {
          System.out.println("My Name is: ");
          String s1= args[0]+" "+args[1];
          main(s1);
        }
        public static void main(String args)
        {
            System.out.println(args);
        }
    
}