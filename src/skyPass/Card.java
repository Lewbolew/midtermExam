package skyPass;

/**
 * Created by bohdan on 11/28/16.
 */
public interface Card {
    /**
     * Returns the description of the decorator.
     * @return String about type and functional of the decorator.
     */
    String getDescription();

    /**
     *Depending on the type of card we will return true if number of lifts remain or working days still actual.
     * @return
     */
    boolean isValid();
}
