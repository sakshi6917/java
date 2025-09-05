class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }

    //Static block
    static{
        name="Smartphone";
        System.out.println("In static block");
    }
}

class StaticKeyword{
    public static void main(String args[]){
    Mobile obj1=new Mobile();
    obj1.brand="Samsung";
    obj1.price=1200;
    Mobile.name="smartphone";                      //static variable is accessed by class name in which it is declared

    Mobile obj2=new Mobile();
    obj2.brand="Apple";
    obj2.price=5400;
    Mobile.name="smartphone";
    
    // obj1.name="Phone";            //since name variable is static(all are same), so it also overwrites name for obj2 also
    System.out.println(obj1.brand);
    obj1.show();
    obj2.show();
    // System.out.println(Mobile.name);
    Mobile.show1(obj2);               //to access non-static variables in a static method we pass the object
    }
}