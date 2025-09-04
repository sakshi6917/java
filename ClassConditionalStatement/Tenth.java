import java.util.Scanner;
class Tenth{
    public static void main(String args[])
    {
        System.out.println("Enter the alphabet:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            if(ch>='a' && ch<='z')
             {
                System.out.println(ch +" is in lowercase");
             }
            else if(ch>='A' && ch<='Z')
             {
                System.out.println(ch +" is in uppercase");
             }
        }
        else
        {
            System.out.println("The character is not an alphabet");
        }
    }
}