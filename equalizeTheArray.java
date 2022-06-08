/* https://www.hackerrank.com/challenges/equality-in-a-array

Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.

Example
arr = [1, 2, 2, 3]

Delete the 2 elements 1 and 3 leaving  arr = [2,2]. If both twos plus either the 1 or the 3 are deleted, it takes 3 deletions to leave either [3] or [1]. The minimum number of deletions is 2.

Function Description
Complete the equalizeArray function in the editor below.
equalizeArray has the following parameter(s):
int arr[n]: an array of integers

Returns
int: the minimum number of deletions required

Input Format
The first line contains an integer n, the number of elements in arr.
The next line contains n space-separated integers arr[i].

Constraints
1 <= n <= 100
1 <= arr[i] <= 100

Sample Input
STDIN           Function
-----               --------
5                   arr[] size n = 5
3 3 2 1 3        arr = [3, 3, 2, 1, 3]

Sample Output
2   

Explanation
Delete arr[2] = 2 and arr[3] = 1 to leave arr' = [3, 3, 3]. This is minimal. The only other options are to delete  elements to get an array of either [1] or [2]. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
//----------------------------------------------------------------------------------------------------------------------------------------
    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
        int n = arr.size(), maxFreq =1;
        HashMap <Integer, Integer> hMap= new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(hMap.containsKey(arr.get(i))){
                hMap.put(arr.get(i),(hMap.get(arr.get(i))+1));
                if(hMap.get(arr.get(i)) > maxFreq)
                    maxFreq = hMap.get(arr.get(i));
            }
            else{
                hMap.put(arr.get(i),1);
            }
        }
        //System.out.println(hMap);
        return n - maxFreq;
    }
//----------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
