class ques12 
{
 public static void main(String[] args) {
    double hypotenuse = 13;
    double side1 = 12;
    double side2 = Math.sqrt(hypotenuse * hypotenuse - side1 * side1);
    
    double area = 0.5 * side1 * side2;
    
    System.out.println("The length of the other side is: " + side2 + " cm");
    System.out.println("The area of the triangle is: " + area + " cm^2");
 }    
}
