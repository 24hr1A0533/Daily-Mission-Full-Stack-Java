import java.util.Scanner;

public class SumOfN {
  public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
    System.out.println("Enter N:");
    int num = data.nextInt();

    if (num < 0) {
      System.out.println("Invalid input");
    } else {
      int sum = 0;
      int i = 1;  

      while (i <= num) {
        sum += i;   
        i++;        
      }

      System.out.println("Sum = " + sum);
    }

    data.close();
  }
}
