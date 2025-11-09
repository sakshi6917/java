import java.util.Scanner;

class Student{
    int roll;
    String name;
    float marks;
    Student()
    {
        roll=0;
        name=null;
        marks=0.0f;
    }
    Student(int roll,String name,float marks)
    {
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    Student(Student s){
        roll=s.roll;
        name=s.name;
        marks=s.marks;
    }
    void display()
    {
        System.out.println("roll:" + roll +" name:" + name + " marks:" + marks);
    }
}
class Second{
  public static void main(String args[])
  {
    Student s1=new Student();
    Student s2=new Student(4,"Shipra",48.5f);
    Student s3=new Student(s2);
    s1.display();
    s2.display();
    s3.display();
  }
}
