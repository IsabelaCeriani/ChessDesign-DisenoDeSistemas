package australchess.entities;

import australchess.entities.standardChessEntities.Piece;
import australchess.enums.Status;

import java.util.*;

public class Game {

    private MoveTracker moveTracker;
    private List<Player> players;
    private Player currentTurn;
    private Board board;
    private Status status;
    private List<Move> gameMoves;
//    Queue<Player> turns;

    public Game(List<Player> players, Board board, Player firstTurn) {
        this.players = players;
        this.board = board;
        status= Status.NOT_STARTED;
        this.currentTurn=firstTurn;
        this.gameMoves = new ArrayList<>();
//        this.turns= new PriorityQueue<>();
//        for (Player player: players){
//            turns.add(player);
//        }
//        this.currentTurn = turns.peek();
    }

    public MoveTracker getMoveTracker() {
        return moveTracker;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getCurrentTurn() {
        return currentTurn;
    }

    public Board getBoard() {
        return board;
    }

    public void setMoveTracker(MoveTracker moveTracker) {
        this.moveTracker = moveTracker;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setCurrentTurn(Player currentTurn) {
        this.currentTurn = currentTurn;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public List<Move> getGameMoves() {
        return gameMoves;
    }

    public void start(){
        this.status=Status.ONGOING;
    }
    public void finish(){
        this.status= Status.FINISHED;
    }

//    public void nextTurn() {
//       if(!turns.isEmpty()) currentTurn=turns.peek();
//        for (Player player: players){
//            turns.add(player);
//        }
//    }
}

