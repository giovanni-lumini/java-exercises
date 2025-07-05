/* 
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
*/

public class StringToCamelCase {
    public static void main(String[] args) {

        String str = "The_Stealth_Warrior";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '-' || currentChar == '_') {
                char charAfter = str.charAt(i + 1);
                char charAfterUpper = Character.toUpperCase(charAfter);
                newStr += charAfterUpper;
                i++;
            } else {
                newStr += currentChar;
            }
        }

        str = newStr;
        System.out.println(str);
    }
}