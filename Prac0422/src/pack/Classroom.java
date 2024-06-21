package pack;

public class Classroom {
	
	private Person[] students;
	private int iSize;
	
	public Classroom() {
		this(1);
	}
	
	public Classroom(int size) {
		iSize = size;
		students = new Person[iSize];
		for(int i=0; i<iSize; i++) {
			students[i] = new Person();
		}
	}
	
	public int getSize() {
		return iSize;
	}
	
	public void setName(int index, String name) {
		students[index].setName(name);
	}
	
	public void setScore(int index, int score) {
		students[index].setScore(score);
	}
	
	public void prnStudent(int i) {
		System.out.println("name : " + students[i].getName() + "\tscore : " + students[i].getScore());
	}
	
	public int getStudentScore(String name) {
		int index;
		String indexName;
		
		for(index=0; index<iSize; index++) {
			indexName = students[index].getName();
			if(indexName.equals(name)) {
				break;
			}
		}
		if(index == 3) {
			System.out.println("해당 학생이 없습니다.");
			return -1;
		}else {
			return students[index].getScore();
		}
	}
	
	public String getStudentName(int score) {
		int index;
		int indexScore;
		
		for(index=0; index<iSize; index++) {
			indexScore = students[index].getScore();
			if(indexScore == score) {
				break;
			}
		}
		
		if(index == 3) {
			return "해당 점수의 학생이 없습니다.";
		}else {
			return students[index].getName();
		}
	}
}
