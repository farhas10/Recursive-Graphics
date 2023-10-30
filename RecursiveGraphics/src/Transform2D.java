/**
 * Name: Farzad Hasan
 * Mrs. Kankelborg
 * Period 1
 * Project 2 Recursive Art Project Part 1: Transform2D
 * Last Updated: 10/23/2023
 * 
 * Class Description:
 * We will write this library to utilize basic transformations and apply them on drawings
 * in other parts of this project.
 */

public class Transform2D {
	
	/**
	 * Returns a new array object that is an exact copy of the given array.
	 * The given array is not mutated.
	 */
	public static double[] copy(double[] array) 
	{
		//Simply clones the array and returns it in the form of a new array.
		double [] arrayCopy = array.clone();
		return arrayCopy;
	}
	
	/**
	 * Scales the polygon by the factor alpha.
	 * The given array is mutated.
	 */
	public static void scale(double[] x, double[] y, double alpha) 
	{
		//Until the length of the array is met, each intermittent value is multiplied by alpha.
		for (int i = 0; i < x.length; i++) {
			x[i] = alpha * x[i];
			y[i] = alpha * y[i];
		}
		
	}
	
	
	/**
	 * Translates the polygon by (dx, dy)
	 * The given array is mutated.
	 */
	public static void translate (double[] x, double[] y, double dx, double dy) 
	{
		//For each index in the arrays, dx and dy are added to the existing points.
		for (int i = 0; i < x.length; i++) {
			x[i] = dx + x[i];
			y[i] = dy + y[i];
		}
		
	}
	
	/**
	 * Rotates the polygon theta degrees counterclockwise, about the origin.
	 * The given array is mutated.
	 */
	public static void rotate (double[] x, double[] y, double theta) 
	{
		
		//Calculates appropriate values for cos and sin of theta by converting from angle to rads.
		theta = Math.toRadians(theta);
		
		//Copy array to manipulate the angled points.
		double x0[] = copy(x);
		double y0[] = copy(y);
		//Loops through each value to calculate the new X and Y by subtracting or adding
		//sine and cosine values.
		for (int i = 0; i < x.length; i++) {
		x[i] = (Math.cos(theta) * x0[i]) - (Math.sin(theta) * y0[i]);
		y[i] = (Math.sin(theta) * x0[i]) + (Math.cos(theta) * y0[i]);
		}
	}
	
	/**
	 * You can use this method to test that each other method works properly.
	 */
	public static void main (String[] args) 
	{
		
		
		
		
	}
}
