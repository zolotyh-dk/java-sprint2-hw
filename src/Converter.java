public class Converter {
    private static final double METERS_PER_STEP = 0.75;
    private static final double KILOCALORIES_PER_STEP = 0.05;

    static int convertToKm(int steps) {
        return (int) (steps * METERS_PER_STEP);
    }

    static int convertStepsToKilocalories(int steps) {
        return (int) (steps * KILOCALORIES_PER_STEP);
    }
}
