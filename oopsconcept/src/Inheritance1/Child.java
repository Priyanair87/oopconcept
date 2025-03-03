package Inheritance1;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child c=new Child();
     c.print();
     c.print1();
     //c.print2();  private method can't access
     c.print3();
     
	}

}
