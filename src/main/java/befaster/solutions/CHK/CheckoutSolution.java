package befaster.solutions.CHK;

interface CheckoutInterface {
	int checkOut(String... val);
}

public class CheckoutSolution {
	int countA=0;
	int countB=0;
	int total=0;
	CheckoutInterface msg = (x) -> {
	
	for (String y : x ) {
	if (y.equals("A")) countA++;
	else if (y.equals("B")) countB++;
	}
	
	for (String z : x ) {
	if (x.equals("C")) total+=20;
	else if (x.equals("D")) total+=15;
	}
	int aPrice=0;
	if(countA>0){
	if(countA<3){aPrice=countA*50;}
	else if(countA>=3 && countA%3 ==0){aPrice=(countA/3)*130;}
	else if(countA>3 && countA%3!=0) {
		int quo= countA/3;
		int rem= countA%3;
		aPrice= (quo*130)+ rem*50;
	}
	total+=aPrice;
	}
	int bPrice=0;
	if(countB>0){
		if(countB<2){bPrice=countB*30;}
		else if(countB>=2 && countB%2 ==0){bPrice=(countB/2)*45;}
		else if(countB>2 && countB%2!=0) {
			int quo= countB/2;
			int rem= countB%2;
			bPrice= (quo*45)+ rem*30;
		}
	
	total+=bPrice;
	}
	return total;
	};
    public int checkout(String skus) {
       return msg.checkOut(skus);
    }
}




