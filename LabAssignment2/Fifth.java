abstract class Shape{
     
     abstract double area();

     void display(double a)
     {
        System.out.println("The area is : " + a);
     }
}

class Circle extends Shape{
    float r;
    void setCircleRadius(float r)
    {
        this.r=r;
    }
    double area()
    {
      return Math.PI*r*r;
    }
}

class Rectangle extends Shape{
    float l,b;
    void setRectLengthAndBreadth(float l, float b)
    {
        this.l=l;
        this.b=b;
    }

    double area()
    {
       return l*b;
    }
}



class Fifth{
    public static void main(String args[])
    {
      Circle obj1=new Circle();
      Rectangle obj2=new Rectangle();
      obj1.setCircleRadius(3);
      obj2.setRectLengthAndBreadth(3,4);
      double a1=obj1.area();
      obj1.display(a1);
      double a2=obj2.area();
      obj2.display(a2);
    }
}