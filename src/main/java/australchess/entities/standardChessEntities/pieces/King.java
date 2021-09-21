package australchess.entities.standardChessEntities.pieces;

import australchess.entities.Board;
import australchess.entities.Move;
import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;
import australchess.enums.PieceType;
import australchess.enums.Team;

import java.util.Optional;

public class King extends Piece {
    public King(Team team) {
        super(PieceType.KING, team, 0, null);
    }

    public King(Team team, BoardSquare boardSquare) {
        super(PieceType.KING, null, 0, boardSquare);

    }

    @Override
    public Optional<Move> canMove(BoardSquare destination, Board board) {
        //no es el primer movimiento
        int xDifference = destination.getX()-getCurrentPosition().getX();//no se puede mover para atras
        int yDifference = destination.getY()-getCurrentPosition().getY();
        if(destination.getY()==(getCurrentPosition().getY()) && xDifference==1) return Optional.of(new Move(getCurrentPosition(), destination, this));//solo hacia adelante

        //comer
        if((destination.getPiece().getTeam() != (getTeam())  && yDifference==1 && xDifference==1)) return  Optional.ofNullable(eat(destination, this, destination.getPiece()));//en diagonal hacia adelnte una posicion

        return null;
    }
}
