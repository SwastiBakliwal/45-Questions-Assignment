class ques19 
{
    public static void main(String[] args) {
        
        double sideCube = 7;
        double volumeCube = Math.pow(sideCube, 3);
        
        
        double lengthCuboid = 7;
        double breadthCuboid = 4;
        double heightCuboid = 8;
        double volumeCuboid = lengthCuboid * breadthCuboid * heightCuboid;
        
        
        System.out.println("Volume of the cube: " + volumeCube + " cm^3");
        System.out.println("Volume of the cuboid: " + volumeCuboid + " cm^3");
        
        if (volumeCube > volumeCuboid) {
            System.out.println("The cube has more volume.");
        } else {
            System.out.println("The cuboid has more volume.");
        }
    }    
}
