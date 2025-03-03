package customexception;

public class VotingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int age=10;
  try {
	    if((age<18) && (age>0))
	  {
		  throw new ManualThrowException("not eligible");
	  }
	  else if(age<0)  
	  {
		  throw new ManualThrowException("invalid age");
  
	  }
	  System.out.println("eligible for voting");
  }catch(ManualThrowException e)
  {
	  System.out.println(e);
  
  }
	}

}
