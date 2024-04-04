# Securin_Coding_Assessment
Providing solution for the doomed dice challenge.

The Doomed Dice Challenge - Part A
--- 1.Total Number Of Combinations Calculation ---
Calculation: The total number of combinations when rolling two six-sided dice can be calculated by multiplying the number of possible outcomes on the first die (6) with the number of possible outcomes on the second die (6).
Formula: Total Combinations = Faces on Die A * Faces on Die B = 6 * 6
Total combinations possible: 36

--- 2.Explanation of Distribution Calculation ---
To illustrate the distribution of all possible combinations, consider a grid where each cell represents a pair of outcomes (i,j), with i being the outcome on Die A and j being the outcome on Die B. For each die face from 1 to 6 on both Die A and Die B, we list the possible pairs.
Calculation Steps for Distribution: Enumerate each combination from (1,1) to (6,6), showing all possible outcomes.

Distribution of all possible combinations:

(1,1) (1,2) (1,3) (1,4) (1,5) (1,6)  
(2,1) (2,2) (2,3) (2,4) (2,5) (2,6)  
(3,1) (3,2) (3,3) (3,4) (3,5) (3,6)  
(4,1) (4,2) (4,3) (4,4) (4,5) (4,6)  
(5,1) (5,2) (5,3) (5,4) (5,5) (5,6)  
(6,1) (6,2) (6,3) (6,4) (6,5) (6,6)  

--- 3.Probability of All Possible Sums with Calculation ---
The probability of each possible sum (2 through 12) is found by counting how many times each sum appears in the distribution above and dividing by the total number of combinations (36).
![image](https://github.com/raji2764/Securin_Coding_Assessment/assets/114810653/548201d1-ae0f-40a2-87ac-5480ff7e8eca)

End of Part A.

The Doomed Dice Challenge - Part B

Objective:
The primary goal of the Undoom_dice program is to find a new set of transformations for two different dice Dice A and Dice B such that, when rolled, the new sets exhibit the same probability distribution of sums as two standard six-sided dice. This involves generating possible combinations for each die, calculating the sum probabilities of each combination, and comparing these probabilities with those of the standard dice to identify matching pairs.

OUTPUT:

The Doomed Dice Challenge - Part B

Matching transformations found:
Transformed Dice A: [1, 2, 2, 3, 3, 4]
Transformed Dice B: [1, 2, 3, 4, 5, 6]

