package australchess.entities.standardChessEntities;

import australchess.entities.Board;
import australchess.entities.Move;
import australchess.entities.Player;
import australchess.entities.standardChessEntities.BoardSquare;
import australchess.enums.PieceType;
import australchess.enums.Team;

import java.util.Optional;

public abstract class Piece {

        private PieceType pieceType;
        private Team team;
        private BoardSquare currentPosition;
        private int points;

        public abstract Optional<Move> canMove(BoardSquare destination, Board board);//solo verifica los movimiento propios de la pieza, no se fija si hay lugar en el tablero, si hay otra pieza, etc

    public Optional<Move> move(BoardSquare destination, Board board) {
        if (canMove(destination, board).isPresent()) setCurrentPosition(destination);
        return canMove(destination, board);
    }


    public Piece(PieceType pieceType, Team team, int points, BoardSquare currentPosition) {
        this.pieceType = pieceType;
        this.team = team;
        this.points = points;
        this.currentPosition = currentPosition;
        currentPosition.setPiece(this);
        currentPosition.setHasPiece(true);

    }




    public Piece(Team team, BoardSquare currentPosition) {
        this.team = team;
        this.currentPosition = currentPosition;
        currentPosition.setHasPiece(true);
    }
    public Piece(){

    }

    public PieceType getPieceType() {
        return pieceType;
    }


    public Team getTeam() {
        return team;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(BoardSquare currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Move eat(BoardSquare finalPositon, Piece pieceMoved, Piece pieceKilled){
            return new Move(getCurrentPosition(), finalPositon, pieceMoved, pieceKilled);
    }



}
