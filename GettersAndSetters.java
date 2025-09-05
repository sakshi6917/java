class Human{
    private int age;
    private String name;

    // int getAge()
    // {
    //     return age;
    // }
    // String getName()
    // {
    //     return name;
    // }
    // void setAge(int age,Human obj)
    // {
    //     // this.age=age;
    //     Human obj1=obj;
    //     obj1.age=age;
    // }
    // void setName(String name,Human obj)
    // {
    //     Human obj1=obj;
    //     obj1.name=name;
    // }

    Human()
    {
        age=12;
        name="Rohan";
    }
    int getAge()
    {
        return age;
    }

    void setAge(int age)
    {
        this.age=age;
    }

    String getName()
    {
        return name;
    }
  
    void setName(String name)
    {
        this.name=name;
    }
}

class GettersAndSetters{
    public static void main(String args[]){
      Human obj1=new Human();
      //   obj1.setAge(35,obj1);
      //   obj1.setName("sakshi",obj1);
      obj1.setName("kartik");
      System.out.println(obj1.getName());
      System.out.println(obj1.getAge());
      //   obj1.setName("Kartik");
      //   System.out.println(obj1.getAge());
    }
}