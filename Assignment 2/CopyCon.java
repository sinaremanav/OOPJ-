import java.util.*;
public class CopyCon{
 int id;
 String name;
 int mob;
 public CopyCon(int i,String n,int m){
   id=i;
   name=n;
   mob=m;
   System.out.println("Student id: "+i+ "Student name: "+name+" Mob.: "+mob);
  }
public CopyCon(CopyCon obj)
{
id=obj.id;
name=obj.name;
mob=obj.mob;
System.out.println("Student id: "+id+ "Student name: "+name+" Mob.: "+mob);
}
 
public static void main(String args[]){
 CopyCon c=new CopyCon(1835,"Vaibhav",85);
 CopyCon c1=new CopyCon(c);
}
}