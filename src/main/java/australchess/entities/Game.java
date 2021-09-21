package australchess.entities;

import australchess.enums.Status;

import java.util.List;

public class Game {

    private MoveTracker moveTracker;
    private List<Player> players;
    private Player currentTurn;
    private Board board;
    private Status status;

    public Game(List<Player> players, Board board, MoveTracker moveTracker, Player currentTurn) {
        this.players = players;
        this.currentTurn = currentTurn;
        this.board = board;
        status= Status.NOT_STARTED;
        this.moveTracker = moveTracker;
        this.currentTurn=currentTurn;
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
}
