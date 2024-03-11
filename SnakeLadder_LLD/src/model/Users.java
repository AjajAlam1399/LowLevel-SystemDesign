package model;

public class Users {
    int id;
    int currentPosition;
    public Users(int id){
        currentPosition=0;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
