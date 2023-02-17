package exercice3;

public class Custumer {
	private int ID;
	private String name;
	private char gender;

	public Custumer(int ID, String name, char gender) {
		super();
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.name = name;
		this.gender = gender;

	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return this.name + "(" + this.ID + ")";
	}
}
