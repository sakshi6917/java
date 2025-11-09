class Person{
    String name;
    void displayName(String name)
    {
        System.out.println("The Person name is " + name);
    }
}

class Student extends Person{
   void displayStudentDetails(int roll,int marks)
   {
    System.out.println("The student roll is " + roll + " and the marks is " + marks);
   }
}

class Eighth{
    public static void main(String args[])
    {
      Student obj=new Student();
      obj.displayName("Sakshi");
      obj.displayStudentDetails(4,97);
    }
}