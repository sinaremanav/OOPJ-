public class This_keyword {
int roll_no;
String name;
int marks;
public This_keyword(int roll_no,String name,int marks)
{
this.roll_no=roll_no;
this.name=name;
this.marks=marks;
}
void display()  {
 System.out.println("Roll no.:"+ roll_no + "\tName : " + name + "\tMarks:  " + marks);
}
public static void main(String args[]){
This_keyword obj = new This_keyword(11,"Ayush",45);
obj.display();
}
}
