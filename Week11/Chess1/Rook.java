public class Rook extends Piece {
    public Rook() {

    }

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    /** Javadoc. */
    public boolean checkLine(int x, int y) {
        boolean res = true;
        if (this.getCoordinatesX() != x
                && this.getCoordinatesY() != y) {
            res = false;
        }
        return res;
    }

    /** Javadoc. */
    public boolean haveObstacle(Board board, int x, int y) {
        for (Piece p : board.getPieces()) {
            if (p != null) {
                if (checkLine(p.getCoordinatesX(), p.getCoordinatesY()) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Javadoc. */
    public boolean haveFrontObstacle(Board board, int x, int y) {

        int posX = this.getCoordinatesX();
        int posY = this.getCoordinatesY();
        if (x < posX && y == posY) {
            for (int i = posX - 1; i > x; i--) {
                if (board.getAt(i, y) != null) {
                    return true;
                }

            }
        }
        if (x > posX && y == posY) {
            for (int i = posX + 1; i < x; i++) {
                if (board.getAt(i, y) != null) {
                    return true;

                }

            }
        }
        if (y < posY && x == posX) {
            for (int i = posY - 1; i > y; i--) {
                if (board.getAt(x, i) != null) {
                    return true;

                }
            }
        }
        if (y > posY && x == posX) {
            for (int i = posY + 1; i < y; i++) {
                if (board.getAt(x, i) != null) {
                    return true;

                }
            }
        }
        return false;
    }

    /** Javadoc. */
    @Override
    public boolean canMove(Board board, int x, int y) {
        boolean ans = true;
        // Trường hợp không đi thẳng -> false
        if (!checkLine(x, y)) {
            ans = false;
        } else if (haveObstacle(board, x, y)) {
            // Trường hợp không có chướng ngại vật trên đường thẳng
            // Trường hợp có chướng ngại vật
            if (haveFrontObstacle(board, x, y)) {
                ans = false;
            }
        }
        if (board.getAt(x, y) != null) {
            String desColor = board.getAt(x, y).getColor();
            String thisColor = this.getColor();
            if (desColor.equals(thisColor)) {
                ans = false;
            }
        }
        return ans;
    }
}
