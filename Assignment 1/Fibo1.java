import java.util.*;
public class Fibo1
 {
  public static void main(String args[]){
  Scanner s = new Scanner(System.in);
  int a=0,b=1,n,c;
  System.out.println("Enter a positive no. ");
  n=s.nextInt();
  System.out.println(a);
  System.out.println(b);
  for(int i=2;i<n;i++){
   c=a+b;
   System.out.println(c);
   a=b;
   b=c;
  }
}
}
  
  
