import java.util.*;
public class Numbers{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
for(int i=1;i<=n;i++){
System.out.println(i);
}

for(int i=n;i>=0;i--){
System.out.println(i);
}
}
}