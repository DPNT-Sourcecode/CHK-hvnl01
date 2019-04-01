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
	if (y.equals("B")) countB++;
	}
	
	for (String z : x ) {
	if (z.equals("C")) total+=20;
	if (z.equals("D")) total+=15;
	}
	int aPrice=0;
	if(countA>0){
	if(countA<3){aPrice=countA*50;}
	if(countA>=3 && countA%3 ==0){aPrice=(countA/3)*130;}
	if(countA>3 && countA%3!=0) {
		int quo= countA/3;
		int rem= countA%3;
		aPrice= (quo*130)+ rem*50;
	}
	total+=aPrice;
	}
	int bPrice=0;
	if(countB>0){
		if(countB<2){bPrice=countB*30;}
		if(countB>=2 && countB%2 ==0){bPrice=(countB/2)*45;}
		if(countB>2 && countB%2!=0) {
			int quo= countB/2;
			int rem= countB%2;
			bPrice= (quo*45)+ rem*30;
		}
	
	total+=bPrice;
	}
	
	int blackList=0;
	for(String p : x){
		if(!(p.equals("A")||p.equals("B")||p.equals("C")||p.equals("D")||p.equals(""))){
			blackList++;
		}
	}
	if(blackList>0){
		total=-1;
	}
	return total;
	};
    public int checkout(String skus) {
       return msg.checkOut(skus);
    }
}
