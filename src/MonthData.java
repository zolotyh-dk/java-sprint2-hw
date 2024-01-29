public class MonthData {
    int[] days = new int[30];

    public void printDaysAndStepsFromMonth() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < days.length; i++) {
            builder.append(i + 1).append(" день: ").append(days[i]).append("\n");
        }
        System.out.println(builder);
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = days[0];
        for (int i = 1; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries++;
                if (finalSeries < currentSeries) {
                    finalSeries = currentSeries;
                }
            } else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}
