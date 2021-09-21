package australchess.cli;

import australchess.entities.Board;
import australchess.entities.Game;
import australchess.entities.MoveTracker;
import australchess.entities.Player;
import australchess.entities.standardChessEntities.Piece;
import australchess.entities.standardChessEntities.StandardBoard;
import australchess.entities.standardChessEntities.StandardMoveTracker;
import australchess.enums.Team;
import lombok.var;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PieceMovementTester {

    final Player player1 = new Player("1", Team.WHITE);
    final Player player2 = new Player("2", Team.BLACK);

    List<Player> players = new ArrayList<>();

    final Board board = new StandardBoard();
    final Game game = new Game(players, board, player1);
    final MoveTracker moveTracker = new StandardMoveTracker(game);


    @Test
    public void movePawnOnePositionShouldSucceed(){
        Piece pawn = game.getBoard().getSquare(1, 0).getPiece();
        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(1);
        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);
        moveTracker.movePiece(game.getCurrentTurn(), pawn, game.getBoard().getSquare(2, 0));
        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(2);
        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);

    }


    @Test
    public void movePawnThreePositionsShouldFail(){
//        Piece pawn = game.getBoard().getSquare(1, 0).getPiece();
//        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(1);
//        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);
//
//
//        Exception exception = assertThrows(RuntimeException.class, () -> moveTracker.movePiece(game.getCurrentTurn(), pawn, game.getBoard().getSquare(4, 0)));
//
//        assertThat(exception.getMessage()).contains("Cannot move there");

    }

    @Test
    public void movePawnTwoPoisitionsOnFirstMovePositionShouldSucced(){
        Piece pawn = game.getBoard().getSquare(1, 0).getPiece();
        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(1);
        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);
        moveTracker.movePiece(game.getCurrentTurn(), pawn, game.getBoard().getSquare(3, 0));
        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(3);
        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);

    }

    @Test
    public void movePawnTwoPositionsOnSecondtMovePositionShouldFail(){
        Piece pawn = game.getBoard().getSquare(1, 0).getPiece();
        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(1);
        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);
        moveTracker.movePiece(game.getCurrentTurn(), pawn, game.getBoard().getSquare(3, 0));
        assertThat(pawn.getCurrentPosition().getX()).isEqualTo(3);
        assertThat(pawn.getCurrentPosition().getY()).isEqualTo(0);

//        Exception exception = assertThrows(RuntimeException.class, () -> moveTracker.movePiece(game.getCurrentTurn(), pawn, game.getBoard().getSquare(5, 0)));

    }

    @Test
    public void movePawnToOccupiedCellShouldFail(){

    }

}
