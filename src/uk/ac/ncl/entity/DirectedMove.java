/**
 * @author Kostiantyn Potomkin
 * @version 0.9
 * @since 05-03-2020
 */
package uk.ac.ncl.entity;

/**
 * Stores the cell and direction of a perfectly valid moves
 */
public class DirectedMove {

    /**
     * Target cell
     */
    private Cell cell;

    /**
     * array of valid directions for the selected cell
     */
    private int[] direction;

    public DirectedMove(Cell cell, int[] direction) {
        this.cell = cell;
        this.direction = direction;
    }

    public Cell getCell() {
        return cell;
    }

    public int[] getDirection() {
        return direction;
    }
}
