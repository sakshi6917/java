import java.util.Scanner;
class Employee{
    int id;
    String name;
    long salary;

    void setDetails(int id,String name,long salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void display()
    {
        System.out.println("Id:" + id + "  Name:" + name+ "  Salary:" + salary);
    }
}


class First{
    public static void main(String args[])
    {
      Employee e1=new Employee();
      Employee e2=new Employee();
      e1.setDetails(23,"Sakshi",10000);
      e2.setDetails(61,"Kritika",20000);
      e1.display();
      e2.display();
  
    }
}