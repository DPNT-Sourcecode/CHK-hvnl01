package befaster.solutions.HLO;

public class HelloSolution {
    public static String hello(String friendName) {
     return "Hello " + friendName;   
    }
    
    public static void main(String arg[]) {
    	String helloMsg =hello("ValTech");
    	System.out.println(helloMsg);
    }
}
