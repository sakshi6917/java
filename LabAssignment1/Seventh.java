import java.util.Scanner;
class Seventh{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int vowels=0,consonents=0,digits=0,special=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((ch>='A'&& ch<='Z')|| (ch>='a' && ch<='z'))
            {
              if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
              {  
                vowels++;
              }
              else
              {
                consonents++;
              }
            }
            
            else if(ch>='0' && ch<='9')
            {
                digits++;
            }
            else
            {
                if(ch!=' ')
                  special++;
            }
        }
        System.out.println("The number of vowels in the given string is " + vowels);
        System.out.println("The number of consonents in the given string is " + consonents);
        System.out.println("The number of digits in the given string is " + digits);
        System.out.println("The number of special character in the given string is " + special);
    }
}