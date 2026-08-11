public class DoublePyramidPattern {
    public static void main(String[] args) {
        int rows = 4;   // height of each pyramid
        int gap = 4;    // spaces between the two halves

        // Top half
        for (int i = 1; i <= rows; i++) {
            printRow(i, gap);
        }

        // Middle (widest row repeated twice)
        printRow(rows, gap);
        printRow(rows, gap);

        // Bottom half
        for (int i = rows - 1; i >= 1; i--) {
            printRow(i, gap);
        }
    }

    // Helper method to print one row
    private static void printRow(int stars, int gap) {
        String left = "*".repeat(stars);
        String spaces = " ".repeat(gap);
        String right = "*".repeat(stars);
        System.out.println(left + spaces + right);
    }
}
