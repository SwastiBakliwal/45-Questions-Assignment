class ques21 
{
    public static void main(String[] args) {
        
        int wallLength = 1500; // 15 meters
        int wallBreadth = 1000; // 10 meters
        int wallHeight = 800; // 8 meters

        
        int brickLength = 15;
        int brickBreadth = 8;
        int brickHeight = 5;

        
        int wallVolume = wallLength * wallBreadth * wallHeight;

        
        int brickVolume = brickLength * brickBreadth * brickHeight;

        
        int numberOfBricks = wallVolume / brickVolume;

        System.out.println("Wall volume "+wallVolume);
        System.out.println("Number of bricks needed: " + numberOfBricks);
    }
    
}
