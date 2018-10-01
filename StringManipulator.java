public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        String answer = a.trim().concat(b.trim());
        return answer;
    }
    public Integer getIndexOrNull(String a, char b){
        int result = a.indexOf(b);
        return result;
    }
    public Integer getIndexOrNull(String a, String b){
        int result = a.indexOf(b);
        return result;
    }
    public String concatSubstring(String a, int b, int c, String d){
        String sub = a.substring(b,c);
        String result = String.format ("%s%s", sub, d);
        return result;
    }
}