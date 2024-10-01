class ques4 
{
    public static void main(String[] args) 
    {
      int length = 300;
      int breadth = 150;
      int area = length*breadth;
      
      System.out.println("Area of Plot is "+area+" m^2");
       
      float cost = 6/100f;

      float total_cost = area*cost;

      System.out.println("Total cost of tiling the plot  is $"+total_cost);
    }    
}
