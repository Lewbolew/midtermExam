package skyPass;

import enums.DayAmount;

/**
 * Created by bohdan on 11/28/16.
 */
public class DayDecorator extends AbstractCard implements Card{
    Card card;
    int dayAmount;

    DayDecorator(Card card, DayAmount dayAmount) {
        this.card = card;
        this.dayAmount = dayAmount.value();
    }
    @Override
    public String getDescription() {
        return card.getDescription() + "Card by day";
    }

    @Override
    public boolean isValid() {
        // TODO: 11/28/16
        return true;
    }
}
