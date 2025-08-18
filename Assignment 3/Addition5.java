public class Addition5 {
public void add(){
int a= 12;
int b= 45;
System.out.println("Addiion is :"+(a+b));
}
public int add(int a,int b){
return a+b;
}
public int add(int a,int b,int c){
return a+b+c;
}
public int add(int a,int b,int c,int d){
return a+b+c+d;
}
public static void main(String[] args) {
Addition5 a = new Addition5();
a.add();
System.out.println("Addition of 2 Integer : " + a.add(34,56));
System.out.println("Addition of 3 Integer : " + a.add(34,89,90));
System.out.println("Addition of 4 Integer : " +a.add(32,78,90,9));
}
}


