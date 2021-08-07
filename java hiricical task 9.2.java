import java.util.Scanner;
class Person {
    private String name;
    private int age;
    private String adress;
    public Person(){}
        
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAdress()
    {
        return adress;
    }
}
class Employee extends Person
{
    private String department;
    private String designation;
    public Employee()
    {   super();
    }
    public String getDepartment()
    {
        return department;
    }
    public String getDesignation()
    {
        return designation;
    }
}
class partTimeEmployee extends Employee
{
    private double hour,rate;
   public partTimeEmployee(double hour,double rate)
   {
       super();
       this.hour=hour;
       this.rate=rate;
   }
   public double getHour()
   {
       return hour;
   }
   public double getRate()
   {
       return rate;
   }
   public double salary()
    {
        return getHour()*getRate()*4.0;
    }
    public String toString()
    {
        return "Salary(PT): "+String.format("%.1f",salary());
    }
    
}
class FulTimeEmployee extends Employee
{
    private double basic;
    private double allowance;
    public FulTimeEmployee(double basic)
    {
        super();
        this.basic=basic;
        allowance =25;
    }
    public double getBasic()
    {
        return basic;
    }
    public double getAllowance()
    {
        return allowance;
    }
    public double salary()
    {
        return getBasic()+(double)((getBasic()*getAllowance())/100.0);
    }
    public String toString()
    {
     return "Salary(FT): "+String.format("%.1f",salary());
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		partTimeEmployee p1=new partTimeEmployee(sc.nextDouble(),sc.nextDouble());
		FulTimeEmployee f1=new FulTimeEmployee(sc.nextDouble());
		System.out.println(p1.toString());
		System.out.println(f1.toString());
	}
}
