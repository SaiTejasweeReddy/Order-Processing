public class ProductDBStore {

	Product[] pro= new Product[5];

	public ProductDBStore() 
	{
		
		pro[0]=new Product(1001,"HP", 1100, 50, "HDD=500GB,RAM=8GB");
		pro[1]=new Product(1002, "Lenovo", 900, 35, "HDD=1TB,RAM=8GB");
		pro[2]=new Product(1003, "Dell", 1050, 25, "HDD=2TB,RAM=16GB");
		pro[3]=new Product(1004, "MAC", 1800, 100, "HDD=128GB,RAM=8GB");
		pro[4]=new Product(1004, "Toshiba", 1400, 60, "HDD=500GB,RAM=8GB");
	}
	
 
}