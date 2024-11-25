package lab8;

import java.util.Scanner;

public class password{

    public static boolean isValidPassword(String password) {
        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        boolean hasLowerCase = false;
        boolean hasDigit = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
             
                return false;
            } 
            if (!Character.isLetterOrDigit(ch)) {
          
                return false;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (i >= 1 && password.charAt(i) == password.charAt(i - 1)) 
            {
                return false;
            }
        }

        return hasLowerCase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        sc.close();
    }
}
