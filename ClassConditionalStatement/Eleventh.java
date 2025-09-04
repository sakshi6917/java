import java.util.Scanner;
class Eleventh{
    public static void main(String args[])
    {
        System.out.println("Enter the week number from (1-7)");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        String result="";
        // switch(day)
        // {
        //     case 1->result="Monday";            //  '->' is used insted of break
        //     case 2->result="Tuesday";
        //     case 3->result="Wednesday";
        //     case 4->result="Thursday";
        //     case 5->result="Friday";
        //     case 6->result="Saturday";
        //     case 7->result="Sunday";
        //     default->result="Enter any number from 1-7 only";
        // }
        // System.out.println(result);

        result=switch(day)
        {
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            case 7->"Sunday";
            default->"Invalid week number";
        };
        System.out.println(result);
    }
}