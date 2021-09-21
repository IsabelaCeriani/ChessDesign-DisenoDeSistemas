package australchess.entities;

import australchess.entities.standardChessEntities.Piece;
import australchess.enums.Team;

import java.util.List;

public class Player {

    private String name;
    private String colorTeam;
    private Team team;
    private List<Piece> piecesEaten;

    public String getName() {
        return name;
    }

    public String getColorTeam() {
        return colorTeam;
    }

    public Team getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColorTeam(String colorTeam) {
        this.colorTeam = colorTeam;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void eatPiece(Piece piece){
        piecesEaten.add(piece);
    }
}
