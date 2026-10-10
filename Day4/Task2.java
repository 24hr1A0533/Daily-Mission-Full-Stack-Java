import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task2 {
  public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name:");
    String name=br.readLine();
    System.out.println("Enter your age:");
    int age=Integer.parseInt(br.readLine());
    System.out.println("Enter your percentage:");
    double percentage=Double.parseDouble(br.readLine());
    System.out.println("Enetr your grade:");
    String str=br.readLine();
    char grade=str.charAt(0);
    System.out.println("Enter your a student? ");
    String str1 =br.readLine();
    boolean student=Boolean.parseBoolean(str1);
    System.out.printf("===================================\n");
    System.out.printf(" %20s%n","PROFILE CARD\n");
    System.out.printf("===================================\n");
    System.out.printf("Name       : %s%n",name);
    System.out.printf("Age        : %d%n",age);
    System.out.printf("percentage : %.2f%n",percentage);
    System.out.printf("Grade      : %c%n",grade);
    System.out.printf("Student    : %b%n",student);
    System.out.printf("====================================%n");
    br.close();
  }
}
