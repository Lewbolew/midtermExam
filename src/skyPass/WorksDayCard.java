package skyPass;

/**
 * Created by bohdan on 11/28/16.
 */
public class WorksDayCard extends AbstractCard implements Card {

    public WorksDayCard(String uniqueID, boolean isLocked) {
        super(uniqueID, isLocked);
    }
    @Override
    public String getDescription() {
        return "Works day card";
    }
}
