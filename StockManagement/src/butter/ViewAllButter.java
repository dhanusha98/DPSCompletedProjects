package butter;

public class ViewAllButter {

	private butterDataLayer.ViewAllData viewObj=new butterDataLayer.ViewAllData();
	
	public void viewAllProducts(){
		
		System.out.println("*******************VIEW ALL BUTTER PRODUCTS******************** \n");
		
		System.out.println("Available Products: "+"\n");
		viewObj.displayAllData();

	}
}
