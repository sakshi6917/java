import java.util.Scanner;
class Student{
    String name;
    int roll;
    int marks;
}
class ArrayOfObjects{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="Meghna";
        s1.roll=1;
        s1.marks=89;

        Student s2=new Student();
        s2.name="Shilpi";
        s2.roll=22;
        s2.marks=76;

        Student s3=new Student();
        s3.name="Kripa";
        s3.roll=43;
        s3.marks=97;
       
       Student students[]=new Student[3];             //not creating 3 ojects but creating an array which will hold student references 
       students[0]=s1;
       students[1]=s2;
       students[2]=s3;
       for(int i=0;i<students.length;i++)
       {
        System.out.println(students[i].name+ " : " + students[i].marks);
       }
       for(Student n:students)
       {
        System.out.println(n.name);
       }
    }
}

