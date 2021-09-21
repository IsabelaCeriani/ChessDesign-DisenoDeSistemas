package australchess.entities.standardChessEntities;

import australchess.entities.Board;
import australchess.entities.BoardFactory;
import australchess.entities.standardChessEntities.pieces.*;
import australchess.enums.BoardType;
import australchess.enums.Team;

import java.util.Queue;

public class StandardBoard extends Board  {

    public StandardBoard() {
        super(8, 8);
        Rook leftWhiteRook = new Rook(Team.WHITE, getSquare(0,0));
        Knight leftWhiteKnight = new Knight(Team.WHITE, getSquare(0,1));
        Bishop leftWhiteBishop = new Bishop(Team.WHITE, getSquare(0,2));
        King Whiteking = new King(Team.WHITE, getSquare(0,3));


        Rook rightWhiteRook = new Rook(Team.WHITE, getSquare(0,7));
        Knight rightWhiteKnight = new Knight(Team.WHITE, getSquare(0,6));
        Bishop rightWhiteBishop = new Bishop(Team.WHITE, getSquare(0,5));
        Queen Whitequeen = new Queen(Team.WHITE, getSquare(0,4));

        for (int i = 0; i < 8; i++) {
            new Pawn(Team.WHITE, getSquare(1, i));
            new Pawn(Team.BLACK, getSquare(6, i));
        }

        Rook leftBlackRook = new Rook(Team.BLACK, getSquare(7,0));
        Knight leftBlackKnight = new Knight(Team.BLACK, getSquare(7,1));
        Bishop leftBlackBishop = new Bishop(Team.BLACK, getSquare(7,2));
        King Blackking = new King(Team.WHITE, getSquare(7,3));


        Rook rightBlackRook = new Rook(Team.BLACK, getSquare(7,7));
        Knight rightBlackKnight = new Knight(Team.BLACK, getSquare(7,6));
        Bishop rightBlackBishop = new Bishop(Team.BLACK, getSquare(7,5));
        Queen Blackqueen = new Queen(Team.BLACK, getSquare(7,4));


    }


}



