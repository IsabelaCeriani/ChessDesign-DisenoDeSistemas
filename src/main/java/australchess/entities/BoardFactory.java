package australchess.entities;

import australchess.enums.BoardType;

public interface BoardFactory {

    Board createBoard(BoardType boardType);
}
