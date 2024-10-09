class ques37 
{
    public static void main(String[] args) {
        double surfaceArea = 149;
        double height = 6;
        double pi = Math.PI;

        //  ar^2 + br + c = 0
        double a = 2 * pi;
        double b = 2 * pi * height;
        double c = -surfaceArea;

    
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant >= 0) {
            
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        
            double radius = Math.max(r1, r2);

            
            double diameter = 2 * radius;

            System.out.println("The diameter of the cylinder is: " + diameter + " cm");
        } else {
            System.out.println("No real solutions for the radius.");
        }
    }
}
