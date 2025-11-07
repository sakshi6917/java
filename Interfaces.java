interface Computer{

    void code();         //all methods are by default public abstract and all the variables are final and static
}


class Laptop implements Computer{
    public void code()
    {
        System.out.println("Coding using laptop");
    }
}
class Desktop implements Computer{
    public void code()
    {
        System.out.println("Coding using desktop");
    }
}

class Developer{
    public void devApp(Computer c)
    {
        c.code();
    }
}

class Interfaces{
    public static void main(String args[])
    {
      Computer lap=new Laptop();
      Computer desk=new Desktop();
      lap.code();
      desk.code();
      Developer obj=new Developer();
      obj.devApp(desk);
    }
}