import java.util.*;

public class Addition_array1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int sum = 0, size;
    System.out.print("Enter size of array :");
    size = sc.nextInt();
    int arr[]=new int[size];
   
    for (int i = 1; i <= size; i++) {
      System.out.print("Enter number " + i + " :");
      arr[i-1] = sc.nextInt();
      sum = sum +arr[i-1];

    }
    System.out.println("Addition is: " + sum);

  }
}
