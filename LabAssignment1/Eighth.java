import java.util.Scanner;
class Eighth{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0],max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("The maximum element in the array is "+ max +" and the minimum is "+ min);

    }
}