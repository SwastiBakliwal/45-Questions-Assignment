class ques25 
{
    public static void main(String[] args) {
        
        int numberOfBricks = 100;

        
        double brickLength = 0.24; // in meters (24 cm)
        double brickWidth = 0.15;  // in meters (15 cm)

        
        double brickArea = brickLength * brickWidth;

        
        double totalArea = numberOfBricks * brickArea;

        
        System.out.println("The area of the path is: " + totalArea + " square meters.");
    }
}
