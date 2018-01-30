import OccurrencsCounter.Occurrence;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.TreeSet;

/**
 * Created by tomi on 25/01/18.
 */
public class ResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("result")
    private TreeSet<Occurrence> occurrences;

    public ResponseDTO() { /*BLANK*/ }

    public TreeSet<Occurrence> getOcurrences() {
        return this.occurrences;
    }

    public void setOccurrences(TreeSet<Occurrence> occurrences) {
        this.occurrences = occurrences;
    }
}
