
public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryearned;
	
	public Teacher(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryearned=0;
				
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public int getsalary()
	{
		return salary;
	}
	public void setsalary()
	{
		this.salary=salary;
	}
	public void receivesalary(int salary)
	{
		salaryearned=salaryearned+salary;
		School.updatetotalmoneyspent(salary);
	}
	 public String toString() {
	    	return "->Teacher's name:"+name+"->Total salary earned sofar:"+salary;
	    }

}
