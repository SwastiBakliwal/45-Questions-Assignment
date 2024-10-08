class ques32 
{
    public static void main(String[] args) {
        
        double gardenSide = 150;
        
        double poolSide = 25;

        
        double gardenArea = Math.pow(gardenSide, 2);

    
        double poolArea = Math.pow(poolSide, 2);

        
        double remainingArea = gardenArea - poolArea;

        System.out.println("The area of the garden after accounting for the swimming pool is: " + remainingArea + " square meters");
    }
}
