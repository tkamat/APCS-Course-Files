
/**
 * This class draws a Sierpinski Triangle.
 *
 * @version 08/10/07
 */
import java.applet.Applet;
import java.awt.*;

public class SierpinskiTriangle extends Applet
{
    public void drawSierpinskiTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics canvas)
    {
        if(((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) > 100)
        {
            canvas.drawLine(x1,y1,x2,y2);
            canvas.drawLine(x2,y2,x3,y3);
            canvas.drawLine(x3,y3,x1,y1);

            drawSierpinskiTriangle((x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2, x1, y1, canvas);
            drawSierpinskiTriangle((x1+x2)/2, (y1+y2)/2, (x3+x2)/2, (y3+y2)/2, x2, y2, canvas);
            drawSierpinskiTriangle((x1+x3)/2, (y1+y3)/2, (x3+x2)/2, (y3+y2)/2, x3, y3, canvas);
        }
    }

    public void paint(Graphics g)
    {
        drawSierpinskiTriangle(10, 280, 290, 280, 150, 40, g);
    }
}
