import java.util.Scanner;
class Seventh{
    public static void main(String args[])
    {   
        System.out.println("Enter any character:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z'))
        {
          System.out.println("The character is an alphabet");
        }
        else
        {
            System.out.println("The character is not an alphabet");
        }
        sc.close();
    }
}