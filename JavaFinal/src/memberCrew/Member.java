package memberCrew;

public class Member {
	
	private int iId;
	private String name;
	
	public Member() {
		iId = 0;
		name = "none";
	}
	
	public Member(int id, String name) {
		iId = id;
		this.name = name;
	}
	
	public int getId() {
		return iId;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Student ID : " + iId + "\nName : " + name;
	}
	
	public boolean equals(Object obj) {
		Member oMember = (Member)obj;
		boolean bFlag = false;
		if(oMember.getId()==iId) {
			bFlag = true;
		}
		return bFlag;
	}

}
