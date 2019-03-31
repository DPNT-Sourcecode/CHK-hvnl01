package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

interface SumSolutionInterface {
	int sumVal(int x,int y);
}

public class SumSolution {

    public static void main(String args[]) {
    	SumSolutionInterface sumValue = (int a, int b) -> {return (a+b);};
    	System.out.println("Result is::"+sumValue.sumVal(5,6));
    	
    }

}

