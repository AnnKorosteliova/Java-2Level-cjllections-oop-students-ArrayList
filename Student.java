
public class Student {

	private String fullname;
	private String speciaity;
	private Double grade;
	
	public Student(String fullname, String speciaity, Double grade) {
		this.setFullname(fullname);;
		this.setSpeciaity(speciaity);;
		this.setGrade(grade);;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getSpeciaity() {
		return speciaity;
	}

	public void setSpeciaity(String speciaity) {
		this.speciaity = speciaity;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", speciaity=" + speciaity + ", grade=" + grade + "]";
	}	
}
