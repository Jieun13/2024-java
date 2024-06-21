package pack;

public class Person {
	
	private String sName;
	private int iScore;
	
	public Person() {
		sName = "no name";
		iScore = 0;
	}
	
	public Person(String name, int score) {
		this.sName = name;
		this.iScore = score;
	}
	
	public void setName(String name) {
		sName = name;
	}
	
	public void setScore(int score) {
		iScore = score;
	}
	
	public int getScore() {
		return iScore;
	}
	
	public String getName() {
		return sName;
	}
}