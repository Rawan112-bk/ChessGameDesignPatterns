
package factory;

import piece.Bishop;
import piece.Piece;

public class BishopCreator implements PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new Bishop(x, y, color);
    }
}
  