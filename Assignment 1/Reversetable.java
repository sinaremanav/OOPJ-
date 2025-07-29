import java.util.*;
public class Reversetable{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for(int i=(n*10);i>0;i=i-n){
System.out.println(i);
}
}
}