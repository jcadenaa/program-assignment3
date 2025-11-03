public class assignment3 {
    public static void main(String[] args) {
        int i, j;

        // 1: Display odd numbers from 100 to 200
        System.out.println("1:");

        for (i = 101; i < 200; i += 2) { 
            //Start with 101 and increment by 2 up to 200.
            System.out.print(i + " ");
        }

        // Print new line.
        System.out.println("\n");

        // 2: Display numbers from 100 to 200 counting by five
        System.out.println("2:");
        
        for (i = 100; i <= 200; i += 5) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Initialize loops vars for next assignments.
        int rows, cols;

        // 3: Display the following matrix.
        System.out.println("2:");

        rows = 4;
        cols = 5;

        for (i = 0; i < rows; i++) {
            // Create inner nesting.
            for (j = 0; j < cols; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

        System.out.println("\n");

        // 4: Display matrix using nested loops.
        System.out.println("4:");

        // NOTE: rows and cols initialized below should be optimized out.
        // Due to the above setting to the same values (but this is cleaner).
        rows = 4;
        cols = 5;

        for (i = 0; i < rows; i++) {
            // Create inner nesting loop starting from cols (5).
            for (j = cols; j > 0; j--) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }

        System.out.println("\n");

        // 5: Display the following matrix.
        System.out.println("5:");

        rows = 2;

        for (i = 0; i < rows; i++) {
            for (j = 8; j > 2; j--) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }

        System.out.println("\n");

        // 6: Display the following matrix.
        System.out.println("6:");

        cols = 6;

        for (i = 5; i > 1; i--) {
            for (j = 0; j < cols; j++) {
                System.out.print(i + " ");
            }

            System.out.println("");
        }
    }
}