class Animal{
    void animal()
    {
        System.out.println("Every animal has two legs and two hands");
    }
}

class Mammal extends Animal{
    void mammal()
    {
     System.out.println("Every mammal has mammary glands ");
    }
    
}

class Human extends Mammal{
    void human()
    {
      System.out.println("Every Human is an animal as well as a mammal");
    }
    
}

class Ninth{
    public static void main(String args[])
    {
       Human obj=new Human();
    obj.animal();
    obj.mammal();
    obj.human();
    }
  
}