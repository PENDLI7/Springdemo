package Pojo;

public class Greentingmsg {
	private int id;
	private String name;
	public Greentingmsg() {
	}
	public Greentingmsg(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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
		return "Greentingmsg [id=" + id + ", name=" + name + "]";
	}
	

}
