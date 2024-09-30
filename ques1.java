class ques1
{
   public static void main(String[] args) 
   {
      int perimeter = 230;
      int length = 70;
      

      System.out.println("length is "+length+" cm");
      System.out.println("Breadth is "+((perimeter/2) - length)+" cm");
      System.out.println("Perimeter of rectangle is "+(2*(length+(perimeter/2) - length))+" cm");
      System.out.println("Area od Rectangle is "+length+((perimeter/2) - length)+" cm^2");
   }   
}