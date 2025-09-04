import java.util.Scanner;
class Thirteen{
    public static void main(String args[])
    {
      System.out.println("Enter the amount:");
      Scanner sc=new Scanner(System.in);
      int amount=sc.nextInt();
      int notes[]={2000,500,200,100,50,20,10,5,2,1};
      int count;
      for(int i=0;i<notes.length;i++)
      {
        while(amount>=notes[i])
        {
            count= amount/notes[i];
            amount=amount%notes[i];
            System.out.println(notes[i] + ": " + count);
        }
      }
    }
}