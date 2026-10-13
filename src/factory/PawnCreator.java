
package factory;

import piece.Pawn;
import piece.Piece;

public class PawnCreator implements PieceCreator {
    @Override
    public Piece createPiece(int x, int y, String color) {
        return new Pawn(x, y, color);
    }
}
  