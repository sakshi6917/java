class Counter{
   
    static int count=0;

   Counter()
   {
    count++;
   }
    static void showCount()
    {
        System.out.println("Current count is: "+ count);
    }
}

class Fourth{
    public static void main(String args[])
    {
      Counter obj1=new Counter();
      Counter obj2=new Counter();
      Counter obj3=new Counter();
      
      Counter.showCount();
    }
}