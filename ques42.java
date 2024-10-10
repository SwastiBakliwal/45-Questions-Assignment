class ques42 
{
    public static void main(String[] args) {
        
        double diameter = 2.25; // in cm
        double height = 2.25; // in cm

        
        double radius = diameter / 2;

        
        double volume = Math.PI * Math.pow(radius, 2) * height;

        
        System.out.println("The volume of the cylinder is: " + volume + " cubic cm");
    }
}
