
package factory;

import piece.King;
import piece.Piece;

public class KingCreator implements PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new King(x, y, color);
    }
}
  