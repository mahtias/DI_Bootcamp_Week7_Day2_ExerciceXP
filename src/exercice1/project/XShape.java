package exercice1.project;

public class XShape extends Shape {

	// attribut 
	
	private String name;

	public XShape(String name) {
		super(name);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return super.getName() + this.name;
	}

	
	

	 

	
	
	
}
