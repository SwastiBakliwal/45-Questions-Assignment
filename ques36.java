class ques36 
{
    public static void main(String[] args) {
        double diameter = 15;
        double height = 7;
        double radius = diameter / 2;
        double pi = Math.PI;

        // 2pir(r+h)
        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.println("The surface area of the cylinder is: " + surfaceArea + " square meters");
    }
}
