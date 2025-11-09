class Vehicle{
    public void display()
    {
        System.out.println("vehicle");
    }
}

class Bus extends Vehicle{
    public void display()
    {
        System.out.println("Car is a vehicle");
    }
}

class TwentyFive{
    public static void main(String args[])
    {
      Bus obj =new Bus();
      obj.display();
    }
}