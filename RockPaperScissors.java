import java.util.Scanner;
public class RockPaperScissors{

    Scanner scan = new Scanner(System.in);
    

    public static void main(String[] args){





    }

    public void game(){
        
        System.out.println("Welcome to Rock, Paper, Scissors!");


    }

    public String getPlayer1move(){
        System.out.println("Enter Player 1 move: ");
        String player1move = scan.nextLine();
        return player1move.toUpperCase();
    }

    public String getPlayer2move(){
        System.out.println("Enter Player 2 move: ");
        String player2move = scan.nextLine();
        return player2move.toUpperCase();
    }

    public boolean isequalmove(String player1move, String player2move) {
        if (player1move.equals(player2move)){
            return true;
        }

        return false;
    }

}