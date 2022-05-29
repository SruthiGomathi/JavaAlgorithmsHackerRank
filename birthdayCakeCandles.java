/*https://www.hackerrank.com/challenges/birthday-cake-candles

You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example
candles = [4,4,1,3]
The maximum height candles are 4 units high. There are 2 of them, so return 2.

Function Description
Complete the function birthdayCakeCandles in the editor below.
birthdayCakeCandles has the following parameter(s):
int candles[n]: the candle heights

Returns
int: the number of candles that are tallest

Input Format
The first line contains a single integer, n, the size of candles[ ].
The second line contains n space-separated integers, where each integer i describes the height of candles[i].

Constraints
1 <= n <= 10^5
1 <= candles[i] <= 10^7

Sample Input 0
4
3 2 1 3

Sample Output 0
2

Explanation 0
Candle heights are [3,2,1,3]. The tallest candles are 3 units, and there are 2 of them. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */
//------------------------------------------------------------------------------------------------------------------------------------------------
    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxSize = candles.get(0),counter=0;
        for(int i=0;i<candles.size();i++){
            if(candles.get(i)>maxSize)
                maxSize = candles.get(i);
        }
        for(int i=0;i<candles.size();i++){
            if(candles.get(i)==maxSize)
                ++counter;
        }
        return counter;

    }
//------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
