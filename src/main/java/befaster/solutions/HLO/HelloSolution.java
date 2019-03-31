package befaster.solutions.HLO;

interface HelloInterface {
	String hello(String friendName);
}
public class HelloSolution {
   HelloInterface helloMsg = x -> {return ("Hello "+ x);};
   String hello(String friendVal){
	  return helloMsg.hello(friendVal); 
   }
}


