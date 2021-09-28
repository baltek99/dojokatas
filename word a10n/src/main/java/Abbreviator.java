import java.util.LinkedList;
import java.util.List;

public class Abbreviator {
//abbreviate("elephant-rides are really fun!")
//          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
// words (^):   "elephant" "rides" "are" "really" "fun"
//                123456     123     1     1234     1
// ignore short words:               X              X

// abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
// all non-word characters (*) remain in place
//                     "-"      " "    " "     " "     "!"
//=== "e6t-r3s are r4y fun!"

    public String abbreviate(String string) {

        StringBuilder word = new StringBuilder();

        StringBuilder words = new  StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (isCharALatter(string.charAt(i))) {
                //Character.isAlphabetic(char); - wbudowana funkcja
                word.append(string.charAt(i));
                if (i == string.length() - 1) {
                    words.append(abbreviateOneWord(word.toString()));
                }
            }
            else {
                words.append(abbreviateOneWord(word.toString()));
                words.append(string.charAt(i));
                word.delete(0, word.length());
            }
        }

        return words.toString();
    }

    public boolean isCharALatter(char c) {
        return (c > 64 && c < 91) || (c > 96 && c < 123);
    }

    public String abbreviateOneWord(String str) {
        if (str.length() <= 3) return str;

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int counter = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            counter++;
        }
        sb.append(counter);
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }

}