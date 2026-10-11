import java.util.Scanner;
public class GradeCalculatorModern {
  public static void main(String[] args) {
    Scanner data=new Scanner(System.in);
    System.out.println("Enetr marks:");
    int marks=data.nextInt();
    char grade='i';
    if(marks<0 || marks>100)System.out.println("invalid marks");
    else{
      marks /=10;
      grade=switch(marks){
      case 9,10 -> 'A';
      case 8,7 -> 'B';
      case 6 -> 'C';
      case 5,4 -> 'D';
      case 3,0,1,2 -> 'F';
      
    
      default -> 'i';
    
    };
      if(grade != 'i')System.out.println(grade);
  }
  data.close();
  }
  
}
