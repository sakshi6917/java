import java.util.Scanner;
class Sixth{
    public static void main(String args[])
    {
        
        System.out.println("Enter the number of elements in the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n-2;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The array elements in ascending order is:");
        for(int i=0;i<n;i++)
        {
            System.out.println("arr["+i+"]: " + arr[i]);
        }
    }
}