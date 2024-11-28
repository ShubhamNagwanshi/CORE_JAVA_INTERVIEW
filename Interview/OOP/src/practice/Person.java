package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	public int id;
	public String name;
	public Date dob;

	public static final int AVG = 25;

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static void main(String[] args) throws ParseException {

		Person p = new Person();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		p.setId(11);
		p.setName("Shubham");
		p.setDob(sdf.parse("2002-08-12"));

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(p.AVG);

	}
}
