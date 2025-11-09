interface Sports{
    void play();
}

class Person{
    String name;
    Person(String name){
      this.name=name;
    }
}

class Student extends Person implements Sports{
    Student(String name)
    {
        super(name);
    }
     public void play()
    {
        System.out.println(name + " plays");
    }
}

class TwentyThree{
    public static void main(String args[])
    {
      Student s =new Student("Sakshi");
      s.play();
    }
}