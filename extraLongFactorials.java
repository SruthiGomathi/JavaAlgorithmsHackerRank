/* https://www.hackerrank.com/challenges/extra-long-factorials

The factorial of the integer n, written n!, is defined as:
                       n! = n x (n-1) x  (n-2) x . . . . . . x 3 x 2 x 1
Calculate and print the factorial of a given integer.
For example, if n=30, we calculate 30 x 29 x 28 x .............. x 3 x 2 x 1 and get 265252859812191058636308480000000.

Function Description
Complete the extraLongFactorials function in the editor below. It should print the result and return.
extraLongFactorials has the following parameter(s):
n: an integer

Note: Factorials of n>20 can't be stored even in a 64 - bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.

Input Format
Input consists of a single integer n

Constraints
1 <= n <= 100

Output Format
Print the factorial of n.

Sample Input
25

Sample Output
155112100433309859840000000

Explanation
25! = 25 x 24 x 23 x ....................................... x 3 x 2 x 1 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
//--------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void extraLongFactorials(int n) {
    // Write your code here
        BigInteger factorial = BigInteger.valueOf(1);
        for(int i=n;i>=1;i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}
