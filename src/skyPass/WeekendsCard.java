package skyPass;

/**
 * Created by bohdan on 11/28/16.
 */
public class WeekendsCard extends AbstractCard implements Card {

    @Override
    public String getDescription() {
        return "Weekends card";
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
