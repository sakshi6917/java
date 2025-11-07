class Human{
    private int age;
    private String name;
    
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
      obj1.setName("kritika");
      System.out.println(obj1.getName());
      System.out.println(obj1.getAge());
      //   obj1.setName("Kartik");
      //   System.out.println(obj1.getAge());
    }
}