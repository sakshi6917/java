import java.util.Scanner;
class Fifth{
    public static void main(String args[]){
      System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      if((num&1)==0)
        System.out.println(num+ " is even");
      else
        System.out.println(num+ " is odd");
    }
}