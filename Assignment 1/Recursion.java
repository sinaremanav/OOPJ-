import java.util.*;
public class Recursion {
public int fact(int n)
{
int total=1;
if(n>=1)
{
total=n*fact(n-1);
}
return total;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a no.");
int a = sc.nextInt();
Recursion f=new Recursion();
int value = f.fact(a);
System.out.println("factorial is "+value);
}
}