# Securin_Coding_Assessment
Providing solution for the doomed dice challenge.

PART - A
Objective: To calculate and explain how the total number of possible outcomes i.e) combinations are produced  when rolling two six-sided dice.

Output:

The Doomed Dice Challenge - Part A


--- 1.Total Number Of Combinations Calculation ---
Calculation : The total number of combinations when rolling two dice can be found by multiplying the number of faces on Die A (6) with the number of faces on Die B (6).
Formula: Total Combinations = Faces on Die A * Faces on Die B = 6 * 6
Total combinations possible: 36

--- 2.Explanation of Distribution Calculation ---
To display the distribution of all possible combinations, we will create a matrix where each cell (i,j) represents the face i on Die A and face j on Die B.
Calculation Steps for Distribution: For each die face from 1 to 6 on Die A and Die B, display the possible pairs in matrix format.That is (1,1) , (1,2) , ..., (6,6).

Distribution of all possible combinations:

( 1, 1) ( 1, 2) ( 1, 3) ( 1, 4) ( 1, 5) ( 1, 6) 
( 2, 1) ( 2, 2) ( 2, 3) ( 2, 4) ( 2, 5) ( 2, 6)
( 3, 1) ( 3, 2) ( 3, 3) ( 3, 4) ( 3, 5) ( 3, 6) 
( 4, 1) ( 4, 2) ( 4, 3) ( 4, 4) ( 4, 5) ( 4, 6)
( 5, 1) ( 5, 2) ( 5, 3) ( 5, 4) ( 5, 5) ( 5, 6)
( 6, 1) ( 6, 2) ( 6, 3) ( 6, 4) ( 6, 5) ( 6, 6)

 2  3  4  5  6  7
 3  4  5  6  7  8
 4  5  6  7  8  9
 5  6  7  8  9 10
 6  7  8  9 10 11
 7  8  9 10 11 12 

--- 3.Probability of All Possible Sums with Calculation ---
To calculate the probability of each possible sum (between 2-12), we count how many times each sum appears in the distribution and divide by the total number of combinations.
Formula: Probability of Sum = Count of Sum / Total Combinations
For sum =  2: Count =  1, Probability =  1/36 = 0.0278
For sum =  3: Count =  2, Probability =  2/36 = 0.0556
For sum =  4: Count =  3, Probability =  3/36 = 0.0833
For sum =  5: Count =  4, Probability =  4/36 = 0.1111
For sum =  6: Count =  5, Probability =  5/36 = 0.1389
For sum =  7: Count =  6, Probability =  6/36 = 0.1667
For sum =  8: Count =  5, Probability =  5/36 = 0.1389
For sum =  9: Count =  4, Probability =  4/36 = 0.1111
For sum = 10: Count =  3, Probability =  3/36 = 0.0833
For sum = 11: Count =  2, Probability =  2/36 = 0.0556
For sum = 12: Count =  1, Probability =  1/36 = 0.0278

End of Part A.

PART-B

Objective:
The primary goal of the Undoom_dice program is to find a new set of transformations for two different dice Dice A and Dice B such that, when rolled, the new sets exhibit the same probability distribution of sums as two standard six-sided dice. This involves generating possible combinations for each die, calculating the sum probabilities of each combination, and comparing these probabilities with those of the standard dice to identify matching pairs.

Output:

The Doomed Dice Challenge - Part B

Matching transformations found
Transformed Dice A: [4, 3, 3, 2, 2, 1]
Transformed Dice B: [1, 3, 4, 5, 6, 8]

