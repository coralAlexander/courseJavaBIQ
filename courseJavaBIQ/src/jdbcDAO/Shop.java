package jdbcDAO;

public class Shop {
	
	private int id;
	private String name ;
	private String city;
	private String street;
	private int buildingNumber;
	private String mall;
	private String chain;
	public Shop(int id, String name, String city, String street, int buildingNumber, String mall, String chain) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.street = street;
		this.buildingNumber = buildingNumber;
		this.mall = mall;
		this.chain = chain;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public String getMall() {
		return mall;
	}
	public String getChain() {
		return chain;
	}
	
	
}
