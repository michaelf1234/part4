
package average.pkg1;
import java.util.Scanner;

/**
 *Part3, task1
 * 
 * @author Michael Fraschetti
 */
public class Average1 {
private int[] data; // Array for scores
    private double mean; // Mean of the scores

    // Constructor
    public Average1() {
        data = new int[5]; // Allocate memory for 5 scores
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // Sort and calculate mean
        selectionSort();
        calculateMean();
    }

    // Calculate the mean
    private void calculateMean() {
        int total = 0;
        for (int score : data) total += score;
        mean = (double) total / data.length;
    }

    // Sort array in descending order
    private void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) maxIndex = j;
            }
            int temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    // toString method
    public String toString() {
        StringBuilder result = new StringBuilder("Data in descending order: ");
        for (int score : data) result.append(score).append(" ");
        result.append("\nMean: ").append(mean);
        return result.toString();
    }
// Main method for testing Task 1
    public static void main(String[] args) {
        System.out.println("Task #1: Testing Average Class");
        Average1 average = new Average1();
        System.out.println(average); // Print the sorted data and mean
    }
}
