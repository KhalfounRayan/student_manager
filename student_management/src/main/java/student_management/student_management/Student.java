package student_management.student_management;



public class Student {
	
	private int studentID;
	private String studentName;
	private String studentlastname;
	private String studentclasse;
	
	
	
	
	public int getStudentID() {
		return studentID;
	}



	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}




	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public String getStudentlastname() {
		return studentlastname;
	}




	public void setStudentlastname(String studentlastname) {
		this.studentlastname = studentlastname;
	}




	public String getStudentclasse() {
		return studentclasse;
	}




	public void setStudentclasse(String studentclasse) {
		this.studentclasse = studentclasse;
	}




	public Student(int studentID, String studentName, String studentlastname, String studentclasse) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentlastname = studentlastname;
		this.studentclasse = studentclasse;
	}




	public Student(String studentName, String studentlastname, String studentclasse) {
		super();
		this.studentName = studentName;
		this.studentlastname = studentlastname;
		this.studentclasse = studentclasse;
	}




	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentlastname=" + studentlastname
				+ ", studentclasse=" + studentclasse + "]";
	}
	
	
	
	
}

;