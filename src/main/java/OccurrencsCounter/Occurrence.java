package OccurrencsCounter;

import java.util.HashSet;
import java.util.Set;

public class Occurrence implements Comparable<Occurrence> {
    private String word;
    private int occurrencesCount;
    private Set<Integer> sentences;

    public Occurrence(String word, int currentSentence) {
        this.word = word;
        this.occurrencesCount = 1;
        this.sentences = new HashSet<>();
        this.addSentence(currentSentence);
    }

    private void addSentence(int sentence) {
        //Boxing.
        this.sentences.add(sentence);
    }

    public void addOccurence(int sentence) {
        this.occurrencesCount++;
        this.addSentence(sentence);
    }

    public String getWord() {
        return this.word;
    }

    //The natural key order of Occurrence is "word".
    @Override
    public int compareTo(Occurrence other) {
        //The comparison will be made by String.compareTo(). This is the most generic way to do this.
        return this.word.toLowerCase().compareTo(other.getWord().toLowerCase());
    }
}