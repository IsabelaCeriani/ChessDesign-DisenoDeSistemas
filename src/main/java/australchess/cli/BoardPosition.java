package australchess.cli;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public  class BoardPosition {
    private final  Character pieceId;
    private final  Integer number;
    private final  Character letter;

    public BoardPosition(Character pieceId, Integer number, Character letter) {
        this.pieceId = pieceId;
        this.number = number;
        this.letter = letter;
    }

    public Character getPieceId() {
        return pieceId;
    }

    public Integer getNumber() {
        return number;
    }

    public Character getLetter() {
        return letter;
    }
}
