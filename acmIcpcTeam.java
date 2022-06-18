/* https://www.hackerrank.com/challenges/acm-icpc-team/problem

There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a number of topics. Given a list of topics known by each attendee, presented as binary strings, determine the maximum number of topics a 2-person team can know. Each subject has a column in the binary string, and a ‘1’ means the subject is known while ‘0’ means it is not. Also determine the number of teams that know the maximum number of topics. Return an integer array with two elements. The first is the maximum number of topics known, and the second is the number of teams that know that number of topics.

Example
n=3
topics = [‘10101’,’11110’,’00010’]
The attendee data is aligned for clarity below:
10101
11110
00010
These are all possible teams that can be formed:
Members Subjects
(1,2)   [1,2,3,4,5]
(1,3)   [1,3,4,5]
(2,3)   [1,2,3,4]
In this case, the first team will know all 5 subjects. They are the only team that can be created that knows that many subjects, so [5,1] is returned.

Function Description
Complete the acmTeam function in the editor below.
acmTeam has the following parameter(s):
string topic: a string of binary digits

Returns
int[2]: the maximum topics and the number of teams that know that many topics

Input Format
The first line contains two space-separated integers n and m, where n is the number of attendees and m is the number of topics.
Each of the next n lines contains a binary string of length m.

Constraints
2 <= n <= 500
1 <= m <= 500

Sample Input
4 5
10101
11100
11010
00101

Sample Output
5
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
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
        List<Integer> returnList = new ArrayList<>();
        int maximumSubject = 0, teamsCount = 0;
        for(int i=0;i<topic.size()-1;i++){
            for(int j=i+1;j<topic.size();j++){
                int subjectKnown = 0;
                for(int k=0;k<topic.get(0).length();k++){
                    if((Character.toString(topic.get(i).charAt(k))).equals("1") || ((Character.toString(topic.get(j).charAt(k))).equals("1")))
                        ++subjectKnown;
                }
                if(maximumSubject<subjectKnown){
                    maximumSubject = subjectKnown;
                    teamsCount = 1;
                }
                else if(maximumSubject == subjectKnown ){
                    ++teamsCount;
                }
                    
            }
        }
        returnList.add(maximumSubject);
        returnList.add(teamsCount);
        return returnList;
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String topicItem = bufferedReader.readLine();
            topic.add(topicItem);
        }

        List<Integer> result = Result.acmTeam(topic);

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
