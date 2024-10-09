class ques38 
{
    public static void main(String[] args) {
        
        double volume = 1287.0; // in cubic cm
        double radius = 10.0; // in cm

        
        double height = volume / (Math.PI * Math.pow(radius, 2));

        // 2pir(r+h)
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        
        System.out.println("The surface area of the cylinder is: " + surfaceArea + " square cm");
    }
}
