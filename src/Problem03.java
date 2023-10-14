public class Problem03 {
    public static double callCharge(int startingMinute, int durationMinutes) {
        double[] rateTable = { 0.0, 1.5, 1.0, 2.5, 0.5 };
        double totalCharge = 0.0;

        int endingMinute = startingMinute + durationMinutes;

        for (int quadrant = startingMinute / 15 + 1; quadrant <= 4; quadrant++) {

            int minutesInQuadrant = Math.min(15 * quadrant - startingMinute, endingMinute - startingMinute);

            totalCharge += minutesInQuadrant * rateTable[quadrant];

            startingMinute = 15 * quadrant;

            if (startingMinute >= endingMinute) {
                break;
            }
        }

        return totalCharge;
    }
    public static void main(String[] args) {
        int startingMinute = 13;
        int durationMinutes = 50;
        double callCharge = callCharge(startingMinute, durationMinutes);
        System.out.println("Call Charge: " + callCharge + " Taka");
    }
}
