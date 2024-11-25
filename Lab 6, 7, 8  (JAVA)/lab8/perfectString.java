package lab8;

import java.util.HashSet;
import java.util.Scanner;

public class perfectString {

    public static boolean isPerfectString(String input) {
        HashSet<Character> charSet = new HashSet<>();

        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            if (charSet.contains(ch)) 
            {
                return false;
            }

            charSet.add(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPerfectString(input)) {
            System.out.println("The string is a perfect string.");
        } else {
            System.out.println("The string is not a perfect string.");
        }

        sc.close();
    }
}

