class WhileLoop{
    public static void main(String a[])
    {
        int num=1;
        // while(num<=10)
        // {
        //     System.out.println(num);
        //     num++;
        // }

        //nested while
        while(num<=5)
        {
            System.out.println("Hello" + num);
            int j=1;
            while(j<=3)
            {
                System.out.println(j);
                j++;
            }
            num++;
        }
    }
}