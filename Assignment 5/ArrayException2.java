 public class ArrayException2
{
public static void main(String[] args)
{
int arr[] = {1,2,3,4,5};
try
{

System.out.println(arr[5]);
}
catch(Exception e)
{
System.out.println("Array Index out of bound because array size is 5 and you are accessing 5th index");

}
System.out.println(arr[3]);

}
}