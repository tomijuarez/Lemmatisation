package OccurrencsCounter;

import OccurrencsCounter.Stemmer.Stemmer;

import java.util.*;

public class StemsCounter implements OccurrencesCounter {

    private Stemmer stemmer;

    public StemsCounter(Stemmer stemmer) {
        this.stemmer = stemmer;
    }

    @Override
    public TreeSet<Occurrence> getOccurrences(String text, HashSet<String> exceptions) {
        //Prevent a NullPointerException :D
        if (!(text != null && !text.isEmpty()))
            return null;

        StringTokenizer sentencesTokenizer;
        StringTokenizer wordsTokenizer;
        String currentWord = "";

        Map<String, Occurrence> stems = new TreeMap<>();
        int currentSentence = 1;

        //To split into sentences [a sentence ends wit "?", "!" or "."].
        sentencesTokenizer = new StringTokenizer(text, ".?!");

        while(sentencesTokenizer.hasMoreTokens()) {
            //Once we find a sentence, we have to extract the words.
            wordsTokenizer = new StringTokenizer(sentencesTokenizer.nextToken());
            while (wordsTokenizer.hasMoreTokens()) {
                currentWord = wordsTokenizer.nextToken().replaceAll("[^A-Za-z0-9]", "");
                //Filter. Contains has a constant access time.
                if (exceptions != null && !exceptions.contains(currentWord.toLowerCase())) {
                    //Now the word is stemmed.
                    currentWord = this.stemmer.getStem(currentWord);

                    if(!stems.containsKey(currentWord.toLowerCase()))
                        stems.put(currentWord.toLowerCase(), new Occurrence(currentWord, currentSentence));
                    else
                        stems.get(currentWord.toLowerCase()).addOccurence(currentSentence);
                    }
                }

            //New sentence.
            currentSentence++;
        }

        return new TreeSet<>(stems.values());
    }

}
