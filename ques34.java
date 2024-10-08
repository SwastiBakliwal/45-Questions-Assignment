class ques34 
{
    public static void main(String[] args) {
        // Dimensions of the trapezoid
        double base1 = 128;
        double base2 = 92;
        double height = 40;

        // 
        double walkwayWidth = 4;
        double walkwayHeight = height;

        // 1/2*(base1+base2)*h
        double trapezoidArea = 0.5 * (base1 + base2) * height;

        
        double walkwayArea = walkwayWidth * walkwayHeight;

        
        double remainingArea = trapezoidArea - walkwayArea;

        System.out.println("The area of the wooded area after the addition of the walkway is: " + remainingArea + " square meters");
    }
}
