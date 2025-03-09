package trings;

import java.util.HashSet;
import java.util.Set;

public class dUplicatesInString {
    public static String s;

    public static void main(String[] args) {
        s = "aabbc";
        dUplicatesInString obj = new dUplicatesInString();
        
        if (obj.checkDuplicate()) {
            System.out.println("String contains duplicate characters.");
        } else {
            System.out.println("String has all unique characters.");
        }
    }

    boolean checkDuplicate() {
        Set<Character> seen = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (seen.contains(ch)) {
                return true; // Duplicate found
            }
            seen.add(ch);
        }
        return false; // No duplicates
    }
}
