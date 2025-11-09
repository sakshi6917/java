abstract class Employee{
    abstract double pay();
}

class Manager extends Employee{
    double pay(){
       return 80000;
    } 
}
class Clerk extends Employee{
    double pay(){
       return 30000;
    } 
}
class SalesPerson extends Employee{
    double pay(){
       return 30000+5000;
    } 
}

class TwentySeven{
    public static void main(String args[]){
      Employee obj1=new Manager();
      Employee obj2=new Clerk();
      Employee obj3=new SalesPerson();
      System.out.println("Manager salary: " + obj1.pay() );
      System.out.println("Clerk Salary " + obj2.pay());
      System.out.println("SalesPerson Salary: " + obj3.pay()); 
    }
}