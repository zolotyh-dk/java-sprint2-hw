public class Converter {
    private static final double METERS_PER_STEP = 0.75;
    private static final double KILOCALORIES_PER_STEP = 0.05;

    public static int convertToKm(int steps) {
        return (int) Math.round(steps * METERS_PER_STEP);
    }

    public static int convertStepsToKilocalories(int steps) {
        return (int) Math.round(steps * KILOCALORIES_PER_STEP);
    }
}
