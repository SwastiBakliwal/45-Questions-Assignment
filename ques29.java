class ques29 
{
    public static void main(String[] args) {
        
        double floorLength = 800;
        double floorWidth = 90;

        double tileSide = 10;

    
        double floorArea = floorLength * floorWidth;

    
        double tileArea = tileSide * tileSide;

        
        double numberOfTiles = floorArea / tileArea;

        System.out.println("The number of tiles needed is: " + (int)numberOfTiles);
    }
}
