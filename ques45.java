class ques45 
{
    public static void main(String[] args) {
        
        int a = -21; // First term
        int d = 3; // Common difference
        int n = 28; // Number of terms

        
        int sum = (n * (2 * a + (n - 1) * d)) / 2;

        
        System.out.println("The sum of the first " + n + " terms of the AP is: " + sum);
    }    
}
