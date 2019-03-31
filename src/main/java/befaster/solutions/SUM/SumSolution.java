package befaster.solutions.SUM;

interface SumInterface {
	int sumVal(int x, int y);
}
public class SumSolution {

    public int compute(int x, int y) {
       SumInterface val = (int a, int b)->{return a+b;};
       return val.sumVal(x, y);
    }

}
