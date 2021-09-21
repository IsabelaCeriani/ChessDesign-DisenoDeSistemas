package australchess.entities;

import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;

//mientras que las piezas validan solo las reglas propias a sus propios moviemientos, esta clase valida sus movimientos dentro del juego
//Ej: que no haya otra pieza, que nadie se coma al rey
public interface MoveTracker {

    boolean canMovePiece(Piece piece, BoardSquare destination);
    void movePiece(Player player, Piece piece, BoardSquare destination);

    boolean isCheck(Move move);

    void makeCheck(Move move);



}
