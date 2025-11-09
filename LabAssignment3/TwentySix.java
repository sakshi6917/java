class Base{
    void show(){
        System.out.println("Base");
    }
}

class Child extends Base{
    void show(){
        System.out.println("Child");
    }
}

class TwentySix{
    public static void main(String args[])
    {
      Base obj=new Child();
      obj.show();
    }
}