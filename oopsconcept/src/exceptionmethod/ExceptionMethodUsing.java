package exceptionmethod;

public class ExceptionMethodUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Start");
     int x[]= {1,2,3,4};
     try { 
     int a=1/0;
      x[5]=1; 
       }catch(ArithmeticException e)
     {
    	   System.out.println(e);
     }catch(ArrayIndexOutOfBoundsException e)
     {
  	   System.out.println(e);
     }
     
     System.out.println("end");

}
}
