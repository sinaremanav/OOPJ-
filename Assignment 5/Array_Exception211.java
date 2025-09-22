class Array_Exception211
{
public static void main(String[] args){
int[] a= {1,2,3,4,5};
try{
//for(int i=0;i<a.length;i++){
System.out.println(a[6]+"\t");
//}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out of bound");
}
}
}