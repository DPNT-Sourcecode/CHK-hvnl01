package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.regex.Pattern;

interface CheckoutInterface {
  int checkOut(String val);
}

public class CheckoutSolution {

  CheckoutInterface value = (x) -> {
    int total=0;
    int aPrice=0;
    int bPrice=0;
    int ePrice=0;
    int	remVal=0;
    String regex = "^[A-F]+$";
    boolean match = Pattern.matches(regex,x);
    if(match || x.length()==0){
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
      
      int countA = map.get('A') !=null ? map.get('A'):0;
      int countB =map.get('B') != null ? map.get('B') :0;
      int countC = map.get('C') !=null ? map.get('C'):0;
      int countD =map.get('D') != null ? map.get('D') :0;
      int countE =map.get('E') != null ? map.get('E') :0;
      int countF =map.get('F') != null ? map.get('F') :0;
      if(countE>=2){
    	  countB= countB-(countE/2);
    	  if(countB<0){
    		  countB=0;
    	  }
      }
      /*if(countF>=2){
         countF = countF-(countF/2);
      }*/
      if(countA%5 !=0  ) {
      	int quo= countA/5;
          int rem= countA%5;
          if(rem < 3) {
            remVal= rem*50;
          }else {
             if(rem>3 && rem%3!=0) {
                int quo2= rem/3;
                int rem2= rem%3;
                remVal= (quo2*130)+ rem2*50;
              }
             if(rem==3){
               remVal=130;
             }
          }
          aPrice= (quo*200)+ remVal;
      }else {
    	  if(countA>=5  && countA%5 ==0  ) {
              aPrice=(countA/5)*200;
        }
      }

      if(countB<2) {
        bPrice=countB*30;
      }else {
        if(countB >=2 && countB%2 ==0){
          bPrice=(countB/2)*45;
        }
        if(countB>2 && countB%2!=0) {
          int quo= countB/2;
          int rem= countB%2;
          bPrice= (quo*45)+ rem*30;
        }
      }
      
      total = aPrice + bPrice + countC*20 + countD*15+ countE*40+ countF*10;
      return total;
    } else {
      return -1;  
    }
  };

  public int checkout(String skus) {
    return value.checkOut(skus);
  }
}


