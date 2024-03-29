import java.util.*;

public class Undoom_dice {

    public static void main(String[] args) {
        int[] initialSetA = {1, 2, 3, 4};//possible values that can be in New Dice A
        int[] initialSetB = {1, 2, 3, 4, 5, 6, 7, 8};//possible values that can be in New Dice B
        int sides = 6;
        List<Integer> originalDiceA = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> originalDiceB = List.of(1, 2, 3, 4, 5, 6);

        //gives the probability of each sum of the standard dice 
        Map<Integer, Integer> targetProbabilities = calculateProbabilities(originalDiceA, originalDiceB);

        //generates all possible combinations of the new dice A and B
        List<List<Integer>> combinationsA = generateCombinationsA(initialSetA, sides);
        List<List<Integer>> combinationsB = generateCombinationsB(initialSetB, sides);

        System.out.println("The Doomed Dice Challenge - Part B\n");

        //compares the probabilities of the new dice A and B with the standard dice
        boolean matchFound = false;
        for (List<Integer> combinationA : combinationsA) {
            for (List<Integer> combinationB : combinationsB) {
                if (compareProbabilities(combinationA, combinationB, targetProbabilities)) {
                    System.out.println("Matching transformations found");
                    System.out.println("Transformed Dice A: " + combinationA);
                    System.out.println("Transformed Dice B: " + combinationB);
                    matchFound = true;
                    break;
                }
            }
            if (matchFound) {
                break;
            }
        }
        if (!matchFound) {
            System.out.println("No matching transformations found.");
        }
    }

    //generates all possible combinations of the new dice B
    public static List<List<Integer>> generateCombinationsB(int[] arr, int sides) {
        List<List<Integer>> results = new ArrayList<>();
        generateCombinations(arr, 0, new ArrayList<>(), results, sides);
        return results;
    }

    //recursive function to generate all possible combinations of the new dice B
    private static void generateCombinations(int[] arr, int start, List<Integer> current, List<List<Integer>> results, int sides) {
        if (current.size() == sides) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            generateCombinations(arr, i + 1, current, results, sides);
            current.remove(current.size() - 1); // backtracking...
        }
    }

    //generates all possible combinations of the new dice A
    public static List<List<Integer>> generateCombinationsA(int[] arr, int sides) {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < Math.pow(arr.length, sides); i++) {
            List<Integer> combination = new ArrayList<>();
            int temp = i;
            for (int j = 0; j < sides; j++) {
                combination.add(arr[temp % arr.length]);
                temp /= arr.length;
            }
            results.add(combination);
        }
        return results;
    }

    //compares the probabilities of the new dice A and B with the standard dice
    public static boolean compareProbabilities(List<Integer> combinationA, List<Integer> combinationB, Map<Integer, Integer> targetProbabilities) {
        Map<Integer, Integer> currentProbabilities = calculateProbabilities(combinationA, combinationB);
        return currentProbabilities.equals(targetProbabilities);
    }

    //gives the probability of each sum of the standard dice
    public static Map<Integer, Integer> calculateProbabilities(List<Integer> diceA, List<Integer> diceB) {
        Map<Integer, Integer> probabilities = new HashMap<>();
        for (Integer numA : diceA) {
            for (Integer numB : diceB) {
                int sum = numA + numB;
                if(probabilities.containsKey(sum)){
                    Integer occurence=probabilities.get(sum);
                    probabilities.put(sum,occurence+ 1);
                }else{
                    probabilities.put(sum,1);
                }
                
            }
        }
        return probabilities;
    }
}

