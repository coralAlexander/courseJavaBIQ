package jdbcDAO;

public class Employee {
	private int id;
	private String name;
	private String shopName;
	private String chain;
	private String city;
	private String mall;
	private String street;
	private int buildingNumber;
	private String MallGroup;

	public Employee(int id, String name, String shopName, String chain, String city, String mall, String street,
			int buildingNumber, String mallGroup) {
		this.id = id;
		this.name = name;
		this.shopName = shopName;
		this.chain = chain;
		this.city = city;
		this.mall = mall;
		this.street = street;
		this.buildingNumber = buildingNumber;
		MallGroup = mallGroup;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getShopName() {
		return shopName;
	}

	public String getChain() {
		return chain;
	}

	public String getCity() {
		return city;
	}

	public String getMall() {
		return mall;
	}

	public String getStreet() {
		return street;
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public String getMallGroup() {
		return MallGroup;
	}

}
