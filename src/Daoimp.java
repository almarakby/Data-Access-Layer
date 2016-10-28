import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Daoimp implements ProductDao{
	private String username ="root" ;
	private String password = "mohamed1995";
	public void insertProduct(Product product){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);

			PreparedStatement query = connection.prepareStatement("insert into product values(?,?,?,?,?)");
			query.setString(1, product.getProduct_ID());
			query.setString(2, product.getType());
			query.setString(3, product.getManufacturer());
			query.setString(4, product.getProduction_date());
			query.setString(5, product.getExpiray_date());

			int i = query.executeUpdate();

			if(i>0){
			//	JOptionPane.showMessageDialog(null, "product was successfully added");
				System.out.println("product was successfully added");
			}
			else{
			//	JOptionPane.showMessageDialog(null, "product was not added");
				System.out.println("product was not added");
			}

			connection.close();


			}

		catch(Exception e){
			//JOptionPane.showMessageDialog(null, "connection failed");
			System.out.println("connection failed");
			}
		}



public void deleteProduct(String Product_ID){

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);

		PreparedStatement query = connection.prepareStatement("delete from product where Product_ID =?");
		query.setString(1,Product_ID);

		int i = query.executeUpdate();
	

		if(i>0){
			//JOptionPane.showMessageDialog(null, "product was successfully deleted");
			System.out.println("product was successfully deleted");
		}
		else{
			//JOptionPane.showMessageDialog(null, "product was not deleted");
			System.out.println("product was not deleted");
		}
		connection.close();


		}

	catch(Exception e){
		//JOptionPane.showMessageDialog(null, "connection failed");
		System.out.println("connection failed");
		}
	}



public void updateProduct(Product product){

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);

		PreparedStatement query = connection.prepareStatement("update product set  Type = ? , Manufacturer = ?, Production = ?, Expiry_Date = ?  where Product_ID = ? ");

		query.setString(1, product.getType());
		query.setString(2, product.getManufacturer());
		query.setString(3, product.getProduction_date());
		query.setString(4, product.getExpiray_date());
		query.setString(5, product.getProduct_ID());

		int i = query.executeUpdate();


		if(i>0){
			//JOptionPane.showMessageDialog(null, "product was successfully updated");
			System.out.println("product was successfully updated");
		}
		else{
			//JOptionPane.showMessageDialog(null, "product was not updated");
			System.out.println("product was not updated");
		}
		connection.close();


		}

	catch(Exception e){
		//JOptionPane.showMessageDialog(null, "connection failed");
		System.out.println("connection failed");
		}
	}

public void retrieveProduct(String Manufacturer){

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);

		PreparedStatement query = connection.prepareStatement("select Product_ID , Type , Production , Expiry_date from product where Manufacturer = ? ");

		query.setString(1, Manufacturer);
		ResultSet result = query.executeQuery();
			
		/*	if(result.next() != true ){
				System.out.println("database doesnot contain this manufacturer's product");
			}*/
		
		while(result.next()){
			
			String id = result.getString("Product_ID");
			 String type = result.getString("Type");
			 String productionDate = result.getString("Production");
			 String expiryDate = result.getString("Expiry_Date");
		//	 JOptionPane.showMessageDialog(null," id: "+id+ " Type: "+type+" production date: "+productionDate+" expiray date "+expiryDate);
			 System.out.println(" product id: " +id+ " product Type: "+type+" production date: "+productionDate+" expiray date "+expiryDate);

		}





	}

	catch(Exception e){
		//JOptionPane.showMessageDialog(null, "connection failed");
		System.out.println("connection failed");
		}
	}




}
