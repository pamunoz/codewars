import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String ans = "";
        for(Integer digit : binary) {
        ans += digit;
        }
        return Integer.parseInt(ans, 2);
    }

}
