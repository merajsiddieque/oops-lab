package lab8;

import java.util.Scanner;

public class RangePattern {

    public static int countPatternOccurrences(int a, int b, String pattern)
    {
        int count = 0;

        for (int i = a; i <= b; i++) 
        {
            String numberStr = Integer.toString(i);

            if (numberStr.contains(pattern))
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting value of the range (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the ending value of the range (b): ");
        int b = sc.nextInt();

        System.out.print("Enter the pattern to search: ");
        String pattern = sc.next();

        int occurrences = countPatternOccurrences(a, b, pattern);

        System.out.println("The pattern \"" + pattern + "\" occurred " + occurrences + " times between " + a + " and " + b + ".");

        sc.close();
    }
}

