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
    
    String regex = "^[A-E]+$";
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
      if(countA<3){
        aPrice=countA*50;
      } else {
        if(countA>=3 && countA%3 ==0) {
          aPrice=(countA/3)*130;
        }
        if(countA>3 && countA%3!=0) {
          int quo= countA/3;
          int rem= countA%3;
          aPrice= (quo*130)+ rem*50;
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
      
      if(countE<2) {
          ePrice=countE*40;
        }else {
          if(countE >=2 && countE%2 ==0){
            ePrice=(countE/2)*50;
          }
          if(countE>2 && countE%2!=0) {
            int quo= countE/2;
            int rem= countE%2;
            ePrice= (quo*50)+ rem*40;
          }
        }

      total = aPrice + bPrice + countC*20 + countD*15+ ePrice;
      return total;
    } else {
      return -1;  
    }
  };

  public int checkout(String skus) {
    return value.checkOut(skus);
  }
}
