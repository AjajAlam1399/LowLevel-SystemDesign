import modle.Board;
import modle.Player;
import modle.PlayingPiceO;
import modle.PlayingPiceX;

import java.util.Deque;
import java.util.LinkedList;

public class TicTocGame {
    public Deque<Player>players;
    public Board board;
    TicTocGame(){
        initializeGame();
    }
    private void initializeGame(){
        players=new LinkedList<>();
        Player p1=new Player("player1",new PlayingPiceX());
        Player p2=new Player("Player2",new PlayingPiceO());
        players.add(p1);
        players.add(p2);
        board=new Board(3);
    }
    public String play(){
        boolean flag=true;
       while (flag){
           board.printBoard();
           Player player=players.getFirst();
       }
        return "Tie";
    }
}
