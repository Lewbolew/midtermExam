package skyPass;

/**
 * Created by bohdan on 11/28/16.
 */
public abstract class AbstractCard {
    private String uniqueID;
    private boolean isLocked;
    public AbstractCard() {

    }
    public AbstractCard(String uniqueID, boolean isLocked) {
        setUniqueID(uniqueID);
        setIsLocked(isLocked);

    }
    public String getUniqueID() {
        return uniqueID;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void setUniqueID(String string) {
        uniqueID = string;
    }

    public void setIsLocked(boolean bool) {
        isLocked = bool;
    }
}
