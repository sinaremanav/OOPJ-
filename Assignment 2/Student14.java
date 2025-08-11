public class Student14 
{
int roll_no;
String name;
public Student14()
{
roll_no=21;
name="Yogesh";
System.out.println("Student Information: ");
System.out.println("Student Rollno.: " +roll_no);
System.out.println("Student name: " +name);
}
public Student14(int roll,String nam)
{
roll_no=roll;
name=nam;
System.out.println("Student Information: ");
System.out.println("Student Rollno.: " +roll_no);
System.out.println("Student name: " +name);
}
public static void main(String args[]){
Student14 s = new Student14();
Student14 sc = new Student14(23,"Yuvraj");
}
}






