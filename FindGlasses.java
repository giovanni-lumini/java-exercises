/* 
Oh no! I've lost my glasses, but paradoxically, I need glasses to find my glasses!

Please help me out by showing me the index in the list which contains my glasses. They look like two capital Os, with at least one dash in between!

This means that both O--O and O------------O are valid glasses, but not O----#--O for example!
Search thoroughly, you might find my glasses in places such as 'dustO-Odust'
Examples
["phone", "O-O", "coins", "keys"] ➞ 1

["OO", "wallet", "O##O", "O----O"] ➞ 3

["O--#--O", "dustO---Odust", "more dust"] ➞ 1
Notes
All lists will include one valid pair of glasses because I swear I dropped them around here somewhere ...
All elements in the list are strings.
*/

public class FindGlasses {
    public static void main(String[] args) {

        String[] arr = { "OO", "wallet", "O##O", "O----O" };

        String regex = "O-+O";

        boolean found = false;

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches(".*" + regex + ".*")) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("glasses found at index: " + index);
        } else {
            System.out.println("glasses not found");
        }
    }
}
