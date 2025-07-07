package workshop.basics.Array;

public class stringlength {
    public static void main(String[] args) {
        String sentence="This program shows how can we split a string into multiple strings";
        String[] words = sentence.split("\\s+");

        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

