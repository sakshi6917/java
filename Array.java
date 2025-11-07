class Array{
    public static void main(String args[])
    {
        // int num[]={4,2,7};
        // for (int i=0;i<3;i++)
        // {
        //     System.out.println(num[i]);
        // }

        //Or
       int num[]=new int[4];
       num[0]=4;
       num[1]=10;
       num[2]=1;
       num[3]=5;
       for(int i=0;i<num.length;i++)
       {
        System.out.println(num[i]);
       }
       for(int n:num)
       {
        System.out.print(n + " ");
       }

    }
}