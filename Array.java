class Array{
    public static void main(String args[])
    {
        // int num[]={4,2,7};
        // for (int i=0;i<3;i++)
        // {
        //     System.out.println(num[i]);
        // }

        //Or
        int num[]=new int[3];
        num[0]=4;
        num[1]=2;
        num[2]=7;
        for(int i=0;i<3;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        for(int n:num)
        {
                System.out.print(n +" ");
        }
        System.out.println();
    }
}