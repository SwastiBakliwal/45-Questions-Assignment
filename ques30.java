class ques30 
{
    public static void main(String[] args) {
        
        double floorLength = 200;
        double floorWidth = 400;

        
        double tileLength = 5;
        double tileBreadth = 8;

        
        double floorArea = floorLength * floorWidth;

        
        double tileArea = tileLength * tileBreadth;

        
        double numberOfTiles = floorArea / tileArea;

        System.out.println("The number of tiles needed is: " + (int)numberOfTiles);
    } 
}
