package skyPass;

import enums.LiftAmount;

/**
 * Created by bohdan on 11/28/16.
 */
public class LiftAmountDecorator extends CardDecorator implements Card{
    Card card;
    int liftAmount;

    LiftAmountDecorator(Card card, LiftAmount liftAmount) {
        this.card = card;
        this.liftAmount = liftAmount.value();
    }

    @Override
    public String getDescription() {
        return card.getDescription() + "Card by lift amount";
    }

    @Override
    public boolean isValid() {
        // TODO: 11/28/16
        return false;
    }
}
