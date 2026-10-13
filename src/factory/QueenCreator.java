
package factory;

import piece.Queen;
import piece.Piece;

public class QueenCreator implements PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new Queen(x, y, color);
    }
}
  