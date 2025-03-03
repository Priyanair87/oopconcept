package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ColourCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList ar=new ArrayList();
       ar.add("blue");
       ar.add("green");
       ar.add("yellow");
       ar.add("red");
       ar.add("black");
       ar.add("white");
       ar.add("indigo");
       System.out.println(ar);
       System.out.println(ar.size());
       System.out.println(ar.get(3));
       Iterator it=ar.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());

       }
       ar.remove(2);
       System.out.println(ar);
       System.out.println(ar.contains("black"));
       System.out.println(ar.contains("violet"));

	}

}
