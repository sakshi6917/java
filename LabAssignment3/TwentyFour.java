class Multiplication{
    double multiply(double a, double b)
    {
        return a*b;
    }
    double multiply(double a, double b,double c)
    {
        return a*b*c;
    }
}

class TwentyFour{
    public static void main(String args[])
    {
      Multiplication obj=new Multiplication();
      double a1=obj.multiply(2,3);
      System.out.println(a1);
      double a2=obj.multiply(4,2,3);
      System.out.println(a2);
    }
}