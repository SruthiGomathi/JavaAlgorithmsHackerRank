/* https://www.hackerrank.com/challenges/repeated-string/problem

There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string.

Example
s = 'abcac'
n = 10
The substring we consider is abcacabcac, the first 10 characters of the infinite string. There are  4 occurrences of a in the substring.

Function Description
Complete the repeatedString function in the editor below.
repeatedString has the following parameter(s):
s: a string to repeat
n: the number of characters to consider

Returns
int: the frequency of a in the substring

Input Format
The first line contains a single string, s.
The second line contains an integer, n.

Constraints
1 <= |s| <= 100
1 <= n <= 10^12
For 25% of the test cases, n <= 10^6.

Sample Input
Sample Input 0
aba
10

Sample Output 0
7

Explanation 0
The first n=10 letters of the infinite string are abaabaabaa. Because there are7  a's, we return 7.

Sample Input 1
a
1000000000000

Sample Output 1
1000000000000

Explanation 1
Because all of the first n=1000000000000 letters of the infinite string are a, we return 1000000000000. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */
//-----------------------------------------------------------------------------------------------------------------
    public static long repeatedString(String s, long n) {
    // Write your code here
        long count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }
        if(s.length() != 0){
            count = count * (n/s.length());
            for(int j=0;j<n % s.length();j++){
                if(s.charAt(j) == 'a'){
                   ++count;
                }
            }
        }
        return count;
    }
//-----------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
