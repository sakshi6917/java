import java.util.Scanner;
class Fourth{
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num%5==0 )&& (num%11==0))
          System.out.println(num +" is divisible by both 5 and 11");
        else
          System.out.println(num +" is not divisible by 5 and 11");
    }
}