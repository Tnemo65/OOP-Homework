import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;

    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board() {

    }

    /** Javadoc. */
    public void setPieces(ArrayList<Piece> p) {
        this.pieces = p;
    }

    /** Javadoc. */
    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    /** Javadoc. */
    public boolean validate(int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        return true;
    }

    /** Javadoc. */
    public boolean checkOnly(Piece piece) {
        boolean flag = true;
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == piece.getCoordinatesX()
                    && p.getCoordinatesY() == piece.getCoordinatesY()) {
                flag = false;
            }
        }
        return flag;
    }

    /** Javadoc. */
    public void addPiece(Piece piece) {
        if (piece != null) {
            if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                    && checkOnly(piece)) {
                pieces.add(piece);
            }
        }
    }

    /** Javadoc. */
    public Piece getAt(int x, int y) {
        Piece temp = null;
        for (Piece p : pieces) {
            if (p != null) {
                if (p.getCoordinatesX() == x
                        && p.getCoordinatesY() == y) {
                    temp = p;
                }
            }
        }
        return temp;
    }

    /** Javadoc. */
    public void removeAt(int x, int y) {
        for (Piece temp : pieces) {
            if (temp != null) {
                if (temp.getCoordinatesX() == x
                        && temp.getCoordinatesY() == y) {
                    pieces.remove(temp);
                    return;
                }
            }
        }
    }
}
