class Operators{
    public static void main(String a[])
    { 
        //Arithmetic Operators
        // int num1=4;
        // int num2=5;
        // int result=num1%num2;
        // System.out.println(result);
        int num=3;
        //num+=1;
        //num++;     //3
        // int newResult=num++;             //3
        int newResult=++num;             //4
        System.out.println(newResult);
        System.out.println(num);         //4

        //Relational Operators
        int b=7;
        int c=4;
        // System.out.println(b<c);  false
        // boolean result= (b>=c);       //true
        boolean result= b!=c;           //T
        System.out.println(result);

        //Relational Operators
        int x=4;
        int y=2;
        int s=5;
        int t=6;
        // boolean myResult= x>y && s>t;
        boolean myResult= x>y || s>t || 2<1;
        System.out.println(myResult);
        boolean p= !true;
        System.out.println(p);

    }
}