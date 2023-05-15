import java.util.Scanner;
public class PasswordValidity{

    private static boolean isValid(String password){
        char firstCharacter = password.charAt(0);

        if (!((password.length() >= 8) && (password.length() <= 16))){
            System.out.println("Invalid! Requires a minimum of 8 and "
                    + "maximum of 16 characters!");
            return false;
        }

        if (firstCharacter == '0' || firstCharacter == '1' || firstCharacter == '2'
        || firstCharacter == '3' || firstCharacter == '4' || firstCharacter == '5'
        || firstCharacter == '6' || firstCharacter == '7' || firstCharacter == '8'
        || firstCharacter == '9') {
        System.out.println("Invalid! First character should be a letter");
            return false;
        }

        if (password.contains("@") || password.contains("#")
		    || password.contains("!") || password.contains("~")
		    || password.contains("$") || password.contains("%")
		    || password.contains("^") || password.contains("&")
		    || password.contains("*") || password.contains("(")
		    || password.contains(")") || password.contains("-")
		    || password.contains("+") || password.contains("/")
		    || password.contains(":") || password.contains(".")
		    || password.contains(", ") || password.contains("<")
		    || password.contains(">") || password.contains("?")
		    || password.contains("|")) {
		    
                System.out.println("Invalid! Password must not contain special characters");
                return false;
		}

        if (password.contains(" ")) {
            System.out.println("Invalid! Must not include ' '");
            return false;
        }

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
        boolean valid = isValid(password);
        if (valid){
            System.out.println("Successfully configured password");
        }else{
            System.out.println("Unsuccessfully configured password");
        }

        System.exit(0);
    }

}