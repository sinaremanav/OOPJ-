import java.util.*;
class Greaterofthree{
 public static void main(String[] args){
  int a,b,c;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the first number");
  a=s.nextInt();
  System.out.println("Enter the second number");
  b=s.nextInt();
  System.out.println("Enterthe third number");
  c=s.nextInt();
  if(a>b && a>c){
  System.out.println(a+" is greater");
} else if(b>a && b>c){
  System.out.println(b+" is greater");
} else {
  System.out.println(c+" is greater");
} 
}
}
  