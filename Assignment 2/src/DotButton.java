/**
 * Created by Thomas on 2/18/2016.
 */

import javax.swing.*;

/**
 * In the application <b>Circle the dot</b>, a <b>DotButton</b> is a specialized type of
 * <b>JButton</b> that represents a dot in the game. It uses different icons to
 * visually reflect its state: a blue icon if the blue dot is currently on this location
 * an orange icon is the dot has been selected and a grey icon otherwise.
 *
 * The icon images are stored in a subdirectory ``data''. They are:
 * data/ball-0.png => grey icon
 * data/ball-1.png => orange icon
 * data/ball-2.png => blue icon
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */

public class DotButton extends JButton {

    // ADD YOUR INSTANCE VARIABLES HERE

    /**
     * Constructor used for initializing a cell of a specified type.
     *
     * @param row
     *            the row of this Cell
     * @param column
     *            the column of this Cell
     * @param type
     *            specifies the type of this cell
     */

    public DotButton(int row, int column, int type) {
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }



    /**
     * Changes the cell type of this cell. The image is updated accordingly.
     *
     * @param type
     *            the type to set
     */

    public void setType(int type) {
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }


    /**
     * Getter method for the attribute row.
     *
     * @return the value of the attribute row
     */

    public int getRow() {
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }

    /**
     * Getter method for the attribute column.
     *
     * @return the value of the attribute column
     */

    public int getColumn() {
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
    }
}