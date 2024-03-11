package model;

import java.util.concurrent.ThreadLocalRandom;
public class Board {
   private Cell[][] board;
    private int size;


    public int getSize() {
        return size;
    }

    public Board(int size){
        this.size=size;
        board=new Cell[size][size];
    }
    public Cell getCell(int i,int j){
        return board[i][j];
    }
    public void addSnake(int noOfSnake){
        while(noOfSnake>0){
            int start= ThreadLocalRandom.current().nextInt(1,size*size);
            int end= ThreadLocalRandom.current().nextInt(1,size*size);
            if(end>start){
                continue;
            }
            int row,col;
            if(start%2==0){
                row=size-1-(start/size);
                col=start%size;
            }
            else{
                row=size-1-(start/size);
                col=(size-1)-(start%size);
            }
            Jump snake=new Snake();
            snake.setStart(start);
            snake.setEnd(end);
            Cell cell=new Cell(snake);
            board[row][col]=cell;
            noOfSnake--;
        }
    }
    public void addLadder(int noOfLadder){
        while(noOfLadder>0){
            int start= ThreadLocalRandom.current().nextInt(1,size*size);
            int end= ThreadLocalRandom.current().nextInt(1,size*size);
            if(start>end){
                continue;
            }
            int row,col;
            if(end%2==0){
                row=size-1-(start/size);
                col=start%size;
            }
            else{
                row=size-1-(start/size);
                col=(size-1)-(start%size);
            }
            Jump ladder=new Ladder();
            ladder.setStart(start);
            ladder.setEnd(end);
            Cell cell=new Cell(ladder);
            board[row][col]=cell;
            noOfLadder--;
        }
    }
    public int computeNewPositon(int prevPositon){
        if(prevPositon>=size*size){
            return prevPositon;
        }
        int row,col;
        if(prevPositon%2==0){
            row=size-1-(prevPositon/size);
            col=prevPositon%size;
        }
        else{
            row=size-1-(prevPositon/size);
            col=(size-1)-(prevPositon%size);
        }
        if(board[row][col]!=null){
            Cell cell=board[row][col];
            System.out.println("Player take :"+cell.getJump().jumpType.name());
            prevPositon=cell.getJump().getEnd();
        }
        return prevPositon;
    }
}
