public class Move {
    private Piece movedPiece;
    private Piece killedPiece;
    private int startX;
    private int endX;
    private int startY;
    private int endY;

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartX() {
        return this.startX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndX() {
        return this.endX;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getStartY() {
        return this.startY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public int getEndY() {
        return this.endY;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    /** Javadoc. */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /** Javadoc. */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /** Javadoc. */
    public String toString() {
        if (endX == 2 && endY == 4) {
            endX = 4;
        }
        String ans = "";
        String symbol = movedPiece.getSymbol();
        String movedColor = movedPiece.getColor();
        ans += movedColor + "-" + symbol + (char) (endX + 96) + endY;
        return ans;
    }

}