/**
 * Name: Farzad Hasan
 * Mrs. Kankelborg
 * Period 1
 * Project 2 Recursive Art Project Part 2: Sierpinski 
 * Last Updated: 10/16/2023
 * 
 * Class Description:
 * This class will generate a Sierpinski triangle pattern which will recursively generate
 * triangles on a scale n times.
 */

public class Sierpinski {
    
	/** 
	 * Takes an integer parameter of n and draws the outline of an equilateral 
     * triangle(pointed upwards) of length 1 whose bottom-left vertex is (0,0) and 
     * bottom-right vertex is (1,0) and then calls the overloaded version of sierpinski 
     * of order n that fits snugly inside the outline.
     */
    public static void sierpinski(int n)
    {
    	
    }
    
    /**
     * Draws a Sierpinski triangle of order n, such that the largest filled
     * triangle has bottom vertex (x, y) and sides of the specified length.
     */
    private static void sierpinski(int n, double x, double y, double length)
    {
    	
    }
    
	/**
	 * Calculates the height of an equilateral triangle whose sides are of the specified
	 * length.
	 */
    private static double height(double length)
    {
    	//Since the triangle is equilateral, the lengths are the same. 
    	//To find height, use the mathematical formula for height.
    	double h = Math.sqrt(3) / 2 * length;
    	return h;
    }

    /**
     * Draws a filled equilateral triangle whose bottom vertex is (x, y) and whose sides
     * are of the specified length.
     */
    public static void filledTriangle(double x, double y, double length)
    {
    	//3 possible X coordinates since it is a triangle
    	//One is half the length from the center, one at the center, one is a positive half length
    	//from the center.
    	
    	//3 possible Y Coordinates from the center.
    	//Two from height + vertex and one at the vertex.
    	double xCoords[] = {x-(length/2), x, x + (length/2)};
    	double yCoords[] = {y + height(length), y, y + height(length)};
    	StdDraw.filledPolygon(xCoords, yCoords);
    } 
}
