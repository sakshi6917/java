import java.util.Scanner;
class Student{
    int roll;
    String name;
    static int marks;
    Student()
    {
        roll=0;
        name=null;
        // marks=40;
            System.out.println("Inside constructor");
    }
    static{
        marks=43;
        System.out.println("Inside static block");
    }
}
class Constructors{
    public static void main(String args[])
    {
      Student s=new Student();
      System.out.println(s.roll+" " + s.name + " " + s.marks);
      s.roll=4;
      s.name="sakshi";
      System.out.println(s.roll+" " + s.name + " " + s.marks);
    }
}