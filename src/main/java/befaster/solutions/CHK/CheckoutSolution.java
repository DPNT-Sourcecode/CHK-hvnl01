package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.regex.Pattern;

interface CheckoutInterface {
	int checkOut(String val);
}

public class CheckoutSolution {
	
	CheckoutInterface msg = (x) -> {
		int total=0;
		int aPrice=0;
		int bPrice=0;
	String regex = "^[A-D]+$";
	boolean match = Pattern.matches(regex,x);
	if(match){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i< x.length(); i++){
			char c = x.charAt(i);
			Integer val = map.get(c);
			if(val != null) {
				map.put(c, new Integer(val + 1));
			} else {
				map.put(c, 1);
			}
		}
		
	int countA= map.get('A');
	int countB=map.get('B');
	if(map.get('A')<3){
		aPrice=countA*50;
	} else {
	    if(countA>=3 && countA%3 ==0) {
		  aPrice=(countA/3)*130;}
	    }
	    if(countA>3 && countA%3!=0) {
		  int quo= countA/3;
		  int rem= countA%3;
		  aPrice= (quo*130)+ rem*50;
	    }
	}
	
	
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
	return total;
	};
    public int checkout(String skus) {
       return msg.checkOut(skus);
    }
}


