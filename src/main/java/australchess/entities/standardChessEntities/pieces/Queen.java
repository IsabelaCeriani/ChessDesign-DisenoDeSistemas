package australchess.entities.standardChessEntities.pieces;

import australchess.entities.Board;
import australchess.entities.Move;
import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;
import australchess.enums.PieceType;
import australchess.enums.Team;

import java.util.Optional;

public class Queen extends Piece {
    public Queen(Team team) {
        super(PieceType.QUEEN, team, 9, null);
    }
    public Queen(Team team, BoardSquare boardSquare) {
        super(PieceType.QUEEN, team, 9, boardSquare);

    }

    @Override
    public Optional<Move> canMove(BoardSquare destination, Board board) {
        for (BoardSquare boardSquare :board.getColumn(getCurrentPosition().getY())){
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()==this.getTeam()) System.out.println("Cant go over a member of the team");
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()!=this.getTeam()) return Optional.ofNullable(eat(destination, this, boardSquare.getPiece()));

        }

        for (BoardSquare boardSquare : board.getRow(getCurrentPosition().getX())){
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()==this.getTeam()) System.out.println("Cant go over a member of the team");
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()!=this.getTeam()) return Optional.ofNullable(eat(destination, this, boardSquare.getPiece()));

        }
        for (BoardSquare boardSquare :board.getDiagonal(getCurrentPosition().getX(), getCurrentPosition().getY())){
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()==this.getTeam()) System.out.println("Can't go over a member of the team");;
            if(boardSquare.hasPiece() && boardSquare.getPiece().getTeam()!=this.getTeam()) return Optional.ofNullable(eat(destination, this, boardSquare.getPiece()));
            if(boardSquare.equals(destination)) return Optional.of(new Move(getCurrentPosition(), destination, this));
        }


        if(destination.getX()==getCurrentPosition().getX() || destination.getY()==getCurrentPosition().getY()) return Optional.of(new Move(getCurrentPosition(), destination, this));
        return null;
    }
}
