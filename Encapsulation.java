class Human{
    private String name;
    private int age;
    public void setName(String n)
    {
     name=n;
    }
    public String getName()
    {
     return name;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }


}
class Encapsulation{
    public static void main(String args[])
    {
        Human obj=new Human();
        obj.setName("Sakshi");
        obj.setAge(20);
        System.out.println(obj.getName()+" "+ obj.getAge());
    } 
}