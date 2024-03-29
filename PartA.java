
public class PartA {
    public static void main(String[] args) {
        System.out.println("The Doomed Dice Challenge - Part A\n");
    
        //Total Combinations Calculation and its Explanation
        System.out.println("\n--- 1.Total Number Of Combinations Calculation ---");
        int dieA = 6; 
        int dieB = 6; 
        int totalCombinations = calculateTotalCombinations(dieA, dieB);
        System.out.println("Calculation : The total number of combinations when rolling two dice can be found by multiplying the number of faces on Die A (6) with the number of faces on Die B (6).");
        System.out.println("Formula: Total Combinations = Faces on Die A * Faces on Die B = " + dieA + " * " + dieB);
        System.out.println("Total combinations possible: " + totalCombinations);
    
        //Distribution Calculation
        System.out.println("\n--- 2.Explanation of Distribution Calculation ---");
        System.out.println("To display the distribution of all possible combinations, we will create a matrix where each cell (i,j) represents the face i on Die A and face j on Die B.");
        System.out.println("Calculation Steps for Distribution: For each die face from 1 to 6 on Die A and Die B, display the possible pairs in matrix format.That is (1,1) , (1,2) , ..., (6,6).");
    
        // Displaying the Distribution of all possible combinations...
        System.out.println("\nDistribution of all possible combinations:");
        displayDistribution();
    
        //Probability Calculation
        System.out.println("\n--- 3.Probability of All Possible Sums with Calculation ---");
        System.out.println("To calculate the probability of each possible sum (between 2-12), we count how many times each sum appears in the distribution and divide by the total number of combinations.");
        System.out.println("Formula: Probability of Sum = Count of Sum / Total Combinations");
        displaySumProbabilities(totalCombinations);
    
        System.out.println("\nEnd of Part A.");
    }
    
    private static int calculateTotalCombinations(int dieA, int dieB) {
        return dieA * dieB;
    }
    
    private static void displayDistribution() {

        System.out.println();
        for (int i = 1; i <= 6; i++) {
            
            for (int j = 1; j <= 6; j++) {
                System.out.printf("(%2d,%2d) ", i,j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            
            for (int j = 1; j <= 6; j++) {
                System.out.printf("%2d ", i+j);
            }
            System.out.println();
        }
    }
    
    private static void displaySumProbabilities(int totalCombinations) {
        int[] sumCounts = new int[13]; // Index 0 is not used, so 13 elements
        
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                sumCounts[i + j]++;
            }
        }
    
        // Displaying each sum's probability...
        for (int sum = 2; sum <= 12; sum++) {
            double probability = (double) sumCounts[sum] / totalCombinations;
            System.out.printf("For sum = %2d: Count = %2d, Probability = %2d/%2d = %.4f\n",
                    sum, sumCounts[sum], sumCounts[sum], totalCombinations, probability);
        }
     } 
}
