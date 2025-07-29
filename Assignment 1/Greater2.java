import java.util.*;
public class Greater2
{
public static void main(String[] args)
{

Scanner s = new Scanner(System.in);
System.out.println("Enter the 1st numbers");
int a = s.nextInt();
System.out.println("Enter the 2nd number");
int b = s.nextInt();
int val=(a>b)?a:b;
System.out.println("greater "+val);

}
}



