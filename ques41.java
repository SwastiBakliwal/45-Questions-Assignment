class ques41 
{
    public static void main(String[] args) {
        
        double diameter = 30.0; // in cm
        double height = 50.0; // in cm

        
        double radius = diameter / 2;

          //pir2h        
        double volume = Math.PI * Math.pow(radius, 2) * height;

        
        System.out.println("The volume of the cylinder is: " + volume + " cubic cm");
    }
}
