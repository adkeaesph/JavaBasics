package NonAccessModifiers;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4884390829044550779L;
	private String name;
	private transient int age;
	private Date dateOfBirth;
	transient private String password;

	Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int calculateAge() {
		Calendar c = Calendar.getInstance();
		c.setTime(this.dateOfBirth);
		this.age = Period.between(LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE)),
				LocalDate.now()).getYears();
		return this.age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + calculateAge() + ", dateOfBirth=" + dateOfBirth + ", password=" + password
				+ "]";
	}

}
