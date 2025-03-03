package abstractclass;

import java.util.Scanner;

public class FullTimeEmployee extends Employee {
	
	public void claculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter per day salary");
		int perday=sc.nextInt();
		float salary= 30*perday;
		System.out.println("salary:"+salary);

	}

   public static void main(String[] args) {
	
	 // TODO Auto-generated method stub
	   
	   
	   FullTimeEmployee fe=new FullTimeEmployee();   
	   fe.claculateSalary();
	   ContractEmplyee ce=new ContractEmplyee();
	   ce.claculateSalary();
   }

}
