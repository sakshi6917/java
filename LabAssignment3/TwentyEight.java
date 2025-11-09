class Area{
    double CalculateArea(double r)
    {
        return Math.PI*r*r;
    }
    double CalculateArea(double l,double b)
    {
        return l*b;
    }
    int CalculateArea(int s)
    {
        return s*s;
    }
}

class TwentyEight{
    public static void main(String args[])
    {
      Area obj=new Area();
      System.out.println("Circle area: " + obj.CalculateArea(4.0));
      System.out.println("Rectangle area: " + obj.CalculateArea(5,7));
      System.out.println("Square area: " + obj.CalculateArea(7));
    }
}