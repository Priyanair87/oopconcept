package encapsulation;
import java.util.Scanner; 
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
		person p=new person();
		p.setname(name);
		String n=p.getname();
		System.out.println("name:"+n);
		int age=sc.nextInt();
		p.setage(age);
		int a= p.getage();
		System.out.println("age:"+a);

	}

}


