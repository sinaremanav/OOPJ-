import java.util.*;
public class Factorial 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no.");
int num,fact=1;
num = sc.nextInt();
for(int i=num;i>=1;i--)
{
fact = fact * i;
}
System.out.println("factorial of no. "+num+" is "+fact);
}
}
