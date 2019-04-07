package befaster.solutions.CHK;

import java.util.jar.Attributes.Name;

public class ItemBasket implements Comparable<ItemBasket>{
    char item;
    double price;
	
	public ItemBasket(char item, double price) {
		super();
		this.item = item;
		this.price = price;
	}
	@Override
	public int compareTo(ItemBasket o) {
		// TODO Auto-generated method stub
		if(o == null) {
			return -1;
		}
		int c = Double.valueOf(price).compareTo(o.price);
		if(c!=0){
			return c;
		}
			
		return c;
	}

}
