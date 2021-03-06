/**
 * Created by Thomas on 2/18/2016.
 */
import java.util.Random;

/**
 * The class <b>GameModel</b> holds the model, the state of the systems.
 * It stores the following information:
 * - the current location of the blue dot
 * - the state of all the dots on the board (available, selected or
 *  occupied by the blue dot
 * - the size of the board
 * - the number of steps since the last reset
 *
 * The model provides all of this informations to the other classes trough
 *  appropriate Getters.
 * The controller can also update the model through Setters.
 * Finally, the model is also in charge of initializing the game
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */
public class GameModel
{
    /**
     * predefined values to capture the state of a point
     */
    public static final int AVAILABLE = 0;
    public static final int SELECTED = 1;
    public static final int DOT = 2;

    // ADD YOUR INSTANCE VARIABLES HERE
    private int[][] stateArray;
    private int sizeOfGame;
    private int steps = 0;
    private Point bDot;

    Random rand = new Random();

    /**
     * Constructor to initialize the model to a given size of board.
     *
     * @param size
     *            the size of the board
     */
    public GameModel(int size)
    {
        // REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
        sizeOfGame = size;
        stateArray = new int[size][size];
    }


    /**
     * Resets the model to (re)start a game. The previous game (if there is one)
     * is cleared up . The blue dot is positioned as per instructions, and each
     * dot of the board is either AVAILABLE, or SELECTED (with
     * a probability 1/INITIAL_PROBA). The number of steps is reset.
     */
    public void reset()
    {

        // REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
        steps = 0;
        int bDotX;
        int bDotY;

        //Randomly pick a center point for the blue dot, and place it in the Point array, depending on whether the board is odd or even
        if (sizeOfGame % 2 == 0)
        {
            bDotX = rand.nextInt(((sizeOfGame / 2)) - ((sizeOfGame / 2) - 1)  + 1);   //min = ((sizeOfGame / 2) - 1)      max = ((sizeOfGame / 2))
            bDotY = rand.nextInt(((sizeOfGame / 2)) - ((sizeOfGame / 2) - 1)  + 1);
        }
        else
        {
            bDotX = rand.nextInt(((sizeOfGame / 2) + 1) - ((sizeOfGame / 2) - 1)  + 1);   //min = ((sizeOfGame / 2) - 1)      max = ((sizeOfGame / 2) + 1)
            bDotY = rand.nextInt(((sizeOfGame / 2)) - ((sizeOfGame / 2) - 1)  + 1);
        }

        //Create the blue dot instance and set its position
        stateArray[bDotY][bDotX] = DOT;
        bDot = new Point(bDotX, bDotY);

        //for loop to fill the Point array with points that are either SELECTED or AVAILABLE
        for (int i = 0; i < sizeOfGame; i++)
        {
            for (int j = 0; j < sizeOfGame; j++)
            {
                if (stateArray[i][j] != DOT)
                {
                    int selectedPoint = rand.nextInt(9); //If this value is 1, then the point is selected
                    if (selectedPoint == 1)
                    {
                        stateArray[i][j] = SELECTED;
                    }
                    else
                    {
                        stateArray[i][j] = AVAILABLE;
                    }
                }

            }
        }

    }


    /**
     * Getter <b>class</b> method for the size of the game
     *
     * @return the value of the attribute sizeOfGame
     */
    public  int getSize() { return sizeOfGame; }

    /**
     * returns the current status (AVAILABLE, SELECTED or DOT) of a given dot in the game
     *
     * @param i
     *            the x coordinate of the dot
     * @param j
     *            the y coordinate of the dot
     * @return the status of the dot at location (i,j)
     */
    public int getCurrentStatus(int i, int j) { return stateArray[i][j]; }


    /**
     * Sets the status of the dot at coordinate (i,j) to SELECTED, and
     * increases the number of steps by one
     *
     * @param i
     *            the x coordinate of the dot
     * @param j
     *            the y coordinate of the dot
     */
    public void select(int i, int j)
    {
        stateArray[i][j] = SELECTED;
        steps++;
    }

    /**
     * Puts the blue dot at coordinate (i,j). Clears the previous location
     * of the blue dot. If the i coordinate is "-1", it means that the blue
     * dot exits the board (the player lost)
     *
     * @param i
     *            the new x coordinate of the blue dot
     * @param j
     *            the new y coordinate of the blue dot
     */
    public void setCurrentDot(int i, int j)
    {
        bDot.reset(i, j);
    }

    /**
     * Getter method for the current blue dot
     *
     * @return the location of the curent blue dot
     */
    public Point getCurrentDot() { return bDot; }

    /**
     * Getter method for the current number of steps
     *
     * @return the current number of steps
     */
    public int getNumberOfSteps() { return this.steps; }
}
