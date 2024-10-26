public class Task7 {
    public static void main(String[] args) {
        // Outer loop for the number of rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= 5; j++) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
