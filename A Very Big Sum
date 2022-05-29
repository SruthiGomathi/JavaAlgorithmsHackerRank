/* https://www.hackerrank.com/challenges/a-very-big-sum/problem

In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):
int ar[n]: an array of integers .

Return
long: the sum of all array elements

Input Format
The first line of the input consists of an integern .
The next line contains n space-separated integers contained in the array.

Output Format
Return the integer sum of the elements in the array.

Constraints
1 <=n <= 10
0 <= ar[i] <= 10^10

Sample Input
5
1000000001 1000000002 1000000003 1000000004 1000000005

Output
5000000015

Note:
The range of the 32-bit integer is (-2^31) to (2^31-1).
When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */
//---------------------------------------------------------------------------------------------------------------------------------------------------------
    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
        long sum = 0;
        for(int i=0;i<ar.size();i++){
            sum+=ar.get(i);
        }
        return sum;
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
