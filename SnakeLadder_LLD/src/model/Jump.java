package model;

public class Jump {
    int start;
    int end;
    JumpType jumpType;

    public JumpType getJumpType() {
        return jumpType;
    }

    public Jump(JumpType jumpType) {
        this.jumpType = jumpType;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
