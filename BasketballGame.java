import java.util.*;

// 2D array, 3 inputs, team-player-score, display result of game, loop while not game over
public class BasketballGame{

    public static void main(String[] args){
    // Driver Code



    }

    private static void playerDeterminance(){
        Scanner in = new Scanner(System.in);
        int team = 0, player = 0;
        int playerscore[][] = new int[2][12];

        System.out.println("Enter team 1 name: ");
        String team1 = in.nextLine();
        System.out.println("Enter team 2 name: ");
        String team2 = in.nextLine();
        System.out.println(team1 + " V.S " + team2);

    }


    private int teamScores(){

    }


    private int gameTimer(int gameTime){
        return gameTime --;
    }

    private String playerScoreboard(String [][] playerscore){

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 12; j++){
                return playerscore[i][j] + " ";
            }
        }

    }

}