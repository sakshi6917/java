import java.util.Scanner;
class Twelfth{
    public static void main(String args[])
    {
        System.out.println("Enter month number:");
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        String result="";
        result=switch(month)
        {
          case 1->"January";
          case 2->"February";
          case 3->"March";
          case 4->"April";
          case 5->"May";
          case 6->"June";
          case 7->"July";
          case 8->"August";
          case 9->"September";
          case 10->"October";
          case 11->"Novmber";
          case 12->"December";
          default->"Invalid month number";
        };
        System.out.println(result);
    }
}