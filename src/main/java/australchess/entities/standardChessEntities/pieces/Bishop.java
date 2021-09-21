package australchess.entities.standardChessEntities.pieces;

import australchess.entities.Board;
import australchess.entities.Move;
import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;
import australchess.enums.PieceType;
import australchess.enums.Team;

import java.util.Optional;

public class Bishop extends Piece {


    public Bishop(Team team) {
        super(PieceType.BISHOP, team, 3);
    }

    public Bishop(Team team, BoardSquare boardSquare) {
        super(PieceType.BISHOP, null, 3);
        setCurrentPosition(boardSquare);
    }

    @Override
    public Optional<Move> canMove(BoardSquare destination, Board board) {
        for (BoardSquare boardSquare :board.getDiagonal(getCurrentPosition().getX(), getCurrentPosition().getY())){
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()==this.getTeam()) System.out.println("Can't go over a member of the team");;
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()!=this.getTeam()) return Optional.ofNullable(eat(destination, this, boardSquare.getPiece()));
            if(boardSquare.equals(destination)) return Optional.of(new Move(getCurrentPosition(), destination, this));
        }

        return null;
    }

    @Override
    public Optional<Move> move(BoardSquare destination, Board board) {
        if (canMove(destination, board).isPresent()) setCurrentPosition(destination);
        return canMove(destination, board);
    }
}
