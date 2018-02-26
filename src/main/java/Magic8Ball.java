import java.util.ArrayList;
import java.util.Collections;

public class Magic8Ball {

    private ArrayList<String> words;

    public Magic8Ball(ArrayList<String> words) {
        this.words = new ArrayList<>();
        this.words = words;
    }

    public void add(String word) {
        this.words.add(word);
    }


    public int getWordCount() {
        return this.words.size();
    }


    public String getRandomAnswer() {
        Collections.shuffle(words);
        return words.get(0);
    }

    public ArrayList<String>getWords() { return new     ArrayList<>(this.words);}

}