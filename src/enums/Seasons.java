package enums;

/**
 * Created by bohdan on 11/28/16.
 */
public enum Seasons {
    WINTER, SPRING, SUMMER, AUTUMN;

    @Override
    public String toString() {
        switch (this) {
            case WINTER: return "winter";
            case SPRING: return "spring";
            case SUMMER: return "summer";
            case AUTUMN: return "autumn";
        }
        return null;
    }
}
