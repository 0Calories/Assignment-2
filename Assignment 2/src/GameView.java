/**
 * Created by Thomas on 2/18/2016.
 */

import javax.swing.*;
import java.awt.*;


/**
 * The class <b>GameView</b> provides the current view of the entire Game. It extends
 * <b>JFrame</b> and lays out an instance of  <b>BoardView</b> (the actual game) and
 * two instances of JButton. The action listener for the buttons is the controller.
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class GameView extends JFrame {

    // ADD YOUR INSTANCE VARIABLES HERE
    private JPanel panel;
    private BoardView board;
    private JButton gameReset;
    private JButton gameQuit;


    /**
     * Constructor used for initializing the Frame
     *
     * @param model
     *            the model of the game (already initialized)
     * @param gameController
     *            the controller
     */

    public GameView(GameModel model, GameController gameController) {
        // REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
        super("TEST!");
        setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        board = new BoardView(model, gameController);
        add(board, BorderLayout.CENTER);

        gameReset = new JButton("Reset");
        gameQuit = new JButton("Quit");

        panel.add(gameReset);
        panel.add(gameQuit);
        add(panel,BorderLayout.SOUTH);
        panel.setSize((model.getSize() * 40) + 100, 400);

        setResizable(false);
        setSize((model.getSize() * 40) + 100, (model.getSize() * 40) + 100);
    }

    /**
     * Getter method for the attribute board.
     *
     * @return a reference to the BoardView instance
     */

    public BoardView getBoardView(){
        return board;
    }

}