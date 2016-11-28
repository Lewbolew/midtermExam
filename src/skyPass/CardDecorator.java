package skyPass;

/**
 * Created by bohdan on 11/28/16.
 */
public abstract class CardDecorator implements Card{
    private Card card;

    CardDecorator() {

    }
    CardDecorator(Card card) {
        this.card = card;
    }

    public abstract String getDescription();

}
