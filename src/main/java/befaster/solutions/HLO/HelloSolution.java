package befaster.solutions.HLO;

interface HelloInterface {
	void hello(String friendName);
}
public class HelloSolution {
   HelloInterface helloMsg = x -> System.out.println("Hello "+ x);
}

