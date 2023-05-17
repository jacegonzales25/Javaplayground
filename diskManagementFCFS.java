// Importing necessary utilities

import java.util.Scanner;
import java.util.Arrays;

public class diskManagementFCFS{

    public static void main(String[] args){



    }

    static int[] getUserInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of requests: ");
        
        int requests_num = userInput.nextInt();
        int[] requests_array = new int[requests_num + 1];


        return requests_array;

    }



}