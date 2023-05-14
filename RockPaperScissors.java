import java.util.Scanner;
public class RockPaperScissors{

    Scanner scan = new Scanner(System.in);
    

    public static void main(String[] args){





    }

    public void game(){
        
        System.out.println("Welcome to Rock, Paper, Scissors!");


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

    public boolean isequalmove(String player1move, String player2move) {
        if (player1move.equals(player2move)){
            return true;
        }

        return false;
    }

}