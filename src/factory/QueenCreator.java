
package factory;

import piece.Queen;
import piece.Piece;

public class QueenCreator extends PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new Queen(x, y, color);
    }
}
  