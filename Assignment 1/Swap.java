import java.util.*;
class Swap{
 public static void main(String[] args){
  int a,b,temp;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the first number");
  a=s.nextInt();
  System.out.println("Enter the second number");
  b=s.nextInt();
  System.out.println("Before swaping A:"+a +"B:"+b);

  
  temp=a;
  a=b;
  b=temp;
  System.out.println("After swaping A:"+a +"B:"+b);
}
}
  