import OccurrencsCounter.Occurrence;
import OccurrencsCounter.OccurrencesCounter;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Wrapper for text processing algorithms.
 */

public class TextProcessor {

    private String text;
    private OccurrencesCounter lister;
    private HashSet<String> wordsExceptions;

    public TextProcessor(OccurrencesCounter lister, HashSet<String> wordsExceptions) {
        this.lister = lister;
        this.wordsExceptions = wordsExceptions;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TreeSet<Occurrence> getOccurrences() {
        return this.lister.getOccurrences(this.text, this.wordsExceptions);
    }
}