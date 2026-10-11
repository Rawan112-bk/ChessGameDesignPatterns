
package factory;

import piece.Piece;

public abstract class PieceCreator {

    public abstract Piece createPiece(int x, int y, String color);
}