import java.util.Scanner;
class HandlingStrings{
    public static void main(String args[])
    {
        String name=new String("Sakshi");
        System.out.println(name);
        name=name+" kumari";
        System.out.println(name.concat(" hello"));
        System.out.println(name);
        System.out.println(name.charAt(7));
        System.out.println(name.indexOf("s"));            //it is giving 3 but what if we want index of first s
        String s1="kartik";
        System.out.println(s1.indexOf('k'));              //it is giving index of first k
        String s2=s1;
        // String s2="kartik";
        System.out.println(s2==s1);

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