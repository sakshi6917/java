abstract class Car{
    public abstract void drive();
    public void playMusic()
    {
        System.out.println("Music playing");
    }
}

class WagonR extends Car{
    public void drive()
    {
        System.out.println("driving");
    }
}
class AbstractClass{
  public static void main(String args[])
  {
    WagonR obj=new WagonR();
    obj.drive();
    obj.playMusic();

  }
}