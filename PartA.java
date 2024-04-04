public class PartA {
    public static void main(String[] args) {
        
        System.out.println("The Doomed Dice Challenge - Part A\n");
        
        // QUESTION 1: Print count of possible combinations
        int dieA = 6; 
        int dieB = 6; 
        int totalCombinations = calculateTotalCombinations(dieA, dieB);
        System.out.println("\n--- 1.Total Number Of Combinations Calculation ---");
        System.out.println("Count of possible combinations: "+ totalCombinations);
        
        System.out.println("----------------------------------------------------------------------");

        // QUESTION 2: Distribution Calculation
        System.out.println("\n--- 2.Explanation of Distribution Calculation ---");
        System.out.println("All the possible combinations are:");
        displayDistribution();
        System.out.println("----------------------------------------------------------------------");

        // QUESTION 3: Calculate and print the Probability of all Possible Sums
        System.out.println("\n--- 3.Probability of All Possible Sums with Calculation ---");
        System.out.println("Sum\tProbability(Fraction)\tProbability (Decimal)");
       displaySumProbabilities();
        System.out.println("\nEnd of Part A.");
    }

    private static int calculateTotalCombinations(int dieA, int dieB) {
        return dieA * dieB;
    }

    private static void displayDistribution() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    private static void displaySumProbabilities() {
        int memo[] = new int[13];// Indices 0 and 1 will not be used, to make the mapping direct (sum -> index)

        // Populating the memoization table
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                memo[i + j] += 1;
            }
        }
        for (int i = 2; i <= 12; i++) {
            String probabilityFraction = memo[i] + "/36";
            double probabilityDecimal = (double) memo[i] / 36;
            System.out.println(i + "\t\t" + probabilityFraction + "\t\t" + String.format("%.2f", probabilityDecimal));
        }
    }
}

