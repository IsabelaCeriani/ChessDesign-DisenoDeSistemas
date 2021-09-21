package australchess.cli;

import australchess.entities.Board;
import australchess.entities.Game;
import australchess.entities.MoveTracker;
import australchess.entities.Player;
import australchess.entities.standardChessEntities.StandardBoard;
import australchess.entities.standardChessEntities.StandardMoveTracker;
import australchess.enums.Team;
import com.github.lalyos.jfiglet.FigletFont;
import jdk.jshell.spi.SPIResolutionException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Starter CLI interface for the chess game, modify as you wish.
// TODO: Fill in!
public class App {
    public static void main(String[] args) throws IOException {
        final BoardPrinter boardPrinter = new DefaultBoardPrinter();

        printHeader();
        final String firstPlayerId = askForString("Name of player that moves white: ");
        final String secondPlayerId = askForString("Name of player that moves black: ");
        final Player player1 = new Player(firstPlayerId, Team.WHITE);
        final Player player2 = new Player(secondPlayerId, Team.BLACK);

        final List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        final Board board = new StandardBoard();
        final Game game = new Game(players, board, player1);
        final MoveTracker moveTracker = new StandardMoveTracker(game);

        System.out.println();
        System.out.println();

        while(shouldContinue()) {
            printCurrentPlayerTurn();
            System.out.println();
            printBoard(boardPrinter);
            final ParsedPosition positionFrom = askForPosition("Enter position of the piece you want to move");
            final ParsedPosition positionTo = askForPosition("Enter position of cell you want to move it to");
            moveTracker.movePiece(game.getCurrentTurn(), game.getBoard().getSquare(positionFrom.getX(), positionFrom.getY()).getPiece(), game.getBoard().getSquare(positionTo.getX(), positionTo.getY()));
            System.out.println();
            System.out.println();
        }
    }

    private static void printBoard(BoardPrinter boardPrinter) {
        // TODO: provide the board somehow.
        List<BoardPosition> positions = new DefaultSomethingClass().getPiecePositions();
        String boardAsString = boardPrinter.print(positions);
        System.out.println(boardAsString);
    }



    private static String playerToMove() {
        return "Someone"; //TODO Implement!
    }

    private static boolean shouldContinue() {
        return true; //TODO Implement!
    }

    private static ParsedPosition askForPosition(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x value");
        int x = scanner.nextInt();
        System.out.println("Enter y value");
        int y = scanner.nextInt();
        return new ParsedPosition(x, y);

    }

    private static void printCurrentPlayerTurn() {
        System.out.println("It's " + playerToMove() + " turn!");
    }

    private static String askForString(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printHeader() throws IOException {
        String header = FigletFont.convertOneLine("AustralChess");
        System.out.println(header);
    }


}

