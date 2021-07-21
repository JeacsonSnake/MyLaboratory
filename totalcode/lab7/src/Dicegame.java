import java.util.*;

public class Dicegame {
    public static void main(String[] args) {
        System.out.println("*********DiceGame**********");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the side of the dice:");
        int side = sc.nextInt();
        System.out.println("Please enter the number of the player:");
        int p = sc.nextInt();
        Player[] play = new Player[p];
        System.out.println("Please enter the neme for each person devided by space:");
        for (int i=0;i<p;i++)
        {
            String player = sc.next();
            play[i] = new Player(side, player);
        }
        System.out.println("Please enter the score value required for the player to win:");
        int winscore = sc.nextInt();
        System.out.println("Game start!");
        int round = 0;
        Random num = new Random();
        int y = -1;
        while (round<=winscore&&!ifscore(p,play,winscore))
        {
            round++;
            System.out.println();
            System.out.println("*-------------------------*");
            System.out.println("Round "+round);
            System.out.println("*-------------------------*");
            System.out.println();
            for (int j = 0;j<p;j++)
            {

                int o = num.nextInt(play[j].getSide())+1;
                System.out.println("player "+play[j].getPlayer()+" rolled side: "+o);
                System.out.println();
                play[j].setScores(o);
                System.out.println("player "+play[j].getPlayer()+" Scores now: "+play[j].getScores());
                System.out.println();
                if (ifscore(p,play[j],winscore))
                {
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("Here comes the winner!");
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println();
                    y = j;
                    break;
                }
            }
            if(y!=-1)
            {
                break;
            }
            
        }
        System.out.println("The winner is :"+play[y].getPlayer());
        System.out.println();
        System.out.println("The final score is :"+play[y].getScores());
        System.out.println();
        System.out.println("-----game end-----");
        System.out.println("Show details?(y/n)");
        System.out.println();
        String d = sc.next();
        if (d.equals("y"))
        {
            System.out.println("---Results list(rank by name input order)---");
            for (int i = 0;i<p;i++)
            {
                play[i].showdetail();
            }
            System.out.println("--------------------------------------------");

            System.out.println("Total Rounds : "+round);
            sc.close();
            System.out.println("*********DiceGame**********");

        }
        else
        {
            System.out.println("*********DiceGame**********");
            sc.close();
            System.exit(0);
        }
    }

    private static boolean ifscore(int p,Player play,int winscore) {
        boolean scorejudge = false;
        if(play.getScores()>=winscore)
            {
                scorejudge = true;
            }

        return scorejudge;
    }

    private static boolean ifscore(int p,Player[] play,int winscore) {
        boolean scorejudge = false;
        for (int j= 0 ; j < p ;j++)
        {
            if(play[j].getScores()>=winscore)
            {
                scorejudge = true;
            }

        }
        return scorejudge;
    }
}


class Dice {
    protected int side;

    public Dice() {
    }

    public Dice(int side) {
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
}

class Player extends Dice{
    protected String player;
    protected int lastscores;
    protected int scores=0;
    public Player() {
        
    }

    public Player(int side, String player) {
        super(side);
        this.player = player;
        scores = 0;
    }
    public String getPlayer() {
        return player;
    }
    public int getScores() {
        return scores;
    }
    public int getLastscores() {
        return lastscores;
    }
    public void setScores(int lastscores) {
        this.scores += lastscores;
    }
    public void showdetail(){
        System.out.println("****************");
        System.out.println("Player name : "+getPlayer());
        System.out.println("Scores : "+getScores());
    }
}