package OccurrencsCounter.Stemmer;

import org.tartarus.snowball.ext.PorterStemmer;

public class LuenceStemmer implements Stemmer {

    private PorterStemmer stemmer = new PorterStemmer();

    public LuenceStemmer() {
        //BLANK.
    }

    @Override
    public String getStem (String word) {
        this.stemmer.setCurrent(word);
        this.stemmer.stem();
        return stemmer.getCurrent();
    }
}
