import java.util.*;
public class Student15 
{
int roll_no;
String name;
public Student15()
{
roll_no=21;
name="Yogesh";
System.out.println("Student Information: ");
System.out.println("Student Rollno.: " +roll_no);
System.out.println("Student name: " +name);
}
public Student15(int roll,String nam)
{
roll_no=roll;
name=nam;
System.out.println("Student Information: ");
System.out.println("Student Rollno.: " +roll_no);
System.out.println("Student name: " +name);
}
public static void main(String args[]){
Scanner nw = new Scanner(System.in);
System.out.println("roll no.:");
int r=nw.nextInt();
System.out.println("name:");
String n = nw.next();
Student15 s = new Student15();
Student15 sc = new Student15(r,n);
}
}






