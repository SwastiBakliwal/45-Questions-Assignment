class ques3 
{
    public static void main(String[] args) {
        int length = 13;
        int breadth = 7;
        int area_of_tile =length*breadth;
         
        System.out.println("Area of Tile is "+area_of_tile+" cm^2");
         
        int region_length = 520;
        int region_breadth = 140;
        int area_of_region = region_length*region_breadth;
        
        System.out.println("Total area to cover is "+area_of_region+" cm^2");

        int no_of_tiles = area_of_region/area_of_tile;
         
        System.out.println("Numbers of Tiles needed to cover the area is "+no_of_tiles);

        
    }
}
