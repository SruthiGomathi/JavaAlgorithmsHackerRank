/* https://www.hackerrank.com/challenges/between-two-sets/problem

There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

Example
a = [2, 6]
b = [24 , 36]
There are two numbers between the arrays: 6 and 12.
6%2 = 0, 6%6 = 0,  and 36%6 =0 for the first value.
12%2 = 0, 12%6 = 0 and , 36%12 = 0 for the second value. Return 2.

Function Description
Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.
getTotalX has the following parameter(s):
int a[n]: an array of integers
int b[m]: an array of integers

Returns
int: the number of integers that are between the sets

Input Format
The first line contains two space-separated integers, n and m, the number of elements in arrays a and b.
The second line contains n distinct space-separated integers a[i] where 0 <=i < n.
The third line contains m distinct space-separated integers b[j] where 0 <= j < m.

Constraints
1 <= n,m <=10
1 <= a[i] <=100
1 <= b[j] <= 100

Sample Input
2 3
2 4
16 32 96

Sample Output
3

Explanation
2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.
4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
//------------------------------------------------------------------------------------------------
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
                int count = 0,bCount=0,aCount=0;
                for(int i=a.get(a.size()-1);i<=b.get(0);i++){
                    boolean flag = false;
                    for(int j=0;j<b.size();j++){
                        if(b.get(j)%i == 0)
                            ++bCount;
                        if(bCount == b.size()){
                            for(int k=0;k<a.size();k++){
                                if(i%a.get(k)==0)
                                    ++aCount;
                                if(aCount == a.size())
                                    flag = true;
                            }
                        }
                    }
                    
                    if(flag)
                        ++count;
                }
                return count;
    }
//------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
