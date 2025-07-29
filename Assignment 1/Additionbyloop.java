import java.util.*;

public class Additionbyloop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,num,sum=0;

        System.out.print("Enter No. of integers to enter :");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
          System.out.print("Enter number "+i+" :");
          num=sc.nextInt();
          sum=sum+num;

        }
        System.out.println("Addition is: "+sum);


    }
}
