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
    Student(int r,String n)
    {
        roll=r;
        name=n;
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
      Student s1=new Student(21,"kritika");
       System.out.println(s1.roll+" " + s1.name + " " + s1.marks);

    }
}