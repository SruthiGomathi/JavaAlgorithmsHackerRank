/* https://www.hackerrank.com/challenges/find-digits/problem

An integer d is a divisor of an integer n if the remainder of n/d = 0.
Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Example
n = 124
Check whether 1, 2 and 4 are divisors of 124. All 3 numbers divide evenly into 124 so return 3.
n = 111
Check whether 1, 2, and 4 are divisors of 111. All 3 numbers divide evenly into 111 so return 3.
n = 10
Check whether 1 and 0 are divisors of 10. 1 is, but 0 is not. Return 1.

Function Description
Complete the findDigits function in the editor below.
findDigits has the following parameter(s):
int n: the value to analyze

Returns
int: the number of digits in n that are divisors of n

Input Format
The first line is an integer, t, the number of test cases.
The t subsequent lines each contain an integer, n.

Constraints
1 <= t <= 15
0 < n < 10^9

Sample Input
2
12
1012

Sample Output
2
3

Explanation
The number 12 is broken into two digits, 1 and 2. When 12 is divided by either of those two digits, the remainder is 0 so they are both divisors.

The number 1012 is broken into four digits, 1, 0, 1, and 2. 1012 is evenly divisible by its digits 1, 1, and 2, but it is not divisible by 0 as division by zero is undefined. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
//-----------------------------------------------------------------------------------------------------------------------------------------------------
    public static int findDigits(int n) {
    // Write your code here
        int temp = n,count = 0;
        while(temp>0){
            int lastDigit = temp%10;
            if(lastDigit != 0 ){
                if(n%lastDigit == 0)
                    ++count;
            }
            temp = temp/10;
        }
        return count;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
