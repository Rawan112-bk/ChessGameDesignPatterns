
package factory;

import piece.King;
import piece.Piece;

public class KingCreator extends PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new King(x, y, color);
    }
}
  