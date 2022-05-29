/*https://www.hackerrank.com/challenges/the-birthday-bar/problem

Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example
s = [2,2,1,3,2]
d = 4
m = 2
Lily wants to find segments summing to Ron's birth day, d=4 with a length equalling his birth month, m=2. In this case, there are two segments meeting her criteria: [2,2] and [1,3].

Function Description

Complete the birthday function in the editor below.
birthday has the following parameter(s):
- int s[n]: the numbers on each of the squares of chocolate
- int d: Ron's birth day
- int m: Ron's birth month
Returns

int: the number of ways the bar can be divided
Input Format

The first line contains an integer n, the number of squares in the chocolate bar.
The second line contains n space-separated integers s[i], the numbers on the chocolate squares where 0<=i<n.
The third line contains two space-separated integers,  d and m, Ron's birth day and his birth month.

Constraints
1<=n<=100
1<=s[i]<=5, where (0<=i<n)
1<=d<=31
1<=m<=12

Sample Input 0
5
1 2 1 3 2
3 2

Sample Output 0
2

Explanation 0
Lily wants to give Ron m=2 squares summing to d=3. The following two segments meet the criteria:

1 2 1 3 2
1+2 = 3
2+1 = 3

Sample Input 1

6
1 1 1 1 1 1
3 2
Sample Output 1

0
Explanation 1

Lily only wants to give Ron m=2 consecutive squares of chocolate whose integers sum to d=3. There are no possible pieces satisfying these constraints:

1 1 1 1 1 1

Thus, we print 0 as our answer.

Sample Input 2
1
4
4 1

Sample Output 2
1

Explanation 2
Lily only wants to give Ron  m=1 square of chocolate with an integer value of d=4. Because the only square of chocolate in the bar satisfies this constraint, we print 1 as our answer.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
        int count = 0;
        for(int i=0;i<s.size()-m+1;i++){
            int temp = 0;
            for(int j=i;j<i+m;j++){
                temp += s.get(j);
            }
            if(temp == d)
                count++;
        }
        return count;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sTemp[i]);
            s.add(sItem);
        }

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
