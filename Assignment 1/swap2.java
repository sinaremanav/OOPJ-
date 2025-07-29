import java.util.*;
class Swap2{
 public static void main(String[] args){
  int a,b;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the first number");
  a=s.nextInt();
  System.out.println("Enter the second number");
  b=s.nextInt();
  System.out.println("Before swaping A:"+a +"B:"+b);

  
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("After swaping A:"+a +"B:"+b);
}
}
  