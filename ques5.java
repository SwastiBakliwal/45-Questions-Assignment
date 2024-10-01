class ques5 
{
 public static void main(String[] args) 
 {
   int park_length = 20;
   int cost_of_fencing = 1600;
   int rate_of_fencing_per_meter = 25;
   
   int perimeter_of_fencing = cost_of_fencing/rate_of_fencing_per_meter;

   int park_breadth = (perimeter_of_fencing/2)-park_length;

   int area_of_field = park_length * park_breadth;

   
   System.out.println("the Breadth of park is "+park_breadth+" m");
   System.out.println("Perimeter of fencing is "+perimeter_of_fencing+" m");
   System.out.println("Area of field is "+area_of_field+" m^2");
 }    
}
