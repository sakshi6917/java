class SwitchCase{
    public static void main(String a[])
    {
        //switch taking integer
        // int num=2;
        // switch(num)
        // {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Sunday");
        //         break;
        // }



        //Switch taking string

        //  String day="Friday";
        //  switch(day)
        //  {
        //     case "Monday","Tuesday"-> System.out.println("6am");     //instead of using break '->' can be used too print statement
        //         // System.out.println("6am");
        //         // break;
        //     case "Wednesday"->System.out.println("8am");
        //         // System.out.println("8am");
        //         // break;
        //     default->System.out.println("7am");
        //         // System.out.println("7am");
        //         // break;
        //  }


         //Switch as an expression

        //  String day="Saturday";
        //  String result="";
        //  switch(day)
        //  {
        //     case "Monday","Tuesday"->result="6am";      //we are using printing time again and again, so we can keep it in a variable and change values a/c to case and then lastly print it 
        //     case "Wednesday"->result="8am";
        //     default->result="7am";
        //  }
        //  System.out.println(result);

        //OR
        //  String day="Saturday";
        //  String result="";
        //  result=switch(day)
        //  {
        //     case "Monday","Tuesday"->"6am";      //we are using printing time again and again, so we can keep it in a variable and change values a/c to case and then lastly print it 
        //     case "Wednesday"->"8am";
        //     default->"7am";
        //  };                                     //dont forget to put a ';' here 
        //  System.out.println(result);


        //OR
         String day="Saturday";
         String result="";
         result=switch(day)
         {
            case "Monday","Tuesday":yield "6am";      //we are using printing time again and again, so we can keep it in a variable and change values a/c to case and then lastly print it 
            case "Wednesday": yield "8am";
            default: yield "7am";
         };                                     //dont forget to put a ';' here 
         System.out.println(result);



    }
}