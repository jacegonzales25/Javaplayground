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

        if (starting_num < 0 || starting_num > 199){
            System.out.println("Error! Starting point must be between 0 - 199");
            getUserInput();
        }else{
            requests_array[0] = starting_num;
        }

        // i = 1 since i = 0 has starting_num
        for (int i = 1; i < requests_num + 1; i++){
            System.out.println("Enter request: " + i);
            requests_array[i] = userInput.nextInt();
        }

        System.out.println(Arrays.toString(requests_array));

        userInput.close();

        return requests_array;

    }

    static int getTotalMoment(int[] request_array ){
        int summation = 0;
        for(int i = 1; i < request_array.length; i++){
            summation += Math.abs(request_array[i-1] - request_array[i]);
        }
        return summation;
    }



}