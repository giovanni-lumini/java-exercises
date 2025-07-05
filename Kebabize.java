/* 
Modify the kebabize function so that it converts a camel case string into a kebab case.

"camelsHaveThreeHumps"  -->  "camels-have-three-humps"
"camelsHave3Humps"  -->  "camels-have-humps"
"CAMEL"  -->  "c-a-m-e-l"

Notes:
the returned string should only contain lowercase letters
*/

public class Kebabize {
    public static void main(String[] args) {

        String str = "camelsHave3Humps";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                continue;
            }

            if (Character.isUpperCase(currentChar)) {
                if (!newStr.isEmpty()) {
                    newStr += "-";
                }
                char charOfStringLower = Character.toLowerCase(currentChar);
                newStr += charOfStringLower;
            } else {
                newStr += currentChar;
            }
        }

        str = newStr;
        System.out.println(str);
    }
}