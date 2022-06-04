/* https://www.hackerrank.com/challenges/circular-array-rotation/problem

John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Example
a = [3,4,5]
k = 2
queries = [1,2]
Here k is the number of rotations on a, and queries holds the list of indices to report. First we perform the two rotations: [3,4,5] -> [5,3,4] -> [4,5,3]

Now return the values from the zero-based indices 1 and 2 as indicated in the queries array.
a[1] = 5
a[2] = 3

Function Description
Complete the circularArrayRotation function in the editor below.
circularArrayRotation has the following parameter(s):
- int a[n]: the array to rotate
- int k: the rotation count
- int queries[1]: the indices to report

Returns
int[q]: the values in the rotated a as requested in m

Input Format
The first line contains 3 space-separated integers, n, k, and 1, the number of elements in the integer array, the rotation count and the number of queries.
The second line contains  space-separated integers, where each integer i describes array element  a[i] (where 0 <= i < n).
Each of the 1 subsequent lines contains a single integer, queries[i], an index of an element in a to return.

Constraints
1 <= n <= 10^5
1 <= a[i] <= 10^5
1 <= k <= 10^5
1 <= q <= 500
0 <= quueries[i] < n

Sample Input 0
3 2 3
1 2 3
0
1
2

Sample Output 0
2
3
1

Explanation 0
After the first rotation, the array is [3,1,2].
After the second (and final) rotation, the array is [2,3,1].
We will call this final state array b = [2,3,1]. For each query, we just have to get the value of b[queries[i]].
1. queries[0] = 0, b[0] = 2
2. queries[1] = 1, b[1] = 3
3. queries[2] = 2, b[2] = 1 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        Collections.rotate(a,k);
        ArrayList <Integer> queriesArray= new ArrayList<Integer>();
        for(int i=0;i<queries.size();i++){
            queriesArray.add(a.get(queries.get(i)));
        }
        return queriesArray;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int queriesItem = Integer.parseInt(bufferedReader.readLine().trim());
            queries.add(queriesItem);
        }

        List<Integer> result = Result.circularArrayRotation(a, k, queries);

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
