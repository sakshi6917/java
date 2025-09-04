import java.util.Scanner;

class Fourth{
    public static void main(String args[])
    {
      System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      if(num==0)
      {
        System.out.println(0);
      }
      while(num>0)
      {
        int r=num%10;
        System.out.print(r);
        num=num/10;
      }
    }
}