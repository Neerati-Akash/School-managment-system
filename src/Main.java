import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
         Teacher latha=new Teacher(1,"latha",500);
         Teacher priyanka=new Teacher(2,"priyanka",1000);
         Teacher ramesh=new Teacher(3,"ramesh",1500);
         List<Teacher> teacherlist=new ArrayList<>();
         teacherlist.add(latha);
         teacherlist.add(priyanka);
         teacherlist.add(ramesh);
         
         
         Student akash=new Student(1,"akash",10);
         Student jayanth=new Student(2,"jayanth",9);
         Student hrushikesh=new Student(3,"hrushikesh",8);
         List<Student> studentlist=new ArrayList<>();
         studentlist.add(akash);
         studentlist.add(jayanth);
         studentlist.add(hrushikesh);
         
         School ghs = new School(teacherlist,studentlist);
         Teacher naresh=new Teacher(1,"naresh",800);
         teacherlist.add(naresh);
         akash.paysfee(1000);
         jayanth.paysfee(4000);
         System.out.println("GHS has earned:"+ghs.gettotalmoneyearned());
         
         System.out.println("----MAKING SCHOOL PAY SALARY FOR TEACHERS----");
         
         latha.receivesalary(latha.getsalary());
         System.out.println("GHS has spent for salary to"+latha.getname()+"and now has"+ghs.gettotalmoneyearned());
         
         priyanka.receivesalary(priyanka.getsalary());
         System.out.println("GHS has spent for salary to"+priyanka.getname()+"and now has"+ghs.gettotalmoneyearned());
         
         naresh.receivesalary(naresh.getsalary());
         System.out.println("GHS has spent for salary to"+naresh.getname()+"and now has"+ghs.gettotalmoneyearned());
         
         System.out.println(akash);
         System.out.println(latha);
         System.out.println(naresh);
         
         
         
	}

}
