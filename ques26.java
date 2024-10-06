class ques26
{
    public static void main(String[] args) {
        
        double pathLength = 120.0; 
        double pathBreadth = 2.4;   

        
        double brickLength = 0.24; 
        double brickWidth = 0.15;  

        
        double pathArea = pathLength * pathBreadth;

        
        double brickArea = brickLength * brickWidth;

        
        double numberOfBricks = pathArea / brickArea;

        
        System.out.println("The area of the path is: " + pathArea + " square meters.");
        System.out.println("The area of one brick is: " + brickArea + " square meters.");
        System.out.println("The number of bricks required: " + Math.ceil(numberOfBricks));
    }
}
