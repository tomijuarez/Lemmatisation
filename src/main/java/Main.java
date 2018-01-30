import OccurrencsCounter.Occurrence;
import OccurrencsCounter.Stemmer.LuenceStemmer;
import OccurrencsCounter.StemsCounter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    /**
     * Entry point.
     * @param args
     */
    public static void main(String args[]) {
        //Static content.
        String content = "Take this paragraph of text and return an alphabetized list of ALL unique words.  A unique word is any form of a word often communicated with essentially the same meaning. For example, fish and fishes could be defined as a unique word by using their stem fish. For each unique word found in this entire paragraph, determine the how many times the word appears in total. Also, provide an analysis of what unique sentence index position or positions the word is found. The following words should not be included in your analysis or result set: \"a\", \"the\", \"and\", \"of\", \"in\", \"be\", \"also\" and \"as\".  Your final result MUST be displayed in a readable console output in the same format as the JSON sample object shown below.";

        HashSet<String> wordsExceptions = new HashSet<String>(){{
            add("a"); add("the"); add("and"); add("of"); add("in"); add("be"); add("also"); add("as");
        }};

        TextProcessor processor = new TextProcessor(new StemsCounter(new LuenceStemmer()), wordsExceptions);
        processor.setText(content);

        TreeSet<Occurrence> occurrencesResult = processor.getOccurrences();
        ResponseDTO response = new ResponseDTO();
        response.setOccurrences(occurrencesResult);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(response);

        System.out.println(json);

    }
}
