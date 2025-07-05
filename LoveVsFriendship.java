/* 
 * If　a = 1, b = 2, c = 3 ... z = 26

Then l + o + v + e = 54

and f + r + i + e + n + d + s + h + i + p = 108

So friendship is twice as strong as love :-)

Your task is to write a function which calculates the value of a word based off the sum of the alphabet positions of its characters.

The input will always be made of only lowercase letters and will never be empty.
 */

public class LoveVsFriendship {
    public static void main(String[] args) {

        String string = "friendship";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;

        for (int i = 0; i < string.length(); i++) {

            char currentChar = string.charAt(i);
            String currentCharToString = Character.toString(currentChar);

            if (alphabet.contains(currentCharToString)) {
                int indexOfAlphabet = alphabet.indexOf(currentCharToString);
                sum += indexOfAlphabet + 1;
            }
        }
        System.out.println(sum);
    }
}
