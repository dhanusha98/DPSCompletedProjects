package alloperations;

public class Rice extends Food {

	Rice(int FoodID, String FoodName, int quantity, double itemPrice){
		
		this.setFoodID(FoodID);
		this.setFoodName(FoodName);
		this.setQuantity(quantity);
		this.setItemPrice(itemPrice);
	}
	
	@Override
    public double discountPercentage(){
		
		double discVal = 23; //Discount Percentage Value
		return discVal;
	}
	
	
	public double totalPrice(){
		
		double discountAmount = (this.getItemPrice() / 100) * discountPercentage();
		double netPricePerItem = this.getItemPrice() - discountAmount;
		double totalAmount = netPricePerItem * this.getQuantity();
		
		return totalAmount;
	}

      public double totalPrice(double specialDisPercentage){
    	
    	double discountAmount=0;
    	double netPricePerItem=0;
    	double totalAmount=0;
    	double specialDisAmount=0;
    	
    	Double a=(Double)specialDisPercentage;
    	
    	if(!(a instanceof Double)){
    		
    		System.out.println("Invalid Input. Please provide Numeric Value!");
    		
    	} else {
    		
    	    discountAmount = (this.getItemPrice() / 100) * discountPercentage();
    	    specialDisAmount=(this.getItemPrice() / 100) * specialDisPercentage;
    		netPricePerItem = this.getItemPrice() - (discountAmount + specialDisAmount);
    		totalAmount = netPricePerItem * this.getQuantity();
    	}
		
		return totalAmount;
	}

}
