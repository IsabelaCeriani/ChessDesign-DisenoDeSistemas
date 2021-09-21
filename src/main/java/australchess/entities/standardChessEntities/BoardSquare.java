package australchess.entities.standardChessEntities;


public class BoardSquare {

     private int x;
     private int y;
     private String color;
     private Piece piece;
     private Boolean hasPiece;


    public Boolean hasPiece() {
        return hasPiece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasPiece(Boolean hasPiece) {
        this.hasPiece = hasPiece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
