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
    int hPrice=0;
    int kPrice=0;
    int pPrice=0;
    int qPrice=0;
    int vPrice=0;
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
      
      // countM : For 3N get one M free
      if(countN>=3){
    	  countM= countM-(countN/3);
    	  if(countM<0){
    		  countM=0;
    	  }
      }
      
      // Count Q : For 3R get one Q free
      if(countR>=3){
    	  countQ= countQ-(countR/3);
    	  if(countQ<0){
    		  countQ=0;
    	  }
      }
      
      //Count U: For 3U get one U free
      if(countU%3!=0){
         countU = countU-(countU/3);
      }else {
          countU = countU-(countU/4);
       }
      
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

    
      
      //Cost of H items :H|10|  5H for 45, 10H for 80
      if(countH%10 !=0  ) {
        	int quo= countH/10;
            int rem= countH%10;
            if(rem < 5) {
              remVal= rem*10;
            }else {
               if(rem>5 && rem%5!=0) {
                  int quo2= rem/5;
                  int rem2= rem%5;
                  remVal= (quo2*45)+ rem2*10;
                }
               if(rem==5){
                 remVal=45;
               }
            }
            hPrice= (quo*80)+ remVal;
        }else {
      	if(countH>=10  && countH%10 ==0  ) {
            hPrice=(countH/10)*80;
          }
        }
      
      //Cost of K items: K|80| 2K for 150
      if(countK<2) {
          kPrice=countK*80;
        }else {
          if(countK >=2 && countK%2 ==0){
            kPrice=(countK/2)*150;
          }
          if(countK>2 && countK%2!=0) {
            int quo= countK/2;
            int rem= countK%2;
            kPrice= (quo*150)+ rem*80;
          }
        }
      
      //Cost of P item : P|50| 5P for 200
      if(countP<5) {
          pPrice=countP*50;
        }else {
          if(countP >=5 && countP%5 ==0){
            pPrice=(countP/5)*200;
          }
          if(countP>5 && countP%5!=0) {
            int quo= countP/5;
            int rem= countP%5;
            pPrice= (quo*200)+ rem*50;
          }
        }
      
      //Cost of Q item: Q|30| 3Q for 80
      if(countQ<3) {
          qPrice=countQ*30;
        }else {
          if(countQ >=3 && countQ%3 ==0){
            qPrice=(countQ/3)*80;
          }
          if(countQ>3 && countQ%3!=0) {
            int quo= countQ/3;
            int rem= countQ%3;
            qPrice= (quo*80)+ rem*30;
          }
        }
      
      //Cost of V item: V|50|   2V for 90, 3V for 130
      if(countV%3 !=0  ) {
        	int quo= countV/3;
            int rem= countV%3;
            if(rem < 2) {
              remVal= rem*50;
            }else {
               if(rem>2 && rem%2!=0) {
                  int quo2= rem/2;
                  int rem2= rem%2;
                  remVal= (quo2*90)+ rem2*50;
                }
               if(rem==2){
                 remVal=90;
               }
            }
            vPrice= (quo*130)+ remVal;
        }else {
      	if(countV>=3  && countV%3 ==0  ) {
            vPrice=(countV/3)*130;
          }
        }
      
      total = aPrice + bPrice + countC*20 + countD*15+ countE*40+ countF*10+ countG*20+hPrice+ countI*35 + countJ*60+ +kPrice+ countL*90
    		  + countM*15 +countN*40+ countO*10 +pPrice+qPrice+ countR*50+countS*30 + countT*20 +countU*40 +vPrice+countW*20 + countX*90 + countY*10 + countZ*50 ;
      return total;
    } else {
      return -1;  
    }
  };
  
 /* public int itemPrice(){
	  
  }*/
  public int checkout(String skus) {
    return value.checkOut(skus);
  }
}

