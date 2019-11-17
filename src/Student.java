
public class Student {
   private int id; 
   private String name;
   private int grade;
   private int feepaid;
   private int feetotal; 
	
	public Student(int id,String name,int grade)
	{
		feepaid=0;
		feetotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public void setgrade(int grade)
	{
		this.grade=grade;
	}
	public void paysfee(int fee)
	{
		feepaid=feepaid+fee;
		School.updatetotalmoneyearned(feepaid);
	}
    public int getid()
    {
    	return id;
    }
    public String getname()
    {
    	return name;
    }
    public int getgrade()
    {
    	return grade;
    }
    public int getfeepaid()
    {
    	return feepaid;
    }
    public int getfeetotal()
    {
    	return feetotal;
    }
    public String toString() {
    	return "->Student's name:"+name+"->Total fees paid till now:"+feepaid;
    }
}
