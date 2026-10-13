
package factory;

import piece.Knight;
import piece.Piece;

public class KnightCreator implements PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new Knight(x, y, color);
    }
}
  