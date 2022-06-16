/* https://www.hackerrank.com/challenges/permutation-equation

Given a sequence of n integers, p(1),p(2),....p(n) where each element is distinct and satisfies 1 <= p(x) <= n. For each x where 1<= x <= n, that is x increments from 1 to n, find any integer y such that p(p(y)) and keep a history of the values of y in a return array.

Example
p = [5,2,1,3,4]

Each value of x between 1 and 5, the length of the sequence, is analyzed as follows:
1. x=1 = p[3],p[4] = 3, so p[p[4]] = 1
1. x=2 = p[2],p[2] = 2, so p[p[2]] = 2
1. x=3 = p[4],p[5] = 4, so p[p[5]] = 3
1. x=4 = p[5],p[1] = 5, so p[p[1]] = 4
1. x=5 = p[1],p[3] = 1, so p[p[3]] = 5
The values for y are [4,2,5,1,3].

Function Description
Complete the permutationEquation function in the editor below.
permutationEquation has the following parameter(s):
int p[n]: an array of integers

Returns
int[n]: the values of y for all x in the arithmetic sequence 1 to n

Input Format
The first line contains an integer n, the number of elements in the sequence.
The second line contains n space-separated integers p[i] where 1 <= i <=n.

Constraints
1 <= n <= 50
1 <= p[i] <= 50, where 1 <= i <= n.
Each element in the sequence is distinct.

Sample Input 0
3
2 3 1

Sample Output 0
2
3
1

Explanation 0
Given the values of p(1) = 2, p(2) = 3, and p(3) = 1, we calculate and print the following values for each  x from 1 to n:
1. x = 1 = p(3) = p(p(2)) = p(p(y)), so we print the value of y=2 on a new line.
1. x = 2 = p(1) = p(p(3)) = p(p(y)), so we print the value of y=3 on a new line.
3. x = 3 = p(2) = p(p(1)) = p(p(y)), so we print the value of y=1 on a new line.

Sample Input 1
5
4 3 5 1 2

Sample Output 1
1
3
5
4
2 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */
//--------------------------------------------------------------------------------------------------------------------------
    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
        List<Integer> returnList = new ArrayList<>();
        for(int i=1;i<=p.size();i++){
            int index = p.indexOf(i);
            returnList.add(p.indexOf(index+1)+1);
        }
        return returnList;
    }
//--------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] pTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pTemp[i]);
            p.add(pItem);
        }

        List<Integer> result = Result.permutationEquation(p);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

