class Conversion
{
    public static void main(String a[])
    {
        byte b=127;
        int n=b;
         System.out.println(n);
        // int n1=4;
        // byte b1=(byte)n1;
       
        // System.out.println(b1);    //prints 4

        int n1=257;
        byte b1=(byte)n1;       //it uses '%' operator and devide the number by the range of byte i.e 256(257%256=1)
        System.out.println(b1);

        float f=5.7f;
        int a1=(int)f;          
        System.out.println(a1);              //5( .7 is lost)

        //type promotion
        byte b2=20;
        byte b3=10;
        int result =b2*b3;
        System.out.println(result);            //200
    }
}