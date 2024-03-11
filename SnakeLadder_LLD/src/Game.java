import model.Board;
import model.Dice;
import model.JumpType;
import model.Users;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    private Board board;
    private Deque<Users>users;
    private Dice dice;

    Game(){
        initalize();
    }
    public void start(){
        boolean isWinner=false;
        PrintBoard();
        while(!isWinner){
            Users player=users.pollFirst();
            assert player != null;
            System.out.println("Position of Player :"+player.getId()+" before rolling the dice is:"+player.getCurrentPosition());
            int currentPositon= player.getCurrentPosition();
            player.setCurrentPosition(currentPositon+dice.rollDice());
            currentPositon=player.getCurrentPosition();
            currentPositon=board.computeNewPositon(currentPositon);
            System.out.println("Position of Player :"+player.getId()+" After rolling the dice is:"+currentPositon);
            if(currentPositon>=board.getSize()*board.getSize()){
                System.out.println("Winner is : "+player.getId());
                isWinner=true;
                break;
            }
            player.setCurrentPosition(currentPositon);
            users.addLast(player);

        }
    }
    private void initalize(){
        board=new Board(10);
        board.addLadder(5);
        board.addSnake(5);
        users=new ArrayDeque<>();
        Users users1=new Users(1);
        Users users2=new Users(2);
        Users users3=new Users(3);
        Users users4=new Users(4);
        users.addLast(users1);
        users.addLast(users2);
        users.addLast(users3);
        users.addLast(users4);
        dice=new Dice(2);

    }
    private  void PrintBoard(){
        System.out.println("Playing Board is :");
        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                if(board.getCell(i,j)==null){
                    if(i%2==0){
                        System.out.print((board.getSize()-1-i)*board.getSize()+j);
                        if(10*i+j>=90){
                            System.out.print("  |");
                        }
                        else{
                            System.out.print(" |");
                        }
                    }
                    else{
                        System.out.print((board.getSize()-1-i)*board.getSize()+(board.getSize()-1-j));
                        if(10*i+j>=90){
                            System.out.print("  |");
                        }
                        else{
                            System.out.print(" |");
                        }
                    }
                }
                else{
                    if(board.getCell(i,j).getJump().getJumpType()== JumpType.Ladder){
                        System.out.print("L  |");
                    }
                    else{
                        System.out.print("S  |");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Where L=Ladder, S=Snake");
    }
}
