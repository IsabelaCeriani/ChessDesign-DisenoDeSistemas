package australchess.cli;

import lombok.Data;
import lombok.Getter;

public  class ParsedPosition {

    private final  Integer number;
    private final  Integer letter;

    public ParsedPosition(Integer number, Integer letter) {
        this.number = number;
        this.letter = letter;
    }



    public Integer getX() {
        return number;
    }

    public Integer getY() {
        return letter;
    }


}
