//Single level Inheritance

class Calculator{
    public int add(int a,int b)
    {
        return (a+b);
    }
    public int subtract(int a,int b)
    {
        return (a-b);
    }
}

class AdvanceCalculator extends Calculator{
    public int multiply(int a,int b)
    {
        return (a*b);
    }
    public int divide(int a,int b)
    {
        return (a/b);
    }
}

// Multilevel Inheritance
class ProCalculator extends AdvanceCalculator{
    public double power(int n1,int n2)
    {
        return Math.pow(n1,n2);
    }
}

class InheritanceExample{
    public static void main(String args[])
    {
         AdvanceCalculator obj=new AdvanceCalculator();
         System.out.println("The multiplication is " + obj.multiply(3,4) + " and the sum is " + obj.add(3,4));
         ProCalculator obj1=new ProCalculator();
         System.out.println("The multiplication is " + obj1.multiply(2,4));
         System.out.println("The addition is " + obj1.add(2,4));
         System.out.println("The exponent is " + obj1.power(2,4));
    }
}