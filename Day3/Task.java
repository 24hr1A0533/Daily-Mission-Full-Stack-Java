public class Task {
  public static void main(String[] args) {
    int radius=7;
    double AreaOfCircle = (Math.PI*radius*radius);
    double perimeterOfCircle=(2 * Math.PI * radius);
    System.out.println("Area Of Circle: "+AreaOfCircle);
    System.out.println("Parameter of Circle: "+ perimeterOfCircle);
     int length=12;
     int width=5;
     int areaOfRectangle=(length*width);
     int perameterOfRectangle=2*(length+width);
     System.out.println("area of rectangle: "+areaOfRectangle);
     System.out.println("parameter of rectangle: "+perameterOfRectangle);

     int num=25;
     System.out.println(num%2==0? "Even" : "Odd");
  }
  
}
