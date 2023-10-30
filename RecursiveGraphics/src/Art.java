/**
 * <pre>
 * Name: Farzad Hasan
 * Mrs. Kankelborg
 * Period 1
 * Project 2 Recursive Art Project Part 3: Art
 * Revision History: 10/23/2023
 *
 * Class Description:
 * This will be my own creative art project which utilizes recursion to generate unique patterns
 * which cannot be done with simple looping or iteration. 
 * 
 * To be unique, I utilized the filledPolygon method from StdDraw, used different paramaters than
 * the Sierpinski method (I added theta as well), and used the Transform2D rotate method.
 * </pre>
 */

public class Art
{
   /**
	* All other functions other than draw must be private.
	* You must have at least 2 other methods besides draw.
	* You may not alter the header of this method.
	*/
	
	
	
	public static void draw(int n) 
	{
		//Draws the background black
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(0,0,25);
		//First call to draw the 3D pattern
		drawHexPattern(n, 0, 5, 5, 0);
		//Used double buffering to only show to final product
		StdDraw.show();
	}
	
	private static void drawHexPattern(int n, double x, double y, double height, double theta) {
		StdDraw.enableDoubleBuffering();
		//Uses x and y to determine the top point of a 3D cube, theta is used to find rotation.
		drawHex(x,y,height, theta);
		//Base case
		if (n == 0) {
			return;
		}
		
		//4 recursive calls which originate from the 4 sides of the canvas.
		//Cubes get larger and larger with each recursive call and begin to spiral in.
		//bottom stream
		drawHexPattern(n-1, 0, (n * (n-1)) - 5, n, 90/n);
		//left stream
		drawHexPattern(n-1, (n * (n-1)) -5, 0, n, 90/n);
		//right stream
		drawHexPattern(n-1, (-n * (n-1)) + 5, 0, n, 90/n);
		//top stream
		drawHexPattern(n-1, 0, -1*(n * (n-1)) + 5, n, 90/n);
		
	}
	
	private static void drawHex(double x, double y, double height, double theta) {
		StdDraw.setXscale(-25, 25);
		StdDraw.setYscale(-25, 25);
		
		//Draws left side diamond
		//Specified pen color for every face of the cube to give it the effect.
		StdDraw.setPenColor(150, 185, 220);
		//Uses 30, 60, 90 triangle to calculate shape sizes.
		double xCoords[] = {x-(Math.sqrt(3) *(height/2)), x-(Math.sqrt(3) *(height/2)), x, x};
		double yCoords[] = {y-(1.5*height), y-(0.5*height), y, y-height};
		Transform2D.rotate(xCoords, yCoords, theta);
		//Using filledPolygon as I have to create a diamond shape.
		StdDraw.filledPolygon(xCoords, yCoords);
		
		//Draws right side diamond
		StdDraw.setPenColor(86, 142, 198);
		double xCoordsNew[] = {x+(Math.sqrt(3) *(height/2)), x+(Math.sqrt(3) *(height/2)), x, x};
		double yCoordsNew[] = {y-(1.5*height), y-(0.5*height), y, y-height};
		Transform2D.rotate(xCoordsNew, yCoordsNew, theta);
		StdDraw.filledPolygon(xCoordsNew, yCoordsNew);
		
		//Draws lower horizontal diamond
		StdDraw.setPenColor(73, 97, 120);
		double lowerX[] = {x-(Math.sqrt(3) *(height/2)), 
				x, x+(Math.sqrt(3) *(height/2)),x};
		double lowerY[] = {y-(1.5*height), y - height, y - (1.5*height), y - (2*height)};
		Transform2D.rotate(lowerX, lowerY, theta);
		StdDraw.filledPolygon(lowerX, lowerY);
		
		
		
		
	}
}
