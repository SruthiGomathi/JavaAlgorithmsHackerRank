/*https://www.hackerrank.com/challenges/utopian-tree/problem

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after n growth cycles?

For example, if the number of growth cycles is n=5, the calculations are as follows:

Period  Height
0          1
1          2
2          3
3          6
4          7
5          14
Function Description

Complete the utopianTree function in the editor below.

utopianTree has the following parameter(s):

int n: the number of growth cycles to simulate
Returns

int: the height of the tree after the given number of cycles

Input Format
The first line contains an integer, t, the number of test cases.
t subsequent lines each contain an integer, n, the number of cycles for that test case.

Constraints
1<=t<=10
0<=n<=60

Sample Input
3
0
1
4
Sample Output

1
2
7
Explanation

There are 3 test cases.

In the first case (n=0), the initial height (H=1) of the tree remains unchanged.

In the second case (n=1), the tree doubles in height and is 2 meters tall after the spring cycle.

In the third case (n=4), the tree doubles its height in spring (n=1,H=2 ), then grows a meter in summer (n=2,H=3 ), then doubles after the next spring (n=3,H=6), and grows another meter after summer (n=4,H=7 ). Thus, at the end of 4 cycles, its height is 7 meters.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
//--------------------------------------------------------------------------------------------------------------------------------------------------   
    public static int utopianTree(int n) {
    // Write your code here
        int height=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                height = height+1;
            }
            else
                height = height*2;
        }
        return height;
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
