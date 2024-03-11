package model;

public class Cell {
    Jump jump;
    Cell(Jump jump){
        this.jump=jump;
    }

    public Jump getJump() {
        return jump;
    }
}
