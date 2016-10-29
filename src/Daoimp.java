import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Daoimp implements ProductDao{
	public String username ="" ;
	public String password = "";
	public void insertProduct(Product product){

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);
		//	JOptionPane.showMessageDialog(null, "connection established");

			PreparedStatement query = connection.prepareStatement("insert into product values(?,?,?,?,?)");
			query.setString(1, product.getProduct_ID());
			query.setString(2, product.getType());
			query.setString(3, product.getManufacturer());
			query.setString(4, product.getProduction_date());
			query.setString(5, product.getExpiray_date());

			int i = query.executeUpdate();

			if(i>0){
				JOptionPane.showMessageDialog(null, "product was successfully added");
			}
			else{
				JOptionPane.showMessageDialog(null, "product was not added");
			}

			connection.close();


			}

		catch(Exception e){
			JOptionPane.showMessageDialog(null, "connection failed");
			}
		}



public void deleteProduct(String Product_ID){

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);

		PreparedStatement query = connection.prepareStatement("delete from product where Product_ID =?");
		query.setString(1,Product_ID);

		int i = query.executeUpdate();
	//	JOptionPane.showMessageDialog(null, "connection established");

		if(i>0){
			JOptionPane.showMessageDialog(null, "product was successfully deleted");
		}
		else{
			JOptionPane.showMessageDialog(null, "product was not deleted");
		}
		connection.close();


		}

	catch(Exception e){
		JOptionPane.showMessageDialog(null, "connection failed");
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
//		JOptionPane.showMessageDialog(null, "connection established");

		if(i>0){
			JOptionPane.showMessageDialog(null, "product was successfully deleted");
		}
		else{
			JOptionPane.showMessageDialog(null, "product was not deleted");
		}
		connection.close();


		}

	catch(Exception e){
		JOptionPane.showMessageDialog(null, "connection failed");
		}
	}

public void retrieveProduct(String Manufacturer){

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/product",username, password);

		PreparedStatement query = connection.prepareStatement("select Product_ID , Type , Production , Expiry_date from product where Manufacturer = ? ");

		query.setString(1, Manufacturer);
		ResultSet result = query.executeQuery();

		while(result.next()){
			String id = result.getString("Product_ID");
			 String type = result.getString("Type");
			 String productionDate = result.getString("Production");
			 String expiryDate = result.getString("Expiry_Date");
		//	 JOptionPane.showMessageDialog(null," id: "+id+ " Type: "+type+" production date: "+productionDate+" expiray date "+expiryDate);
			 System.out.println(" id: "+id+ " Type: "+type+" production date: "+productionDate+" expiray date "+expiryDate);

		}



//		JOptionPane.showMessageDialog(null, "connection established");

	}

	catch(Exception e){
		JOptionPane.showMessageDialog(null, "connection failed");
		}
	}




}
