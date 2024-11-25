package lab8;

import java.util.HashMap;
import java.util.Scanner;

public class freqChar {

    public static void findFrequentCharacters(String input, int n) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Characters that appear more than " + n + " times:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > n) {
                System.out.println(ch + " -> " + charCountMap.get(ch) + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Enter the minimum number of occurrences: ");
        int n = sc.nextInt();

        findFrequentCharacters(input, n);

        sc.close();
    }
}
