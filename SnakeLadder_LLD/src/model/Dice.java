package model;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCnt;
    int max=6;
    int min=1;
    public Dice(int diceCnt){
        this.diceCnt=diceCnt;
    }
   public int rollDice(){
        int totalDiceSum=0;
        for(int i=0;i<diceCnt;i++){
            int random= ThreadLocalRandom.current().nextInt(max-min);
            totalDiceSum+=random;
        }
        return  totalDiceSum;
    }
}
