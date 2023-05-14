import java.util.Scanner;
public class RockPaperScissors{

    Scanner scan = new Scanner(System.in);
    

    public static void main(String[] args){

        RockPaperScissors RPSgame = new RockPaperScissors();
        RPSgame.game();

    }

    public void game(){
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        // Game going once
        String player1Move = getPlayer1move();
        String player2Move = getPlayer2move();
        boolean isequal = isequalmove(player1Move, player2Move);
        if(isequal){
            System.out.println("It's a tie!");
            game();
        }
        String playerWinner = winner(player1Move, player2Move);
        System.out.println(playerWinner + " wins!");
        boolean playAgain = playAgain();
        if (playAgain){
            game();
        }
        System.exit(0);


        // Best of three
        // Best of five

    }

    public String getPlayer1move(){
        System.out.println("Player 1 enter your choice: R/P/S");
        System.out.println("Enter Player 1 move: ");
        String player1move = scan.nextLine();
        if(!player1move.equals("R") && !player1move.equals("P") && !player1move.equals("S")){
            System.out.println("Enter valid move!");
            getPlayer1move();
        }
        return player1move.toUpperCase();
    }

    public String getPlayer2move(){
        System.out.println("Player 2 enter your choice: R/P/S");
        System.out.println("Enter Player 2 move: ");
        String player2move = scan.nextLine();
        if(!player2move.equals("R") && !player2move.equals("P") && !player2move.equals("S")){
            System.out.println("Enter valid move!");
            getPlayer2move();
        }
        return player2move.toUpperCase();
    }

    public String winner(String player1move, String player2move){
        String player1 = "Player1", player2 = "Player2";

        if (player1move.equals("R") && player2move.equals("P")) {
            System.out.println("Player 1 chooses Rock");
            System.out.println("Player 2 chooses Paper");
            System.out.println("Paper wraps Rock into submission!");
            System.out.println("Player 2 wins this round");
            return player2;
        }
        else if (player1move.equals("P") && player2move.equals("R")) {
            System.out.println("Player 1 chooses Paper");
            System.out.println("Player 2 chooses Rock");
            System.out.println("Paper wraps Rock into submission!");
            System.out.println("Player 1 wins this round");
            return player1;
        }
        else if (player1move.equals("R") && player2move.equals("S")) {
            System.out.println("Player 1 chooses Rock");
            System.out.println("Player 2 chooses Scissors");
            System.out.println("Rock bends Scissors!");
            System.out.println("Player 1 wins this round");
            return player1;
        }
        else if (player1move.equals("P") && player2move.equals("S")) {
            System.out.println("Player 1 chooses Paper");
            System.out.println("Player 2 chooses Scissors");
            System.out.println("Scissors slashes Paper!");
            System.out.println("Player 2 wins this round");
            return player2;
        }
        else if (player1move.equals("S") && player2move.equals("R")) {
            System.out.println("Player 1 chooses Scissors");
            System.out.println("Player 2 chooses Rock");
            System.out.println("Rock bends Scissors!");
            System.out.println("Player 2 wins this round");
            return player2;
        }
        else if (player1move.equals("S") && player2move.equals("P")) {
            System.out.println("Player 1 chooses Scissors");
            System.out.println("Player 2 chooses Paper");
            System.out.println("Scissors slashes Paper!");
            System.out.println("Player 1 wins this round");
            return player1;
        }

        return "Edge case";
    }

    public boolean isequalmove(String player1move, String player2move) {
        if (player1move.equals(player2move)){
            return true;
        }

        return false;
    }

    public boolean playAgain(){
        System.out.println("Would you like to play again? Y/N: ");
        String answer = scan.nextLine();
        if (answer.toUpperCase().equals("Y")){
            return true;
        }
        return false;
    }

}