package australchess.entities;

import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;

public class Move {

    private Player player;
    private BoardSquare initialPosition;
    private BoardSquare finalPositon;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean wasCheck;




    public Move(BoardSquare initialPosition, BoardSquare finalPositon, Piece pieceMoved, Piece pieceKilled) {
        this.initialPosition = initialPosition;
        this.finalPositon = finalPositon;
        this.pieceMoved = pieceMoved;
        this.pieceKilled = pieceKilled;
        finalPositon.setHasPiece(true);
    }
    public Move(BoardSquare initialPosition, BoardSquare finalPositon, Piece pieceMoved) {
       this.initialPosition=initialPosition;
       this.finalPositon = finalPositon;
       this.pieceMoved = pieceMoved;
        finalPositon.setHasPiece(true);
    }

    public Player getPlayer() {
        return player;
    }

    public BoardSquare getInitialPosition() {
        return initialPosition;
    }

    public BoardSquare getFinalPositon() {
        return finalPositon;
    }

    public Piece getPieceMoved() {
        return pieceMoved;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setInitialPosition(BoardSquare initialPosition) {
        this.initialPosition = initialPosition;
    }

    public void setFinalPositon(BoardSquare finalPositon) {
        this.finalPositon = finalPositon;
    }

    public void setPieceMoved(Piece pieceMoved) {
        this.pieceMoved = pieceMoved;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }

    public boolean isWasCheck() {
        return wasCheck;
    }

    public void setWasCheck(boolean wasCheck) {
        this.wasCheck = wasCheck;
    }
}
