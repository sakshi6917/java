interface A{

    int age=44;              //all variables are public and static
    public void show();
    public void print();
}

class B implements A{
    public void show()
    {
        System.out.println("hello from show");
    }
    public void print()
    {
        System.out.println("hello from print");
    }
}

class Interfaces{
    public static void main(String args[])
    {
      A obj=new B();
      obj.show();
      obj.print();
      System.out.println(obj.age);
    }
}