class Student{
    String name;
    int age;

    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

     String toString()
    {
        return name+ " (" + age + ")" ;
    }
}

class TwentyNine{
    public static void main(String args[])
    {
      Student s=new Student("Sarika",20);
      System.out.println(s);
    }
}