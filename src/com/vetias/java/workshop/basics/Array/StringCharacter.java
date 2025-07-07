package workshop.basics.Array;

public class StringCharacter {

    public static void main(String[] args) {
        String text="This program shows how can we split a"+ "string into multiple strings. We need to find sentence," +"words and letters count";
        String[] sentences = text.split("\\.");
        String[] words = text.split(" ");
        System.out.println("sentence:" + sentences.length);
        System.out.println("Words:" + words.length);
        System.out.println("Characters" + text.length());
    }
}

