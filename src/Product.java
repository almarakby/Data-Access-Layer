
public class Product {

	private String Product_ID;
	private String Type;
	private String Manufacturer;
	private String Production_date;
	private String expiray_date;
	
	Product(){
		}
	

	/**
	 * @return the product_ID
	 */
	public String getProduct_ID() {
		return this.Product_ID;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return this.Type;
	}


	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return this.Manufacturer;
	}


	/**
	 * @return the production_date
	 */
	public String getProduction_date() {
		return this.Production_date;
	}


	/**
	 * @return the expiray_date
	 */
	public String getExpiray_date() {
		return this.expiray_date;
	}


	/**
	 * @param product_ID the product_ID to set
	 */
	public void setProduct_ID(String product_ID) {
		this.Product_ID = product_ID;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.Type = type;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.Manufacturer = manufacturer;
	}

	/**
	 * @param production_date the production_date to set
	 */
	public void setProduction_date(String production_date) {
		this.Production_date = production_date;
	}

	/**
	 * @param expiray_date the expiray_date to set
	 */
	public void setExpiray_date(String expiray_date) {
		this.expiray_date = expiray_date;
	}
	
	
	
	
}
