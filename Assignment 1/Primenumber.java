import java.util.*;
public class Primenumber {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
boolean con=true;
System.out.println("enter a no.");
int a = sc.nextInt();
for(int i=2;i<a;i++){
if(a%i == 0){
con = false;
}
}
if(con){
System.out.println("prime");
}
else{
System.out.println("not prime");

}
}
}