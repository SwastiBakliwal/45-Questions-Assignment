class ques23 
{
    public static void main(String[] args) {
        
        double cartonLength = 15.0; // in cm
        double cartonWidth = 9.0;    // in cm
        double cartonHeight = 12.0;   // in cm

    
        double boxSide = 3.0; // in cm

        
        int boxesInLength = (int) (cartonLength / boxSide);
        int boxesInWidth = (int) (cartonWidth / boxSide);
        int boxesInHeight = (int) (cartonHeight / boxSide);

        
        int totalBoxes = boxesInLength * boxesInWidth * boxesInHeight;

    
        System.out.println("The number of cubical boxes that can be accommodated in the carton: " + totalBoxes);
    } 
}
