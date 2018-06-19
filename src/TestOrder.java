
public class TestOrder {

	public static void main(String[] args) {
		
		Order order= new Order(1001,5,1);
		
		OrderService orderserv=new OrderService();
		orderserv.processOrder(order);
		
	}

}
