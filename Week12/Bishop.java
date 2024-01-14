public class Bishop extends Piece {
    @Override
    public String getSymbol() {
        return "B";
    }

    /* Constructor */
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /** Javadoc. */
    @Override
    public boolean canMove(Board board, int x, int y) {
        int xpos = this.getCoordinatesX();
        int ypos = this.getCoordinatesY();
        int index1 = ypos - y;
        int index2 = y - ypos;
        if (Math.abs(xpos - x) != Math.abs(ypos - y)) {
            return false;
        }
        if (x > xpos && y > ypos) {
            for (int i = 1; i < index2; i++) {
                if (board.getAt(xpos + i, ypos + i) != null) {
                    return false;
                }
            }
        }
        if (x > xpos && y < ypos) {
            for (int i = 1; i < index1; i++) {
                if (board.getAt(xpos + i, ypos - i) != null) {
                    return false;
                }
            }
        }
        if (x < xpos && y > ypos) {
            for (int i = 1; i < index2; i++) {
                if (board.getAt(xpos - i, ypos + i) != null) {
                    return false;
                }
            }
        }
        if (x < xpos && y < ypos) {
            for (int i = 1; i < index1; i++) {
                if (board.getAt(xpos - i, ypos - i) != null) {
                    return false;
                }
            }
        }
        Piece tmp = null;
        tmp = board.getAt(x, y);
        if (tmp != null) {
            String color1 = this.getColor();
            String color2 = tmp.getColor();
            if (color1.equals(color2)) {
                return false;
            }
        }
        return true;
    }
}