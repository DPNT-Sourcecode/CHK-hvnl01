package befaster.solutions.CHK;

interface CheckoutInterface {
	int checkOut(String... val);
}

public class CheckoutSolution {
	CheckoutInterface msg = (String x...) -> {if(x.equalsIgnoreCase("A")) return 50;
	};
    public String checkout(String skus) {
       return msg.checkOut(skus);
    }
}

