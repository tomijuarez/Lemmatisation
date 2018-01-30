# Lemmatisation
A lemmatisation fully implemented in Java that solves the following problem:

*Take this paragraph of text and return an alphabetized list of ALL unique words.  A unique word is any form of a word often communicated with essentially the same meaning. For example, fish and fishes could be defined as a unique word by using their stem fish. For each unique word found in this entire paragraph, determine the how many times the word appears in total. Also, provide an analysis of what unique sentence index position or positions the word is found. The following words should not be included in your analysis or result set: "a", "the", "and", "of", "in", "be", "also" and "as".  Your final result MUST be displayed in a readable console output in the same format as the JSON sample object shown below.
Sample Output:*

```json
{

  "results": [

    {

      "word": "ALL",

      "total-occurrences": 1,

      "sentence-indexes": [0]

    },

    {

      "word": "alphabetized",

      "total-occurrences": 1,

      "sentence-indexes": [0]

    },

   {

      "word": "analysis",

      "total-occurrences": 2,

      "sentence-indexes": [4, 5]

    },

   ...

  ]

}
```

The following assumpstions were made:

1. The structure prints the stems and not the words. For example; *fishes* and *fish* will be saved as *fish*.
2. The sentences are lister for each stem only once. This is because the program uses a set. If the set is changed by a simple list then the occurrence object will list more than once the same sentence. For example if we have the words *fish* and *fishes* in the first sentence of a text, then it only counts 1 once.

To run this program you have to install maven and Java version 1.8. If you are using Linux you might find useful a script called "run.sh" that generates the jar with its dependencies and after that runs the jar. You should give executable permissions using the following commands: `chmod +x "run.sh"`. If you are on Windows or OSX you have to run manually the commands on that script.
