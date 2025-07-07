// package workshop.basics;

// public class StringExample {

//     public static void main(String[] args) {
//         String sentence="This program shows how can we spilt a string into multiple strings";
//         String words[]= sentence.split("");

//         System.out.println(words.length);

//     }
// }


package workshop.basics;

public class StringExample {

    public static void main(String[] args) {
        String sentence="This program shows how can we split a string into multiple strings";
        String[] words = sentence.split("\\s+");

        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
    
