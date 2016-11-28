package enums;

/**
 * Created by bohdan on 11/28/16.
 */
public enum DayAmount {
    ONE_DAY, TWO_DAY, THREE_DAY, FOUR_DAY, FIVE_DAY;

    public int value() {
        switch (this) {
            case ONE_DAY: return 1;
            case TWO_DAY: return 2;
            case THREE_DAY: return 3;
            case FOUR_DAY: return 4;
            case FIVE_DAY: return 5;
        }
        return 0;
    }
}

