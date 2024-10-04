class ques18 
{
    public static void main(String[] args) {
        
        double length = 50;
        double breadth = 30;
        
        
        double perimeter = 2 * (length + breadth);
        
        
        int rounds = 10;
        
        
        double totalDistanceMeters = rounds * perimeter;
        
        
        double totalDistanceKilometers = totalDistanceMeters / 1000;
        
        
        System.out.println("The total distance covered by Ron in a day is: " + totalDistanceKilometers + " km");
    }
}
