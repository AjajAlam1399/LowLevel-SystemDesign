package modle;

public class Player {
    public String name;
    public PlayingPice pice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPice(PlayingPice pice) {
        this.pice = pice;
    }

    public Player(String name, PlayingPice pice) {
        this.name = name;
        this.pice = pice;
    }

    public PlayingPice getPice() {
        return pice;
    }

}
