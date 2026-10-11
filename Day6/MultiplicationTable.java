import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=data.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(num+"x"+i+"="+i*num);
    }
  data.close();
  }
  
}
