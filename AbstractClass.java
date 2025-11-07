abstract class Car{
    public abstract void drive();
    public abstract void show();
    public void fly()
    {
        System.out.println("In show");
    }
}

 abstract class WagonR extends Car{
   
    public void show()
    {
        System.out.println("In show");
    }
}
/* key point
   If a class is not able to define the abstract methods of abstract class then it also becomes abstract class

 */

class VolksWagon extends WagonR{
  public void drive()
  {
    System.out.println("In drive");
  }
}

class AbstractClass{
    public static void main(String args[])
    {
        // Car obj=new WagonR();    now this will not work
        Car obj=new VolksWagon();    
        obj.drive();
        obj.show();
    }
}