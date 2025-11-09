class Fruit{
    Fruit()
    {
        System.out.println("This is a fruit");
    }
}

class SourFruit extends Fruit{
    SourFruit()
    {
        System.out.println("This is a sour fruit");
    }
}

class Orange extends SourFruit{
    Orange()
    {
        System.out.println("Orange is a sour fruit");
    }
}

class TwentyOne{
    public static void main(String args[])
    {
      Orange obj=new Orange();
    }
}