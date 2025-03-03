package abstractclass;
import java.util.Scanner;
public  class ContractEmplyee extends Employee {
	
	public  void claculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of days and hours");
		int days=sc.nextInt();
		int hours=sc.nextInt();
		float hrprice=150;
		float salary= days*hours*hrprice;
		System.out.println("salary:"+salary);
	}
}
