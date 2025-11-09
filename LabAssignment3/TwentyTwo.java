class A{
    void display(){
        System.out.println("In A display");
    }
}

class B{
    void display(){
        System.out.println("In B display");
    }
}

class C extends A,B{
     void display(){
        System.out.println("In C display");
     }
}

class TwentyTwo{
    public static void main(String args[])
    {

       C obj=new C();
       obj.display();
        
     
    }
}