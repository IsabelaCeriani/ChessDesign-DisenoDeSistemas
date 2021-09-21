package australchess.entities.standardChessEntities;


public class BoardSquare {

     private int x;
     private int y;
     private String color;
     private Piece piece;
     private Boolean hasPiece;
     private Character yPosition;

    public BoardSquare(int x, int y) {
        this.x = x;
        this.y = y;
        this.hasPiece = false;
    }

    public BoardSquare(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.hasPiece = false;
        this.piece = piece;
    }

    public Boolean hasPiece() {
        return this.piece==null;
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
