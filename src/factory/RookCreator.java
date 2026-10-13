
package factory;

import piece.Piece;
import piece.Rook;

public class RookCreator implements PieceCreator {

    @Override
    public Piece createPiece(int x, int y, String color) {
        return new Rook(x, y, color);
    }
}