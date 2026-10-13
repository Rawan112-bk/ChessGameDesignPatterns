
package factory;

import piece.Piece;

public interface PieceCreator {
    Piece createPiece(int x, int y, String color);
}