package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

interface CheckoutInterface {
  int checkOut(String val);
}

public class CheckoutSolution {

  CheckoutInterface value = (x) -> {
    int total,aPrice,bPrice,hPrice,kPrice,pPrice,qPrice,vPrice,sPrice,tPrice,xPrice,yPrice,zPrice=0;
    HashMap<Character,Integer> map1 = new HashMap<>();
    map1.put('S', 20);
    map1.put('T', 20);
    map1.put('X', 17);
    map1.put('Y', 20);
    map1.put('Z', 21);
    char[] offerComb = {'S','T','X','Y','Z'};
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
      
      int countComb=0;
      int j=0;
      char[] comb = new char[x.length()];
      char[] comb2 = new char[x.length()];
      
      for(char i : offerComb){
    	  int count =map.get(i) !=null ? map.get(i):0;
        if(count!=0){
          countComb+=count;
          for(int k=0;k<count;k++){
          comb[j]=i;
          j++;
          }
        }
      }
      
      HashMap<Integer,Character> map2 = new HashMap<>();
      for(int i=0;i<comb.length;i++){
    	  map2.put(map1.get(comb[i]),comb[i] );
      }
      
      Map<Integer,Character> sortMap = new TreeMap<Integer, Character>(map2);
      Set set = sortMap.entrySet();
      Iterator iter = set.iterator();
      int cnt=0;
      while(iter.hasNext()){
    	  Map.Entry me = (Map.Entry)iter.next();
    	  comb2[cnt]=(char) me.getValue();
    	  cnt++;
      }
      
      
      
      if(countComb>2 && countComb%3==0){
        for(char l : comb2){
        map.put(l,map.get(l)-1);
       }
      }
      if(countComb>2 && countComb%3!=0) 
        {
    	  for(int k =0 ; k<(countComb%3)*3;k++ ) {
    		     map.put(comb2[k],map.get(comb2[k])-1);
    		  
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
      
      
      //Count item B: for 2E get one B free
      countB=getFreeDeal(countE,2,countB);


      //Count item F
      countF=getFreeDeal(countF, 2);


      // countM : For 3N get one M free
      countM=getFreeDeal(countN,3,countM);


      // Count Q : For 3R get one Q free
      countQ=getFreeDeal(countR,3,countQ);


      //Count U: For 3U get one U free
      countU=getFreeDeal(countU, 3);


      //Cost of item A: A|50| 3A for 130, 5A for 200
      aPrice=getItemPrice(countA,50,3,130,5,200);

      //Cost of item B: B|30| 2B for 45 
      bPrice=getItemPrice(countB,30,2,45);

      //Cost of H items :H|10|  5H for 45, 10H for 80
      hPrice=getItemPrice(countH,10,5,45,10,80);

      //Cost of K items: K|70| 2K for 120
      kPrice=getItemPrice(countK,70,2,120);

      //Cost of P item : P|50| 5P for 200
      pPrice=getItemPrice(countP,50,5,200);

      //Cost of Q item: Q|30| 3Q for 80
      qPrice=getItemPrice(countQ,30,3,80);
      
      //buy any 3 of (S,T,X,Y,Z) for 45
      sPrice = getItemPrice(countS,20,3,45);
      tPrice = getItemPrice(countT,20,3,45);
      xPrice = getItemPrice(countX,17,3,45);
      yPrice = getItemPrice(countY,20,3,45);
      zPrice = getItemPrice(countZ,21,3,45);

      //Cost of V item: V|50|   2V for 90, 3V for 130
      vPrice=getItemPrice(countV,50,2,90,3,130);

      total = aPrice + bPrice + countC*20 + countD*15+ countE*40+ countF*10+ countG*20+hPrice+ countI*35 + countJ*60+ +kPrice+ countL*90
          + countM*15 +countN*40+ countO*10 +pPrice+qPrice+ countR*50+sPrice + tPrice +countU*40 +vPrice+countW*20 + xPrice + yPrice + zPrice+(countComb>=3?(countComb/3)*45 : 0);
      return total;
    } else {
      return -1;  
    }
  };
  
 public int getItemPrice(int count,int value,int firstCond, int value1, int secCond, int value2){
    int remVal=0;
    int price=0;
    if(count%secCond !=0  ) {
      int quo= count/secCond;
      int rem= count%secCond;
      if(rem < firstCond) {
        remVal= rem*value;
      }else {
        if(rem>firstCond && rem%firstCond!=0) {
          int quo2= rem/firstCond;
          int rem2= rem%firstCond;
          remVal= (quo2*value1)+ rem2*value;
        }
        if(rem==firstCond){
          remVal=value1;
        }
      }
      price= (quo*value2)+ remVal;
    }else {
      if(count>=secCond  && count%secCond ==0  ) {
        price=(count/secCond)*value2;
      }
    }
    return price;
  }

  public int getItemPrice(int count, int value, int firstCond, int value1){
    int price =0;
    if(count<firstCond) {
      price=count*value;
    }else {
      if(count >=firstCond && count%firstCond ==0){
        price=(count/firstCond)*value1;
      }
      if(count>firstCond && count%firstCond!=0) {
        int quo= count/firstCond;
        int rem= count%firstCond;
        price= (quo*value1)+ rem*value;
      }
    }
    return price;
  }

  public int getFreeDeal(int count1,int cond, int count2){
    if(count1>=cond){
      count2= count2-(count1/cond);
      if(count2<0){
        count2=0;
      }
    }
    return count2;
  }

  public int getFreeDeal(int count, int cond){
    if(count%cond!=0){
      count = count-(count/cond);
    }else {
      count = count-(count/(cond+1));
    }
    return count;
  }
  public int checkout(String skus) {
    return value.checkOut(skus);
  }
  
 public static void main(String arg[]){
	  CheckoutSolution v = new CheckoutSolution();
	  System.out.println(v.checkout("STXS"));
  }
}
