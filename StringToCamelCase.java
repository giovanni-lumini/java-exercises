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
            if (str.charAt(i) == '-' || str.charAt(i) == '_') {
                char charAfter = str.charAt(i + 1);
                String charAfterToString = Character.toString(charAfter).toUpperCase();
                newStr += charAfterToString;
                i++;
            } else {
                newStr += str.charAt(i);
            }
        }

        str = newStr;
        System.out.println(str);
    }
}