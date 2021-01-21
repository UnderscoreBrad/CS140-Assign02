package assignment02;

public class Student
{
	private Person person;
	private String major;
	private double gpa;

	public Student(Person aPerson, String aMajor, double aGpa)
	{
		person = aPerson;
		major = aMajor;
		gpa = aGpa;

	}

	public void setGpa(double aGpa)
	{
		gpa = aGpa;
	}

	public Person getAsPerson()
	{
		return person;
	}

	public String getMajor()
	{
		return major;
	}

	public double getGpa()
	{
		return gpa;
	}
}