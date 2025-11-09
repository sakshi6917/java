class Car{
    String model;
    int year;

    Car(String m)
    {
        model=m;
        // year=2025;
    }

    Car(String n, int y )
    {
        model=n;
        year=y;
    }

    void display()
    {
        System.out.println("Car Model: " + model + " ,Year : " + year);
    }

}

class Seventh{
    public static void main(String args[])
    {
        Car obj1=new Car("Creta");
        Car obj2=new Car("BMW", 2025);
        obj1.display();
        obj2.display();

    }
}