package enums;

/**
 * Created by bohdan on 11/28/16.
 */
public enum LiftAmount {
    TEN, TWENTY, FIFTY, HUNDRED;
    public int value() {
        switch (this) {
            case TEN: return 10;
            case TWENTY: return 20;
            case FIFTY: return 50;
            case HUNDRED: return 100;
        }
        return 0;
    }
}
