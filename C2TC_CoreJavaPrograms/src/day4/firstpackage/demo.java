package day4.firstpackage;

public class demo {
	public static demo obj =new demo();
	
	public static demo getObj() {
		return obj;
	}
	
	demo(){
		super();
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + "]";
	}
	

}
