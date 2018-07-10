package alloperations;

public class Food implements FoodOperationStructure{

	private int FoodID;
	private String FoodName;
	private int quantity;
	private double itemPrice;
	
	Food(){
		this.FoodID=0;
		this.FoodName="Sample Food";
		this.quantity=30;
		this.itemPrice=250.00;
	}
	
	Food(int FoodID, String FoodName, int quantity, double itemPrice){
		this.FoodID=FoodID;
		this.FoodName=FoodName;
		this.quantity=quantity;
		this.itemPrice=itemPrice;
	}
	
	public double discountPercentage(){
		
		double discVal=Math.random() * 100;
		return discVal;
	}
	
	public double totalPrice(){
		
		double discountAmount = (itemPrice / 100) * discountPercentage();
		double netPricePerItem = itemPrice - discountAmount;
		double totalAmount = netPricePerItem * quantity;
		
		return totalAmount;
	}
	
	 public double totalPrice(double specialDiscountAmount){
		 
	    	double discountAmount=0;
	    	double netPricePerItem=0;
	    	double totalAmount=0;
			
	    	discountAmount = (this.getItemPrice() / 100) * discountPercentage();
	        netPricePerItem = this.getItemPrice() - (discountAmount + specialDiscountAmount);
	        totalAmount = netPricePerItem * this.getQuantity();
			
			return totalAmount;
		}

	public int getFoodID() {
		return FoodID;
	}

	public void setFoodID(int foodID) {
		FoodID = foodID;
	}

	public String getFoodName() {
		return FoodName;
	}

	public void setFoodName(String foodName) {
		FoodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
}
