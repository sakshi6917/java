import java.util.Scanner;

class Second{
    public static void main(String args[])
    {
        System.out.println("Enter the number of which table is to be printed:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The table of " + num + " is");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}