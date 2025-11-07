// class Human{
//     private String name;
//     private int age;
//     public void setName(String n)
//     {
//      name=n;
//     }
//     public String getName()
//     {
//      return name;
//     }
//     public void setAge(int a)
//     {
//         age=a;
//     }
//     public int getAge()
//     {
//         return age;
//     }


// }
// class Encapsulation{
//     public static void main(String args[])
//     {
//         Human obj=new Human();
//         obj.setName("Sakshi");
//         obj.setAge(20);
//         System.out.println(obj.getName()+" "+ obj.getAge());
//     } 
// }

class Human{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    
}

class Encapsulation{
    public static void main(String args[])
    {
        Human obj=new Human();
        obj.setAge(20);
        obj.setName("Shraddha");
        System.out.println("The age is: " + obj.getAge() +" and the Name is " +obj.getName());
    }
}