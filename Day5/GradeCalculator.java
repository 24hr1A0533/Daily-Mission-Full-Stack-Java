import java.util.Scanner;
public class GradeCalculator {
  public static void main(String[] args) {
    Scanner data=new Scanner(System.in);
    System.out.println("Enter marks:");
    int marks=data.nextInt();
    char grade='l';
    if(marks>=0 && marks<=100){
      if(marks>=90 && marks<=100){
        grade='A';
      }else if(marks>=75 && marks<=89){
        grade='B';
      }else if(marks>=60 && marks<=74){
        grade='C';
      }else if(marks>=40 && marks<=59){
        grade='D';
      }else if(marks>=0 && marks<=39){
        grade='F';
      }
    
    }else{
      System.out.println("Invalid marks");
    }
    if(grade!='l')System.out.println("Grade:"+ grade +"  Marks:"+marks);
    data.close();
  }
  
}
