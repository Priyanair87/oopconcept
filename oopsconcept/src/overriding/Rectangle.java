package overriding;
import java.util.Scanner;
public class Rectangle extends Shape {
	int l,b;
public void findarea()
{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the value of l and b");
	 l=sc.nextInt();
	 b=sc.nextInt();
	 area=(float)l*b;
	System.out.println("Rectangle area:"+area);
	}
}
