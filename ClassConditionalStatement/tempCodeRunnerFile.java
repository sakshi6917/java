import java.util.Scanner;

import Inheritance.InheritanceExample;
class First{
    public static void main(String args[])
    {
        System.out.println("Enter the numbers:");
        Scanner sc =new Scanner(System.in);
         ProCalculator obj1=new ProCalculator();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
          System.out.println(num1 + " is greater");
       else
          System.out.println(num2 + " is greater");
    }
}