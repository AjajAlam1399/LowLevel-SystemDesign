package modle;

public class Board {
    public int size;
    public PlayingPice [][]board;

    public Board(int size) {
        this.size = size;
        board=new PlayingPice[size][size];
    }
    public  void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].piceType.name()+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("|");
        }
        System.out.println();
    }
}
