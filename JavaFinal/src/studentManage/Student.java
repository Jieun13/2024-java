package studentManage;

public class Student {
	
	private int id;
	private String name;
	private String major;
	private double scoreAvg;
	
	public Student(int id, String name, String major, double scoreAvg) {
		this.id = id;
		this.major = major;
		this.name = name;
		this.scoreAvg = scoreAvg;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public double getScoreAvg() {
		return scoreAvg;
	}
	
	public String toString() {
		return "|학번 : " + id + "\t|이름 : " + name + "\t|전공 : " + major + "\t|학점 : " + scoreAvg + "\t|";
	}

}
