class ques33 
{
    public static void main(String[] args) {
        
        double length = 30;
        double width = 20;

        
        double pathway1Width = 3;
        double pathway2Width = 4;

        
        double totalArea = length * width;

        
        double pathwaysArea = (pathway1Width * width) + (pathway2Width * length) - (pathway1Width * pathway2Width);

        
        double usableArea = totalArea - pathwaysArea;

        System.out.println("The total usable area of the garden is: " + usableArea + " square meters");
    }
}
