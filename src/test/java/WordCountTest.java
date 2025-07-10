import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.vetias.java.workshop.basics.string.WordCount;

public class WordCountTest {
    @Test
    public void testWorldCount(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This program is short");
        Assertions.assertEquals(4, count);
    }
    @Test
    public void testanotherstring(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("sowmiya venkatesh");
        Assertions.assertEquals(2, count);
    }

    // praticing test cases
    @Test
    void testNullString(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count(null);
        Assertions.assertEquals(0, count);
    }

    @Test
    void testEmptyString(){
        WordCount wordCount = new WordCount();
       int count = wordCount.count("");
       Assertions.assertEquals(0, count);
    }

}
