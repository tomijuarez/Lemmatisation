package OccurrencsCounter;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * You might want to implement different strategies in order to achieve the number of words in a file.
 * This interface ensures the interface of a counting method.
 */

public interface OccurrencesCounter {
    /**
     * This method returns the list of word occurrences in a text using some algorithm.
     * @param text
     * @param exceptions - The words that we must avoid. A hashSet provides a constant search time.
     * @return list of words occurrences in a text.
     */

    public TreeSet<Occurrence> getOccurrences(String text, HashSet<String> exceptions);
}
