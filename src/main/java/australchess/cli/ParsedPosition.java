package australchess.cli;

import lombok.Data;
import lombok.Getter;

public  class ParsedPosition {

    private final  Integer number;
    private final  Character letter;

    public ParsedPosition(int parseInt, char charAt, Integer number, Character letter) {
        this.number = number;
        this.letter = letter;
    }

    public Integer getNumber() {
        return number;
    }

    public Character getLetter() {
        return letter;
    }


}
