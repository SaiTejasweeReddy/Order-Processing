public class OrderService {
	
	ProductDBStore productDBStore=new ProductDBStore();
	
	public void processOrder(Order order)
	{
		int pid;
		int ordquantity;
		
		
		pid=order.getproductId();
		ordquantity=order.getquantity();
		
		for(int i=0;i<productDBStore.pro.length;i++)

		{
			Product prod=productDBStore.pro[i];
				
			if(prod.getProductId()==pid)
			{
				
				if(ordquantity<=prod.getQuantity()) {
					
					System.out.println("Order is processed");
					
					int updatedstock=prod.getQuantity()-ordquantity;
					order.setquantity(updatedstock);
					System.out.println("Stock available is:"+updatedstock);
				
				}
				else 
					System.err.println("Unable to process the order - Out of stock");
					
			}
			
		}
		
	}

}
