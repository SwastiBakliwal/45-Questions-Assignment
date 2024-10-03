class ques15 
{
    public static void main(String[] args) {
        // Dimensions of Shelly's garden
        double lengthShelly = 22;
        double breadthShelly = 15;
        double areaShelly = lengthShelly * breadthShelly;
        
        // Dimensions of Rachel's garden
        double sideRachel = 21;
        double areaRachel = sideRachel * sideRachel;
        
        // Calculate the difference
        double difference = areaRachel - areaShelly;
        
        // Output the results
        System.out.println("Area of Shelly's garden: " + areaShelly + " m^2");
        System.out.println("Area of Rachel's garden: " + areaRachel + " m^2");
        System.out.println("Rachel's garden is bigger by: " + difference + " m^2");
    }    
}
