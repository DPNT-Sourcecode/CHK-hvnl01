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
    String regex = "^[A-Z]+$";
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
      int countG = map.get('G') !=null ? map.get('G'):0;
      int countH =map.get('H') != null ? map.get('H') :0;
      int countI = map.get('I') !=null ? map.get('I'):0;
      int countJ =map.get('J') != null ? map.get('J') :0;
      int countK =map.get('K') != null ? map.get('K') :0;
      int countL =map.get('L') != null ? map.get('L') :0;
      int countM = map.get('M') !=null ? map.get('M'):0;
      int countN =map.get('N') != null ? map.get('N') :0;
      int countO = map.get('O') !=null ? map.get('O'):0;
      int countP =map.get('P') != null ? map.get('P') :0;
      int countQ =map.get('Q') != null ? map.get('Q') :0;
      int countR =map.get('R') != null ? map.get('R') :0;
      int countS = map.get('S') !=null ? map.get('S'):0;
      int countT =map.get('T') != null ? map.get('T') :0;
      int countU = map.get('U') !=null ? map.get('U'):0;
      int countV =map.get('V') != null ? map.get('V') :0;
      int countW =map.get('W') != null ? map.get('W') :0;
      int countX =map.get('X') != null ? map.get('X') :0;
      int countY =map.get('Y') != null ? map.get('Y') :0;
      int countZ =map.get('Z') != null ? map.get('Z') :0;
      
      //Count item A
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

    //Count item B
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

    //Count item E
      if(countE>=2){
    	  countB= countB-(countE/2);
    	  if(countB<0){
    		  countB=0;
    	  }
      }

    //Count item F
      if(countF%2!=0){
         countF = countF-(countF/2);
      }else {
          countF = countF-(countF/3);
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



