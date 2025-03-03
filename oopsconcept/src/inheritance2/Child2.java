package inheritance2;

import Inheritance1.Child;
import Inheritance1.Parent;

public class Child2 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2 c=new Child2();
	     c.print();
	     c.print1();
	     //c.print2(); cant access private in another package
	     //c.print3(); cant access default in another package
	     
	}

}
