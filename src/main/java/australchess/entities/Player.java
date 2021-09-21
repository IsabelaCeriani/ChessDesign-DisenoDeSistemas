package australchess.entities;

import australchess.entities.standardChessEntities.Piece;
import australchess.enums.Team;

import java.util.List;

public class Player {

    private String name;
    private Team team;
//    private List<Piece> piecesEaten;


    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }



    public Team getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setTeam(Team team) {
        this.team = team;
    }


}
