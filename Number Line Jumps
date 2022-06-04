/*https://www.hackerrank.com/challenges/kangaroo/problem

You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

 - The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 - The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.

You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
Example
x1 = 2
v1 = 1
x2 = 1
v2 = 2
After one jump, they are both at x=3, (x1 + v1 = 2 + 1, x2 + v2 = 1 + 2), so the answer is YES.

Function Description
Complete the function kangaroo in the editor below.
kangaroo has the following parameter(s):
int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2

Returns
string: either YES or NO

Input Format
A single line of four space-separated integers denoting the respective values of x1, v1, x2, and v2.

Constraints
0 <= x1 < x2 <=10000
1 <= v1 <= 10000
1 <= v2 <= 10000

Sample Input 0
0 3 4 2

Sample Output 0
YES

Explanation 0
The two kangaroos jump through the following sequence of locations:
Kangaroo 2:          4  6  8  10  12
Kangaroo 1 :   0   3   6     9      12

From the image, it is clear that the kangaroos meet at the same location (number 12 on the number line) after same number of jumps (4 jumps), and we print YES.

Sample Input 1
0 2 5 3

Sample Output 1
NO

Explanation 1
The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., x2>x1 ). Because the second kangaroo moves at a faster rate (meaning v2>v1) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up. Thus, we print NO. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */
//----------------------------------------------------------------------------------------------------
    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if((x1<x2 && v1<v2)||(x1>x2 && v1>v2)){
            return "NO";
        }
        else{
        int startx1 = x1+v1,startx2 = x2+v2;
        for(int i=0;i<=(x1+v1)*(x2+v2);i++){
            if((startx1 + (i*v1)) == (startx2 + (i*v2))){
                return "YES";
            }
               
        }
        }
        return "NO";
    }
//----------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
