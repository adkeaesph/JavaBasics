package ComparableVSComparator;

public class Student implements Comparable<Student>{

	/*
	 * Comparable is used to define the natural ordering of 
	 * user-defined objects of the same class.
	 */
	private int rollNo;
	private String name;
	private int heightInCms;
	
	
	public Student(int rollNo, String name, int heightInCms) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.heightInCms = heightInCms;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeightInCms() {
		return heightInCms;
	}

	public void setHeightInCms(int heightInCms) {
		this.heightInCms = heightInCms;
	}

	@Override
	public int compareTo(Student otherStudent) {
		if(this.rollNo < otherStudent.rollNo)
			return -1;
		if(this.rollNo > otherStudent.rollNo)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", heightInCms=" + heightInCms + "]";
	}

}
