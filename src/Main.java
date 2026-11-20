import java.util.Scanner;

public class Main {

  // Task 1. Count positive, negative and zero values
  public static void countValues() {
    int[] a = {5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
    int positive = 0, negative = 0, zero = 0;

    for (int x : a) {
      if (x > 0) positive++;
      else if (x < 0) negative++;
      else zero++;
    }

    System.out.print("Array: ");
    for (int x : a) System.out.print(x + " ");
    System.out.println();
    System.out.println("Positive: " + positive);
    System.out.println("Negative: " + negative);
    System.out.println("Zero: " + zero);
  }

  // Task 2. Largest and smallest elements
  public static void largestAndSmallest() {
    int[] a = {12, 5, 28, 3, 19, 7, 15, 9};
    int max = a[0], maxIndex = 0;
    int min = a[0], minIndex = 0;

    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
        maxIndex = i;
      }
      if (a[i] < min) {
        min = a[i];
        minIndex = i;
      }
    }

    System.out.print("Array: ");
    for (int x : a) System.out.print(x + " ");
    System.out.println();
    System.out.println("Largest: " + max + " at index " + maxIndex);
    System.out.println("Smallest: " + min + " at index " + minIndex);
  }

  // Task 3. Numbers greater than the average
  public static void aboveAverage() {
    int[] a = {10, 20, 30, 40, 50, 60};
    int sum = 0;

    for (int x : a) sum += x;
    double average = (double) sum / a.length;

    int count = 0;
    for (int x : a) {
      if (x > average) count++;
    }

    System.out.print("Array: ");
    for (int x : a) System.out.print(x + " ");
    System.out.println();
    System.out.println("Average: " + average);
    System.out.println("Numbers above average: " + count);
  }

  // Task 4. Print an array in reverse order (array is not modified)
  public static void printReversed() {
    int[] a = {3, 8, 12, 5, 9, 2, 7};

    System.out.print("Original: ");
    for (int x : a) System.out.print(x + " ");
    System.out.println();

    System.out.print("Reversed: ");
    for (int i = a.length - 1; i >= 0; i--) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  // Task 5. Student test scores
  public static void studentScores() {
    Scanner sc = new Scanner(System.in);
    int[] scores = new int[5];

    for (int i = 0; i < scores.length; i++) {
      while (true) {
        System.out.print("Enter score " + (i + 1) + " (0-100): ");

        if (!sc.hasNextInt()) {
          System.out.println("Invalid input! Enter a number.");
          sc.next();
          continue;
        }

        int score = sc.nextInt();
        if (score >= 0 && score <= 100) {
          scores[i] = score;
          break;
        }
        System.out.println("Invalid score! Enter a value from 0 to 100.");
      }
    }

    int passed = 0, failed = 0, sum = 0;
    for (int s : scores) {
      if (s >= 60) passed++;
      else failed++;
      sum += s;
    }

    System.out.print("Scores: ");
    for (int s : scores) System.out.print(s + " ");
    System.out.println();
    System.out.println("Passed: " + passed);
    System.out.println("Failed: " + failed);
    System.out.println("Average: " + (double) sum / scores.length);
  }

  public static void main(String[] args) {
    System.out.println("--- Task 1 ---");
    countValues();

    System.out.println("\n--- Task 2 ---");
    largestAndSmallest();

    System.out.println("\n--- Task 3 ---");
    aboveAverage();

    System.out.println("\n--- Task 4 ---");
    printReversed();

    System.out.println("\n--- Task 5 ---");
    studentScores();
  }
}