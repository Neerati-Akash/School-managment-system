import java.util.List;

public class School {
private List<Teacher> teachers;
private List<Student> students;
private static int totalmoneyearned;
private static int totalmoneyspent;

public School(List<Teacher> teachers,List<Student>students){
	this.teachers=teachers;
	this.students=students;
	totalmoneyearned=0;
	totalmoneyspent=0;
 }
public List<Teacher> getteachers(){
	return teachers;
}
public void addteachers(Teacher teacher) {
	teachers.add(teacher);
}
public List<Student> getstudents(){
	return students;
}
public void addstudents(Student student) {
	students.add(student);
}
public int gettotalmoneyearned() {
	return totalmoneyearned;
}
public static void updatetotalmoneyearned(int moneyearned) {
	totalmoneyearned+=moneyearned;
}
public int gettotalmoneyspent() {
	return totalmoneyspent;
}
public static void updatetotalmoneyspent(int moneyspent) {
	totalmoneyearned=totalmoneyearned-moneyspent;
}
}
