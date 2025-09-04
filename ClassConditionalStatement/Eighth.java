import java.util.Scanner;
class Eighth{
    public static void main(String args[])
    {
      System.out.println("Enter any alphabet:");
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
       if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
       {
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
         {
            System.out.println("The character is a vowel");
         }
         else{
            System.out.println("The character is not a vowel");
         }
       }
       sc.close();
    }
}