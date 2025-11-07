interface A
{
    void show();
    void config();
}

interface B{
    void run();
}

interface X extends B{

}

class C implements A,B{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("In run");
    }
}

class MultipleInheritanceUsingInterfaces{
    public static void main(String args[])
    {
      A obj=new C();
      obj.show();
      obj.config();

      B obj1=new C();
      obj1.run();
    //   obj.run();
    }

}