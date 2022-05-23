/*https://www.hackerrank.com/challenges/sock-merchant/problem

There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example
n=7
ar = [1,2,1,2,1,3,2]

There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock

Returns
int: the number of pairs

Input Format
The first line contains an integer n, the number of socks represented in ar.
The second line contains n space-separated integers, ar[i], the colors of the socks in the pile.

Constraints
1<=n<=100
1<=ar[i]<=100 where 
0<=i<n

Sample Input

STDIN                                   Function
-----                                      --------
9                                             n = 9
10 20 20 10 10 30 50 10 20   ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3

Explanation
10->10, 10->10, 20-20
There are three pairs of socks.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
            List <Integer> matchSock = new ArrayList<Integer>();
            int matchCount=0;
            matchSock.add(ar.get(0));
            for(int i=1;i<ar.size();i++){
                boolean flag = true;
                for(int j=0;j<matchSock.size();j++){
                    if(ar.get(i) == matchSock.get(j)){
                         matchSock.remove(j);
                         ++matchCount;
                         flag = false;
                    }
                }
                if(flag)
                    matchSock.add(ar.get(i));
            }
            return matchCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
