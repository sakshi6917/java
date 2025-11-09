class Shapes{
    void draw()
    {
        System.out.println("draw shape");
    }
}

class Square extends Shapes{
    void draw()
    {
        System.out.println("draw square");
    }
}

class Thirty{
    public static void main(String args[])
    {
      Shapes obj=new Square();
      obj.draw();
    }
}