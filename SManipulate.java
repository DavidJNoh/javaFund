public class SManipulate{
    public static void main(String[] args){
        StringManipulator test1 = new StringManipulator ();
        String result1 = test1.trimAndConcat("    Sup    ", "  World  ");
        System.out.println(result1);

        char letter = 'o';
        Integer a = test1.getIndexOrNull("Coding", letter);
        Integer b = test1.getIndexOrNull("Hello World", letter);
        Integer c = test1.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // -1

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = test1.getIndexOrNull(word, subString);
        Integer e = test1.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1

        String Kurt = test1.concatSubstring("Hello", 1, 2, "world");
        System.out.println(Kurt); // eworld
    }
}