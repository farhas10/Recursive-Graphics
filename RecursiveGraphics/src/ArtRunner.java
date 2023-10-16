import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_SPACE;

public class ArtRunner
{
    public static void main(String[] args)
    {
        openingCredits();
        Art.draw(1);
        waitToAdvance();
        Art.draw(3);
        waitToAdvance();
        Art.draw(6);
        waitToAdvance();
        Art.draw(7);
        waitToAdvance();
    }

    private static void waitToAdvance()
    {
        while (!StdDraw.isKeyPressed(VK_SPACE))
        {
            StdDraw.pause(10);
        }
        resetCanvas();
        // Give the system time to catch up
        StdDraw.pause(1000);
    }

    private static void resetCanvas()
    {
        StdDraw.disableDoubleBuffering();
        StdDraw.setCanvasSize();
        StdDraw.pause(250);
    }

    private static void openingCredits()
    {
        StdDraw.text(0.5, 0.5, "Running Creative Art...");
        StdDraw.pause(500);
        StdDraw.clear();
        StdDraw.text(0.5, 0.5, "Press \"B\" to begin.");
        StdDraw.text(0.5, 0.4, "Press SPACE to advance to next problem.");
        while (!StdDraw.isKeyPressed(VK_B))
        {
            StdDraw.pause(10);
        }
        StdDraw.clear();
    }
}
