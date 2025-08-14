import java.util.Scanner;

class Third{
    public static void main(String args[])
    {
        System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
       if(num1>num2)
       {
        if(num1>num3)
        {
            System.out.println(num1 + " is greatest");
        }
       }
        else if(num2>num1)
       {
        if(num2>num3)
        {
            System.out.println(num2 + " is greatest");
        }
       }
       else
       {
        System.out.println(num3 + " is greatest");
       }
      
    }
}