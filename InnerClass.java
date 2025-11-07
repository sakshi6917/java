class Girls{
    int age=20;
    public void showAge()
    {
        System.out.println("The age is " + age);
    }

    class HostelGirls{
        public void showName()
        {
            System.out.println("The name is Sakshi");
        }

    }
}

class InnerClass{
    public static void main(String args[])
    {
      Girls obj=new Girls();
      Girls.HostelGirls obj1= obj.new HostelGirls();
      obj.showAge();
      obj1.showName();
    }
}