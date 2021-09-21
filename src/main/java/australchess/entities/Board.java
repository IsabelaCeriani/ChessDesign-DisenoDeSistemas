package australchess.entities;

import australchess.entities.standardChessEntities.BoardSquare;
import australchess.enums.BoardType;

public class Board {

    private BoardSquare[][] squares;
    private BoardType boardType;

    public Board(int width, int height) {
        this.squares = new BoardSquare[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                getSquares()[i][j]= new BoardSquare(i, j);
            }
        }
        this.boardType = boardType;
    }


    public BoardSquare[][] getSquares() {
        return squares;
    }

    public void setSquares(BoardSquare[][] squares) {
        this.squares = squares;
    }


    public BoardSquare[] getRow(int x){
        return squares[x];
    }

    public BoardSquare[] getColumn(int y){
        BoardSquare[] column = new BoardSquare[squares[0].length];
        for (int i = 0; i <column.length; i++) {
            column[i] = squares[i][y];
        }
        return column;
    }

    public BoardSquare[] getDiagonal(int x, int y){
        BoardSquare[] diagonal = new BoardSquare[Math.max(squares.length, squares[0].length)];

        return diagonal;
    }

    public BoardSquare getSquare(int x, int y){
        return squares[x][y];
    }



}