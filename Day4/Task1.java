import java.util.*;
public class Task1 {
  public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=data.nextLine();
    System.out.println("Enter your age:");
    int age=data.nextInt();
    System.out.println("Enter your percentage:");
    double percentage=data.nextDouble();
    System.out.println("Enetr your grade:");
    char grade=data.next().charAt(0);
    System.out.println("Enter your a student? ");
    boolean student=data.nextBoolean();
    System.out.printf("===================================\n");
    System.out.printf(" %20s%n","PROFILE CARD\n");
    System.out.printf("===================================\n");
    System.out.printf("Name       : %s%n",name);
    System.out.printf("Age        : %d%n",age);
    System.out.printf("percentage : %.2f%n",percentage);
    System.out.printf("Grade      : %c%n",grade);
    System.out.printf("Student    : %b%n",student);
    System.out.printf("====================================%n");
    data.close();
  }
}
