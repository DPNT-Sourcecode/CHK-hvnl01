package befaster.solutions.CHK;

interface CheckoutInterface {
	int checkOut(String... val);
}

public class CheckoutSolution {
	CheckoutInterface msg = (x) -> {
	int countA=0;
	int countB=0;
	int total=0;
	for (String y : x ) {
	if (y.equals("A")) countA++;
	else if (y.equals("B")) countB++;
	}
	
	for (String z : x ) {
	if (x.equals("C")) total+=20;
	else if (x.equals("D")) total+=15;
	}
	int aPrice=0;
	if(countA ==1 ){total +=50;}
	
	return total;
	};
    public int checkout(String skus) {
       return msg.checkOut(skus);
    }
}
