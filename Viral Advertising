/* https://www.hackerrank.com/challenges/strange-advertising/problem

HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly 5 people on social media.

On the first day, half of those 5 people (i.e., floor(5/2) =2) like the advertisement and each shares it with 3 of their friends. At the beginning of the second day,  florr(5/2)x3 = 2x3 = 6 people receive the advertisement.

Each day, floor(recipients/2) of the recipients like the advertisement and will share it with 3 friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day 1.

Example
n=5

Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24
The progression is shown above. The cumulative number of likes on 5th the  day is 24.

Function Description
Complete the viralAdvertising function in the editor below.
viralAdvertising has the following parameter(s):
- int n: the day number to report

Returns
int: the cumulative likes at that day

Input Format
A single integer, n, the day number.

Constraints
1 <= n <=50

Sample Input
3

Sample Output
9

Explanation
2 people liked the advertisement on the first day,  3 people liked the advertisement on the second day and 4 people liked the advertisement on the third day, so the answer is 2+3+4=9.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
//-------------------------------------------------------------------------------
    public static int viralAdvertising(int n) {
    // Write your code here
        int sum = 0;
        int temp = 5;
        for(int i=0;i<n;i++){
            temp = temp/2;
            sum += temp;
            temp *= 3;
        }
        return sum;
    }
//-------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
