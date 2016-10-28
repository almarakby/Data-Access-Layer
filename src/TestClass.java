import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestClass {

	public static void main(String[] args ){
	
		try{
		Scanner input = new Scanner(System.in);
		System.out.print("enter 1 to insert ,  2 to delete ,  3 to update  or 4 to retrieve ");
		String choise = input.nextLine();
		
		switch(choise){
		
		/* insert */
		case "1":
			
			System.out.print("enter product id: ");
			String id = input.nextLine();
			
			System.out.print("enter product type: ");
			String type = input.nextLine();
			
			System.out.print("enter product manufacturer: ");
			String manufacturer = input.nextLine();
			
			System.out.print("enter product production date: ");
			String Production_date = input.nextLine();
	
			System.out.print("enter product expiry date: ");
			String Expiray_date = input.nextLine();
		
		
			Product p1 = new Product();
			p1.setProduct_ID(id);
			p1.setManufacturer(manufacturer);
			p1.setExpiray_date(Expiray_date);
			p1.setProduction_date(Production_date);
			p1.setType(type);
			Daoimp tst = new Daoimp();
			tst.insertProduct(p1);		
		
			break;
		
		/* delete */
		case "2":
			
			System.out.print("enter product id: ");
			String id1 = input.nextLine();
			Daoimp tst1 = new Daoimp();
			tst1.deleteProduct(id1);
			break;
			
		/* update */	
		case "3":
			System.out.print("enter product id: ");
			String id2 = input.nextLine();
			
			System.out.print("enter product type: ");
			String type1 = input.nextLine();
			
			System.out.print("enter product manufacturer: ");
			String manufacturer1 = input.nextLine();
			
			System.out.print("enter product production date: ");
			String Production_date2 = input.nextLine();
	
			System.out.print("enter product expiry date: ");
			String Expiray_date2 = input.nextLine();
		
			
			
			Product p2 = new Product();
			p2.setProduct_ID(id2);
			p2.setManufacturer(manufacturer1);
			p2.setExpiray_date(Expiray_date2);
			p2.setProduction_date(Production_date2);
			p2.setType(type1);
			Daoimp tst2 = new Daoimp();
			tst2.updateProduct(p2);		
		
		break;
		
		/* retrieve */
		case "4":
			System.out.print("enter manufacturer: ");
			String manufacturer11 = input.nextLine();
			Daoimp tst3 = new Daoimp();
			tst3.retrieveProduct(manufacturer11);
	
			break;
		
		}
		
		
		}
		
		catch (Exception e){
			System.out.print("plesae enter a valid number");
		}
			
	}	

}
