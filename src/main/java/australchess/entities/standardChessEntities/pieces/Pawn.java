package australchess.entities.standardChessEntities.pieces;

import australchess.entities.Board;
import australchess.entities.Move;
import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;
import australchess.enums.PieceType;
import australchess.enums.Team;

import java.util.Optional;

public class Pawn  extends Piece {

    private boolean isFirstMove;

    public Pawn(Team team) {
        super(PieceType.PAWN, team, 1);
        this.isFirstMove = true;
    }

    public Pawn(Team team, BoardSquare boardSquare) {
        super(PieceType.PAWN, null, 1);
        setCurrentPosition(boardSquare);
    }

    @Override
    public Optional<Move> canMove(BoardSquare destination, Board board) {
        //no puede comer una pieza del mismo equipo
        if(destination.getPiece().getTeam() == (getTeam())) ;

        //no es el primer movimiento
        int xDifference = destination.getX()-getCurrentPosition().getX();//no se puede mover para atras
        int yDifference = destination.getY()-getCurrentPosition().getY();
        if(!isFirstMove() && destination.getY()==(getCurrentPosition().getY()) && xDifference==1) return Optional.of(new Move(getCurrentPosition(), destination, this));//solo hacia adelante


        //es el primer movimiento
        if(isFirstMove==true && xDifference<=2) return Optional.of(new Move(getCurrentPosition(), destination, this));;

        //comer
        if((destination.getPiece().getTeam() != (getTeam())  && yDifference==1 && xDifference==1)) return  Optional.ofNullable(eat(destination, this, destination.getPiece()));//en diagonal hacia adelnte una posicion

        return null;
    }



    public boolean isFirstMove() {
        return isFirstMove;
    }

    public void setFirstMove(boolean firstMove) {
        isFirstMove = firstMove;
    }
}
