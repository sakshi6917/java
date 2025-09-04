import java.util.Scanner;
class Ninth{
    public static void main(String args[])
    {
        System.out.println("Enter any character:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.println("The character is an alphabet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("The character is a digit");
        }
        else System.out.println("It is a special character");
    }
}