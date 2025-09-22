 public class TestException1
{
public static void main(String[] args)
{
 int a=12,b=0;
int c= a+b;
System.out.println("Addition is :"+c);
int d= a-b;
System.out.println("Subtraction  is :"+d);
int e= a*b;
System.out.println("Multiplication is :"+e);
try{

int g= a/b;
System.out.println("Division  is :"+g);
}
catch(Exception ex)
{
System.out.println("number cannot divide by zero");
}
}
}