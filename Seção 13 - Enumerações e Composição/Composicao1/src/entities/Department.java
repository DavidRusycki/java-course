package entities;

public class Department {

	private String name;

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Department setName(String name) {
		this.name = name;
		
		return this;
	}
	
}
