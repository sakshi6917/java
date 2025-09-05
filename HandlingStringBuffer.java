import java.util.Scanner;
class HandlingStringBuffer{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("sakshi");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" kartik");
        sb.insert(6," hello");
        sb.setLength(30);
        System.out.println(sb);
        
        
        // //capacity is assigned to strings to prevent the reallocation
        // StringBuffer sb=new StringBuffer("sakshi");
        // System.out.println(sb.capacity());          //capacity of stringbuffer is 16,extra 6 is added of sakshi(6 characters)
    }
}

