class Calculate{
    int num=5;
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public int add(int c, int d)
    {
        return c+d;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}

class MethodOverloading{
    public static void main(String args[])
    {
        int num1=3;
        int num2=1;
        int num3=9;
        Calculate obj1=new Calculate();
        Calculate obj2=new Calculate();
        Calculate obj3=new Calculate();
        int r1=obj1.add(num1,num2,num3);
        System.out.println(r1);
        int r2=obj2.add(num1,num2);
        System.out.println(r2);
        int r3=obj3.add(num1,num2);
        System.out.println(r3);

        obj1.num=8;
        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }

}