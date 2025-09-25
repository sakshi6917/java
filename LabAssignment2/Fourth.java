// class Employees{
//     int id;
//     String name;
//     static float salary;

//     static{
//         salary=48000.0f;
//     }

//     static void show(Employees obj)
//     {
//         System.out.println(obj.id + " " +  obj.name + " " + salary);
//     }
// }
class Employees{
    int id;
    String name;
    static float salary;

    static{
        salary=44000.0f;
    }

    static void show()
    {
        System.out.println("the salary is: "+ salary);
    }
}

class Fourth{
    public static void main(String args[])
    {
      Employees e1=new Employees();
      e1.name="Shilpi";
      e1.id=2;
    //   Employees.show(e1);
    //   System.out.println( e1.id + " " + e1.name + " " + Employees.salary);
    Employees.show();
    }
}