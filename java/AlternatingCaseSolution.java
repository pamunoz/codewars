public class StringUtils {

    public static String toAlternativeString(String string) {
        String answer = "";
        for(int i = 0; i < string.length(); i++) {
            if(Character.isUpperCase(string.charAt(i))) {
                answer += string.substring(i, i + 1).toLowerCase();
            } else {
                answer += string.substring(i, i + 1).toUpperCase();
            }
        }
        return answer;
    }
}
