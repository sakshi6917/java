class Computer{
    public int add(int a, int b)
    {
      return a+b;
    }

    public String getMeAFlower(int cost)
    {
        if(cost>=10)
          return "Flower";

        return "Nothing";  
    }


}

class CreatingObject{
    public static void main(String args[])
    {
      int num1=4;
      int num2=6;
      int cost=12;
      Computer comp =new Computer();
      int result=comp.add(num1,num2);
      System.out.println(result);
      String str=comp.getMeAFlower(cost);
      System.out.println(str);
    }
}