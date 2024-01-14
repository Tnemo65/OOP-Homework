import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /** Javadoc. */
    public void movePiece(Piece piece, int x, int y) {
        if (piece == null) {
            return;
        }
        if (piece.canMove(board, x, y)) {
            // Nếu như có con bị giết
            if (board.getAt(x, y) != null) {
                Move move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y,
                        piece, board.getAt(x, y));
                moveHistory.add(move);
                board.removeAt(x, y);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                // Nếu như không con nào bị giết
            } else {
                Move move = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y,
                        piece);
                moveHistory.add(move);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            }

        }
    }

    public Game(Board board) {
        this.board = board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return this.board;
    }

    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}