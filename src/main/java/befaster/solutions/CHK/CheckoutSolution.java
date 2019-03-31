package befaster.solutions.CHK;

interface CheckoutInterface {
	String checkOut(String val);
}

public class CheckoutSolution {
	CheckoutInterface msg = x -> {return "Checkout by " + x ;};
    public String checkout(String skus) {
       return msg.checkOut(skus);
    }
}
