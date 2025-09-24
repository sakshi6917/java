//Method Overriding
//Here add() of Calc is overrided by add() of AdvanceCalc
//Method of super class is overridden by extended class method

class Calc{
    public int add(int n1, int n2)
    {
        return (n1+n2);
    }
}

class AdvanceCalc extends Calc{
    public int add(int n1, int n2)
    {
        return (n1+n2+1);
    }
}

class MethodOverriding{
    public static void main(String args[])
    {
        AdvanceCalc obj=new AdvanceCalc();
        int r1=obj.add(1,2);
        System.out.println(r1);
    }
}