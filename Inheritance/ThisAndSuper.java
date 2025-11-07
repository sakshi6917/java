// this() and super() method
// this() => calls the constructor of the same class
// super() => calls the default constructor of the super class
//Every class in java extends Object class

class A{
    A()
    {
      System.out.println("In A");
    }
    A(int n)
    {
        
      System.out.println("In A int");
    }
    
}
class B extends A{
    B()
    {
        super(5);
      System.out.println("In B");
    }
    B(int n)
    {
        // super(n);
        this();
      System.out.println("In B int");
    }
   
}

class ThisAndSuper{
    public static void main(String args[])
    {
      B obj=new B(6);
    }
    
}