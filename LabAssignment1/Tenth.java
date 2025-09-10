import java.util.Scanner;
class Tenth{
    public static void main(String args[])
    {
        System.out.println("Arguments in reverse order:");
        for(int i=args.length-1;i>=0;i--)
        {
            System.out.print(args[i]+" ");
        }
    }
}