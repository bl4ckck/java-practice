package week2.assignment3.number1;

public enum Food {
    DAGING, SERANGGA, KOTORAN, DAUN, TIKUS, KACANG;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
