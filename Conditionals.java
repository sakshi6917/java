class Conditionals{
    public static void main(String a[])
    {

        int x=19;
        if(x>=10 && x<20)
        {
           System.out.println(x);
           System.out.println("Thanks");
        }
        else if(x>15)
          System.out.println("Hello");         //not printed even if condition is true
        else
          System.out.println("Oops!Something wrong");
    }
}