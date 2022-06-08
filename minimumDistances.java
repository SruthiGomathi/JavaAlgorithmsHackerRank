/* https://www.hackerrank.com/challenges/minimum-distances/problem

The distance between two array values is the number of indices between them. Given a, find the minimum distance between any pair of equal elements in the array. If no such value exists, return -1.

Example
a = [3 ,2, 1, 2, 3]
There are two matching pairs of values: 3 and 2. The indices of the 3's are i=0 and j=4, so their distance is  d[i,j] = |j - i| = 4. The indices of the 2's are i = 1 and j = 3, so their distance is d[i,j] = |j - i|. = 2 The minimum distance is 2.

Function Description
Complete the minimumDistances function in the editor below.
minimumDistances has the following parameter(s):
int a[n]: an array of integers

Returns
int: the minimum distance found or [-1 if there are no matching elements

Input Format
The first line contains an integer n, the size of array a.
The second line contains n space-separated integers a[i].

Constraints
1 <= n <= 10^3
1 <= a[i[ < 10^5

Output Format
Print a single integer denoting the minimum d[i,j] in a. If no such value exists, print -1.

Sample Input
STDIN               Function
-----                 --------
6                    arr[] size n = 6
7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]

Sample Output
3

Explanation
There are two pairs to consider:
a[1] and a[4] are both 1, so d[1,4] = |1 - 4| = 3.
a[0] and a[5] are both 7, so d[0,5] = |0 - 5| = 5.
The answer is min(3,5) = 3. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
//-------------------------------------------------------------------------------------------------------------------------------------------
    public static int minimumDistances(List<Integer> a) {
    // Write your code here
        int minDistance = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int currentIndex = 0, previousIndex = 0;
        for(int i=0;i<a.size();i++){
             if (hmap.containsKey(a.get(i))) {
                currentIndex = i;
 
                // Fetch the previous index from map.
                previousIndex = hmap.get(a.get(i));
 
                // Find the minimum distance.
                minDistance
                    = Math.min(
                        (currentIndex - previousIndex),
                        minDistance);
            }
 
            // Update the map.
            hmap.put(a.get(i), i);
        }
        return (
            minDistance == Integer.MAX_VALUE
                ? -1
                : minDistance);
        }
//-------------------------------------------------------------------------------------------------------------------------------------------    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
