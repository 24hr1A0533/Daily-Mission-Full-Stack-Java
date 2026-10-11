import java.util.Scanner;
public class GradeCalculatorSwitch {
  public static void main(String[] args)  {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter grade:");
  char grade=sc.nextLine().toUpperCase().charAt(0);
switch (grade) {
    case 'A':
      System.out.println("Excellent");
      break;
       case 'B':
      System.out.println("Very Good");
      break;
       case 'C':
      System.out.println("Good");
      break;
      case 'D':
      System.out.println("Pass");
      break;
      case 'F':
      System.out.println("Fail");
      break;
      
  
    default: System.out.println("Invalid Grade");
      break;
  }
  sc.close();

  }
  
}
