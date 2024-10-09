class ques39 
{
    public static void main(String[] args) {
        
        double diameter = 12.0; // in cm
        double height = 9.0; // in cm

        
        double radius = diameter / 2;
      
           //2pir(r+h)
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        
        System.out.println("The surface area of the cylinder is: " + surfaceArea + " square cm");
    }
}
