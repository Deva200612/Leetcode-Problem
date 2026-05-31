import java.util.HashSet;
import java.util.Set;

class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();

        for (char ch : password.toCharArray()) {
            set.add(ch);
        }

        int strength = 0;

        for (char ch : set) {
            if (Character.isLowerCase(ch)) {
                strength += 1;
            } else if (Character.isUpperCase(ch)) {
                strength += 2;
            } else if (Character.isDigit(ch)) {
                strength += 3;
            } else { 
                strength += 5;
            }
        }

        return strength;
    }
}