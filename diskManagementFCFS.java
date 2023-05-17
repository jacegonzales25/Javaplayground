// Importing necessary utilities

import java.util.Scanner;
import java.util.Arrays;

public class diskManagementFCFS{

    public static void main(String[] args){



    }

    static int[] getUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("The system has a total disk of 200 head");
        System.out.println("Enter number of requests: ");
        
        int requests_num = userInput.nextInt();
        int[] requests_array = new int[requests_num + 1];

        if (requests_num < 0 || requests_num > 199){
            System.out.println("Error! Input any integer greater than 0");
            getUserInput();
        }

        System.out.println("Enter starting point: ");
        int starting_num = userInput.nextInt();  

        return requests_array;

    }



}