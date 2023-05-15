import java.util.Scanner;
public class PasswordValidity{






    private static boolean isValid(String password){

        return true;

    }

    private String getPassword(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. First Character should be a letter. \n" +
						   "2. Minimum of 8 characters and maximum of 16 characters. \n" +
						   "3. No special characters except '_'. \n" +
						   "4. No spaces");
		System.out.print("Input a password: ");
        String password = in.nextLine();

        in.close();
        return password;
    }


    public static void main(String[] args){


        PasswordValidity pv = new PasswordValidity();
        String password = pv.getPassword();
        isValid(password);


    }


}