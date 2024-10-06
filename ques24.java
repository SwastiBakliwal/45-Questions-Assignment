class ques24 
{
    public static void main(String[] args) {
        
        double wallLength = 20.0; // Length of the wall
        double wallHeight = 2.0;   // Height of the wall
        double wallThickness = 0.75; // Thickness of the wall

        
        double brickLength = 0.25; // Length of a brick (25 cm)
        double brickWidth = 0.10;   // Width of a brick (10 cm)
        double brickThickness = 0.075; // Thickness of a brick (7.5 cm)

        
        double wallVolume = wallLength * wallHeight * wallThickness;

        
        double brickVolume = brickLength * brickWidth * brickThickness;

        
        double numberOfBricks = wallVolume / brickVolume;

        
        double costPerThousandBricks = 900.0;
        
        
        double totalCost = (numberOfBricks / 1000) * costPerThousandBricks;

        
        System.out.println("Number of bricks required: " + Math.ceil(numberOfBricks));
        System.out.printf("Total cost to build the wall: $%.2f%n", totalCost);
    }
}
