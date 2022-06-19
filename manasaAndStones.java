/* https://www.hackerrank.com/challenges/manasa-and-stones

Problem Statement
Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. 

Example
n = 2
a = 2
b = 3

She finds 2 stones and their differences are a=2 or b=3. We know she starts with a 0 stone not included in her count. The permutations of differences for the two stones are [2,2], [2,3], [3,2] or [3,3]. Looking at each scenario, stones might have [2,3], [2,5], [3,5] or [3,6] on them. The last stone might have any of 4, 5 or 6 on its face.

Compute all possible numbers that might occur on the last stone given a starting stone with a 0 on it, a number of additional stones found, and the possible differences between consecutive stones. Order the list ascending.

Function Description
Complete the stones function in the editor below.
stones has the following parameter(s):
int n: the number of non-zero stones
int a: one possible integer difference
int b: another possible integer difference

Returns
int[]: all possible values of the last stone, sorted ascending

Input Format
The first line contains an integer T, the number of test cases.
Each test case contains 3 lines:
- The first line contains n, the number of non-zero stones found.
- The second line contains a, one possible difference
- The third line contains b, the other possible difference.

Output Format 
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints 
1 ≤ T ≤10 
1 ≤ n,a,b ≤ 10^3

Sample Input
2
3 
1
2
4
10
100

Sample Output
2 3 4 
30 120 210 300 

Explanation
All possible series for the first test case are given below:
0,1,2
0,1,3
0,2,3
0,2,4
Hence the answer 2 3 4.
Series with different number of final steps for second test case are the following:
0, 10, 20, 30
0, 10, 20, 120
0, 10, 110, 120
0, 10, 110, 210
0, 100, 110, 120
0, 100, 110, 210
0, 100, 

Input Format 
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has3 lines.
The first line contains n (the number of stones). 
The second line contains a, and the third line contains b.200, 210
0, 100, 200, 300
Hence the answer 30 120 210 300.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'stones' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER a
     *  3. INTEGER b
     */
//--------------------------------------------------------------------------------------------------
    public static List<Integer> stones(int n, int a, int b) {
    // Write your code here
        List<Integer> returnList = new ArrayList<>();
        int count = 0;
        for(int i=0;i<n;i++){
            count = (i*a) + (n-i-1)*b;
            if(!returnList.contains(count))
                returnList.add(count);
        }
        Collections.sort(returnList);
        return returnList;
    }
//--------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int a = Integer.parseInt(bufferedReader.readLine().trim());

            int b = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> result = Result.stones(n, a, b);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
