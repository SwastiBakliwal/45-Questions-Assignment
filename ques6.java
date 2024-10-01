class ques6 
{
 public static void main(String[] args) 
 {
    int perimeter_of_triangle = 36;
    int a = 10;
    int b = 9;
    int c = perimeter_of_triangle - 19;
    int s = (a+b+c)/2;
    
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println(area+" cm^2");
 }    
}
