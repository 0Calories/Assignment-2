/**
 * Created by Thomas on 2/18/2016.
 */

/**
 * The class <b>Point</b> is a simple helper class that stares a 2 dimentional element on a grid
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class Point
{
    private int x;
    private int y;
    private int state = 0;

    /**
     * Constructor
     *
     * @param x
     *            the x coordinate
     * @param y
     *            the y coordinate
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter method for the attribute x.
     *
     * @return the value of the attribute x
     */
    public int getX()
    {
        return x;
    }

    /**
     * Getter method for the attribute y.
     *
     * @return the value of the attribute y
     */
    public int getY()
    {
        return y;
    }

    /**
     * Setter for x and y.
     * @param x
     *            the x coordinate
     * @param y
     *            the y coordinate
     */
    public void reset(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getState() { return this.state; }

    public void setState(int s) { this.state = s;}

}