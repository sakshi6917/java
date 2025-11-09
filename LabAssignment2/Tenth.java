class Shape{
    double area(){
        return 0;
    }
}

class Square extends Shape{
    float side;
    Square(float side)
    {
        this.side=side;
    }
    double area()
    {
        return side*side;
    }
}
class Rectangle extends Shape{
    float l,b;
    Rectangle(float l,float b)
    {
        this.l=l;
        this.b=b;
    }
    double area()
    {
        return l*b;
    }
}
class Triangle extends Shape{
    float base,height;
    Triangle(float base,float height)
    {
        this.base=base;
        this.height=height;
    }
    double area()
    {
        return 0.5*base*height;
    }
}


class Tenth{
    public static void main(String args[])
    {
    System.out.println(new Square(3).area());
    System.out.println(new Rectangle(3,4).area());
    System.out.println(new Triangle(4,5).area());
    }
}