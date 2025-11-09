// class Person{
//     String name;
//     Person(String name)
//     {
//         this.name=name;
//         System.out.println("Person constructor called for "+ name);
//     }

// }
// class Student extends Person{
//     int roll;
//     Student(String name,int roll)
//     {
//       super(name);
//       this.roll=roll;
//       System.out.println("Student constructor called for roll " +roll);
//     }
// }

class Person{
    String name;
    Person(String name)
    {
        this.name=name;
        System.out.println("Parent constructor called");
    }
}

class Student extends Person{
    int roll;
    Student(String name,int roll)
    {
        super(name);
        this.roll=roll;
        System.out.println("child constructor called");
    }
}

class Sixth{
    public static void main(String args[])
    {
        Student s1=new Student("Sakshi" , 251);
        System.out.println(s1.name + " " + s1.roll);
    }
}