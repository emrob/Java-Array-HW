import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicTest {
    private Magic8Ball magic8Ball;

        @Before
        public void before(){
            ArrayList<String> Mywords= new ArrayList<>();
            Mywords.add("Try again");
            Mywords.add("Maybe with time");
            magic8Ball = new Magic8Ball(Mywords);

        }

        @Test
        public void addWord(){
            magic8Ball.add("Yes");
            assertEquals(3, magic8Ball.getWordCount());
        }

        @Test
        public void getRandomAnswer(){
            ArrayList results = magic8Ball.getWords();
            String randomWord = magic8Ball.getRandomAnswer();
            assertTrue(results.contains(randomWord));

        }
    }

