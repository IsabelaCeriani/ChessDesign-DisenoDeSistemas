package australchess.entities.standardChessEntities;

import australchess.entities.Game;
import australchess.entities.Move;
import australchess.entities.MoveTracker;
import australchess.entities.Player;
import australchess.enums.PieceType;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StandardMoveTracker implements MoveTracker {


    private Game game;

    public StandardMoveTracker(Game game) {
        this.game = game;
        game.setMoveTracker(this);
    }

    @Override
    public boolean canMovePiece(Piece piece, BoardSquare destination){
        if(!(destination.getPiece()==null) && piece.getTeam()==destination.getPiece().getTeam()) return false;
        return true;

    }
    @Override
    public void movePiece(Player player, Piece piece, BoardSquare destination){
        Optional<Move> move = piece.move(destination, game.getBoard());
//        if(move==null) throw new RuntimeException("Cannot move there");
        if(!move.isPresent()) throw new RuntimeException("Cannot move there");

        if (isCheck(move.get())) makeCheck(move.get());
        if(!canMovePiece(piece, destination)) throw new IllegalArgumentException("Cannot move there");
        if(!(destination.getPiece()==null) && piece.getTeam()!=piece.getTeam()) piece.eat(destination, piece, move.get().getPieceKilled());

        (game).getGameMoves().add(move.get());
//        game.nextTurn();
    }

//    @Override
//    public boolean isCheck(Piece piece, BoardSquare destination) {
//        if(destination.getPiece().getPieceType() == PieceType.KING) return true;
//        return false;
//    }

    @Override
    public boolean isCheck(Move move) {
        if(!(move.getPieceKilled()==null) && move.getPieceKilled().getPieceType() == PieceType.KING) return true;
        return false;
    }

    @Override
    public void makeCheck(Move move) {
            move.setWasCheck(true);
            game.getGameMoves().add(move);
//            game.nextTurn();
    }

    public void setGame(Game game) {
        this.game = game;
    }


    //    @Override
//    public void eatPiece(Player player, Piece piece, BoardSquare destination) {
//        Move move = new Move(player, piece.getCurrentPosition(), destination, piece, destination.getPiece());
//        piece.move(destination, game.getBoard());
//        player.eatPiece(piece);
//        gameMoves.add(move);
//    }


}
