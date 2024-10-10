class ques43 
{
    public static void main(String[] args) {
        
        double height = 4.0; // in cm
        double slantHeight = 5.0; // in cm
        double rate = 10.0; // in Rs per sq. cm

        
        double radius = Math.sqrt(slantHeight * slantHeight - height * height);

        
        double baseArea = Math.PI * radius * radius;

        
        double cost = baseArea * rate;

        
        System.out.println("The cost of polishing the base of the cone is: Rs. " + cost);
    }
}
