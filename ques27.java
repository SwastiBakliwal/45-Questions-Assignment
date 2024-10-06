class ques27 
{
    public static void main(String[] args) {
        
        double length = 20.0; 
        double width = 15.0; 
        
    
        double costPerSquareMeter = 5.0; // in dollars

        
        double area = length * width;

        
        double totalCost = area * costPerSquareMeter;

        
        System.out.println("The area of the dining room is: " + area + " square meters.");
        System.out.println("The total cost of tiling is: $" + totalCost);
    }
}
