package memberCrew;

public class Crew extends Member {
	
	private String sDepartment;
	
	public Crew() {
		super();
		sDepartment = "none";
	}
	
	public Crew(int id, String name, String department) {
		super(id, name);
		sDepartment = department;
	}
	
	public String toString() {
		return super.toString() + "\nDepartment : " + sDepartment;
	}
	
	public boolean equals(Object obj) {
		Crew oCrew = (Crew)obj;
		return super.equals(oCrew);
	}

}
