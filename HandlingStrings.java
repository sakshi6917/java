import java.util.Scanner;
class HandlingStrings{
    public static void main(String args[])
    {
        // String name="Sakshi";
        String name=new String("Sakshi");
        name=name+"kumari";
        System.out.println("Hello "+name);
        // System.out.println("Hello "+name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat("Kumari"));
        name=name+"sakshi";
        System.out.println(name);

        String s1="kartik";
        String s2="kartik";
        System.out.println(s1==s2);

        StringBuffer sb=new StringBuffer("sakshi");
        System.out.println(sb.capacity());          //capacity of stringbuffer is 16,extra 6 is added of sakshi(6 characters)

    }
}