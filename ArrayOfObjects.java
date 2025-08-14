import java.util.Scanner;
class Student{
    int roll;
    String name;
    int marks;

}
class ArrayOfObjects{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.roll=48;
        s1.name="Shipra";
        s1.marks=79;

        Student s2=new Student();
        s2.roll=21;
        s2.name="Maahi";
        s2.marks=82;

        Student s3=new Student();
        s3.roll=35;
        s3.name="Divya";
        s3.marks=94;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        System.out.println();
        for(Student stud:students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}