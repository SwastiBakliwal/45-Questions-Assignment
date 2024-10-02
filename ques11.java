class ques11 
{
 public static void main(String[] args) 
 {
     
     double area = 320.0;

     
     double ratioBase = 8.0;
     double ratioHeight = 5.0;

     
     double kSquare = area / (0.5 * ratioBase * ratioHeight);
     double k = Math.sqrt(kSquare);

     
     double base = ratioBase * k;
     double height = ratioHeight * k;

     
     System.out.println("Base of the triangle: " +base);
     System.out.println("Height of the triangle: "+ height);
 
 }
}
