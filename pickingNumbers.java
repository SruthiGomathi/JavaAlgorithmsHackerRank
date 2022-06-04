/*https://www.hackerrank.com/challenges/picking-numbers/problem

Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.

Example
a= [1,1,2,2,4,4,5,5,5]

There are two subarrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5]. The maximum length subarray has 5 elements.

Function Description
Complete the pickingNumbers function in the editor below.
pickingNumbers has the following parameter(s):
int a[n]: an array of integers

Returns
int: the length of the longest subarray that meets the criterion

Input Format
The first line contains a single integer n, the size of the array a.
The second line contains n space-separated integers, each an a[i].

Constraints
2 <= n <= 100
0 < a[i] < 100
The answer will be >=2.

Sample Input 0
6
4 6 5 3 3 1

Sample Output 0
3

Explanation 0
We choose the following multiset of integers from the array: {4,3,3}. Each pair in the multiset has an absolute difference <= 1 (i.e., |4-3| = 1 and |3-3| = 0), so we print the number of chosen integers, 3, as our answer.

Sample Input 1
6 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
//-----------------------------------------------------------------------------------------------------------------
    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
        HashMap <Integer, Integer> hMap = new HashMap<>();
        int subArraySize = 0;
        hMap.put(a.get(0),1);
        for(int i=1;i<a.size();i++){
            if(hMap.containsKey(a.get(i)))
                hMap.put(a.get(i),hMap.get(a.get(i))+1);    
            else
                 hMap.put(a.get(i),1);
        }
        for(int i=0;i<a.size()-1;i++){
            for(int j=1;j<a.size();j++){
                if(Math.abs(a.get(i)-a.get(j))<=1 && Math.abs(a.get(i)-a.get(j))>0)
                    subArraySize = Math.max(subArraySize,(hMap.get(a.get(i))+hMap.get(a.get(j))));
            }
        }
        return subArraySize;
    }
//-----------------------------------------------------------------------------------------------------------------
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

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
