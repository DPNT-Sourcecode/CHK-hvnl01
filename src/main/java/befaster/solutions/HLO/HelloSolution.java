package befaster.solutions.HLO;

interface HelloInterface {
	String helloVal(String friendName);
}
public class HelloSolution {
   HelloInterface helloMsg = x -> {return ("Hello "+ x);};
   public String hello(String friendVal){
	  return helloMsg.helloVal(friendVal); 
   }
}



