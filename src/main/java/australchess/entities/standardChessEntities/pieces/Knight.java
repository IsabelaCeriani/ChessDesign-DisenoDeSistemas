package australchess.entities.standardChessEntities.pieces;

import australchess.entities.Board;
import australchess.entities.Move;
import australchess.entities.standardChessEntities.BoardSquare;
import australchess.entities.standardChessEntities.Piece;
import australchess.enums.PieceType;
import australchess.enums.Team;

import java.util.Optional;

public class Knight extends Piece {


    public Knight(Team team) {
        super(PieceType.KNIGHT, team, 3, null);
    }

    public Knight(Team team, BoardSquare boardSquare) {
        super(PieceType.KNIGHT, team, 1, boardSquare);

    }

    @Override
    public Optional<Move> canMove(BoardSquare destination, Board board) {
        //no puede comer una pieza del mismo equipo
        if(destination.getPiece().getTeam().equals(getTeam())) System.out.println("Cant go over a member of the team");;
        int x = Math.abs(getCurrentPosition().getX() - destination.getX());
        int y = Math.abs(getCurrentPosition().getY() - destination.getY());
        if (x + y == 1) return Optional.of(new Move(getCurrentPosition(), destination, this));



        return null;
    }

    @Override
    public Optional<Move> move(BoardSquare destination, Board board) {
        if (canMove(destination, board).isPresent()) setCurrentPosition(destination);
        return canMove(destination, board);
    }
}
