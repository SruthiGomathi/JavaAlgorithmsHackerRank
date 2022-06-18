/* https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

David has several containers, each with a number of balls in it. He has just enough containers to sort each type of ball he has into its own container. David wants to sort the balls using his sort method.
David wants to perform some number of swap operations such that:
Each container contains only balls of the same type.
No two balls of the same type are located in different containers.
Example
containers = [[1,4],[2,3]]
David has n=2 containers and 2 different types of balls, both of which are numbered from 0 to n-1 = 1. The distribution of ball types per container

In a single operation, David can swap two balls located in different containers.
In this case, there is no way to have all green balls in one container and all red in the other using only swap operations. Return Impossible.

You must perform q queries where each query is in the form of a matrix, .M For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.

Function Description
Complete the organizingContainers function in the editor below.
organizingContainers has the following parameter(s):
int containter[n][m]: a two dimensional array of integers that represent the number of balls of each color in each container

Returns
string: either Possible or Impossible

Input Format
The first line contains an integer q, the number of queries.
Each of the next q sets of lines is as follows:
- The first line contains an integer n, the number of containers (rows) and ball types (columns).
- Each of the next n lines contains n space-separated integers describing row containers[i].

Constraints
1 <= q <= 10
1 <= n <= 100
0 <= containers[i][j] <= 10^9
Scoring
For 33% of score, 1 <= n <= 10.
For 100% of score, 1 <= n <= 100.

Output Format
For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.

Sample Input 0
2
2
1 1
1 1
2
0 2
1 1

Sample Output 0
Possible
Impossible */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'organizingContainers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts 2D_INTEGER_ARRAY container as parameter.
     */
//-----------------------------------------------------------------------------------------------------------------------
    public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
        List<Integer> rowSum = new ArrayList();
        List<Integer> colSum = new ArrayList();
        for(int i=0;i<container.size();i++){
            int sumRow = 0, sumCol = 0;
            for(int j=0; j<container.size();j++){
                sumRow += container.get(i).get(j);
                sumCol += container.get(j).get(i);
            }
            rowSum.add(sumRow);
            colSum.add(sumCol);
        }
        Collections.sort(rowSum);
        Collections.sort(colSum);
        if(rowSum.equals(colSum))
            return "Possible";
        else
            return "Impossible";
    }
//-----------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> container = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] containerRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> containerRowItems = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowTempItems[j]);
                    containerRowItems.add(containerItem);
                }

                container.add(containerRowItems);
            }

            String result = Result.organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
