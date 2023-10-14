import java.util.Random;

public class Problem01 {
    public static void main(String[] args) {
        int[] randomIntegers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomIntegers[i] = random.nextInt(101);
        }
        int min = FindMinimum(randomIntegers);
        System.out.println("Random Generated Array:");
        for (int num : randomIntegers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSmallest integer: " + min);
        int[] maxDiff = BiggestDifference(randomIntegers);
        System.out.println("Numbers with the biggest difference: " + maxDiff[0] + " and " + maxDiff[1]);
    }
    //Function Of 'Find Minimum'
    public static int FindMinimum(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    //Function Of 'Biggest Difference'
    public static int[] BiggestDifference(int[] arr) {
        if (arr.length < 2) {
            return null;
        }
        int maxDiff = 0;
        int[] maxDiffNums = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxDiffNums[0] = arr[i];
                    maxDiffNums[1] = arr[j];
                }
            }
        }
        return maxDiffNums;
    }
}
