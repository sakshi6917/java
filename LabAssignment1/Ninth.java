import java.util.Scanner;
class Ninth{
    public static void main(String args[])
    {
        System.out.println("Simple Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num1=sc.nextInt();
        System.out.println("Enter another number");
         int num2=sc.nextInt();
         System.out.println("Enter the operation from  +,-,*,/,%" );
         char ch=sc.next().charAt(0);
         int result=0;
         switch(ch)
         {
            case '+'-> result=num1+num2;
            case '-'-> result=num1-num2;
            case '*'-> result=num1*num2;
            case '/'-> result=num1/num2;
            case '%'-> result=num1%num2;
            default -> System.out.println("Invalid");
         }
         System.out.println(result);
    }
}