public class Addition4 {
public void add(){
int a= 12;
int b= 45;
System.out.println("Addiion is :"+(a+b));
}
public int add(int a,int b){
return a+b;
}
public float add(float a,float b){
return a+b;
}
public double add(double a,double b){
return a+b;
}
public static void main(String[] args) {
Addition4 a = new Addition4();
a.add();
System.out.println("Addition of Integer : " + a.add(34,56));
System.out.println("Addition of float : " + a.add(34.56f,23.344f));
System.out.println("Addition of double : " + a.add(34.44d,22.22d));
}
}


