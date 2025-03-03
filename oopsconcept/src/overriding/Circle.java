package overriding;

import java.util.Scanner;

public class Circle extends Shape {
	float r;
	public void findarea()
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the value of r");
		 r=sc.nextInt();
		 area=3.14*r*r;
		System.out.println("Circle area:"+area);
		}
	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		c.findarea();
		r.findarea();
	}

}
