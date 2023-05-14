import java.util.Scanner;
public class RockPaperScissors{

    Scanner scan = new Scanner(System.in);
    

    public static void main(String[] args){

        System.out.println("Welcome to Rock, Paper, Scissors!");




    }

    public boolean isequalmove() {



        return true;
    }

    public String getPlayer1move(){
        String player1move = scan.nextLine();
        return player1move;
    }

    public String getPlayer2move(){
        String player2move = scan.nextLine();
        return player2move;
    }



}