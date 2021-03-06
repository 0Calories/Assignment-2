/**
 * Created by Thomas on 2/18/2016.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The class <b>GameController</b> is the controller of the game. It implements
 * the interface ActionListener to be called back when the player makes a move. It computes
 * the next step of the game, and then updates model and view.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */


public class GameController implements ActionListener {

    // ADD YOUR INSTANCE VARIABLES HERE
    private GameModel model;


    /**
     * Constructor used for initializing the controller. It creates the game's view
     * and the game's model instances
     *
     * @param size
     *            the size of the board on which the game will be played
     */
    public GameController(int size) {
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }


    /**
     * Starts the game
     */
    public void start(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
        model = new GameModel(10);
        GameView game = new GameView(model, this);
        game.setVisible(true);

    }


    /**
     * resets the game
     */
    public void reset(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }

    /**
     * Callback used when the user clicks a button or one of the dots.
     * Implements the logic of the game
     *
     * @param e
     *            the ActionEvent
     */

    public void actionPerformed(ActionEvent e) {

        // REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }


}