import java.util.Scanner;
class First{
    public static void main(String args[])
    {
        System.out.println("Enter the two numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1 + " is greater");
        }
        else{
            System.out.println(num2 + " is greater");
        }

    }
}