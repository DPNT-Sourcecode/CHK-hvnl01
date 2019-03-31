package befaster.solutions.SUM;

import java.util.Scanner;

interface SumSolutionInterface {
	int sumVal(int x,int y);
}

public class SumSolution {

   public static void main(String args[]) {
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	System.out.println("Enter two integer ::");
    	int firstInt = input.nextInt();
    	int secondInt = input.nextInt();
    	SumSolutionInterface sumValue = (int a, int b) -> {return (a+b);};
    	System.out.println("Sum of "+firstInt+" and " + secondInt+" is::"+sumValue.sumVal(firstInt,secondInt));
    }

}

