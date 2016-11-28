package skyPass;

import enums.Seasons;

/**
 * Created by bohdan on 11/28/16.
 */
public class SeasonPassCard extends AbstractCard implements Card{
    Seasons season = Seasons.WINTER;

    public SeasonPassCard(String uniqueID, boolean isLocked, Seasons season) {
        super(uniqueID, isLocked);
        this.season = season;
    }
    @Override
    public String getDescription() {
        return "Season card";
    }
}
