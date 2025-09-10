import java.util.Scanner;

class Student{
  String name;
  int roll;
  char grade;
  Student()
  {
    name="Sakshi";
    roll=51;
    grade='A';
  }
  void display()
  {
    System.out.println("name:"+ name + " roll:" + roll + " grade:" + grade);
  }
}

class Third{
    public static void main(String args[])
    {
      Student s=new Student();
      s.display();
    }
}