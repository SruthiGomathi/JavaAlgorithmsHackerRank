/* https://www.hackerrank.com/challenges/the-time-in-words

Given the time in numerals we may convert it into words, as shown below:
        5:00 -> five o' clock
        5:01 -> one minute past five
        5:10 -> ten minutes past five
        5:15 -> quarter past five
        5:30 -> half past five
        5:40 -> twenty minutes to five
        5:45 -> quarter to six
        5:47 -> thirteen minutes to six
        5:28 -> twenty eight minutes past five

At minutes = 0, use o' clock. For 1 <= minutes <= 30, use past, and for 30<minutes use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.

Function Description
Complete the timeInWords function in the editor below.
timeInWords has the following parameter(s):
int h: the hour of the day
int m: the minutes after the hour

Returns
string: a time string as described

Input Format
The first line contains h, the hours portion The second line contains m, the minutes portion

Constraints
1 <= h <= 12
0 <= m < 60

Sample Input 0
5
47

Sample Output 0
thirteen minutes to six

Sample Input 1
3
00

Sample Output 1
three o' clock

Sample Input 2
7
15

Sample Output 2
quarter past seven */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */
//---------------------------------------------------------------------------------------------------------------------------
    public static String timeInWords(int h, int m) {
    // Write your code here
        HashMap <Integer,String> clockInWords = new HashMap <Integer,String>();
        clockInWords.put(1,"one");
        clockInWords.put(2,"two");
        clockInWords.put(3,"three");
        clockInWords.put(4,"four");
        clockInWords.put(5,"five");
        clockInWords.put(6,"six");
        clockInWords.put(7,"seven");
        clockInWords.put(8,"eight");
        clockInWords.put(9,"nine");
        clockInWords.put(10,"ten");
        clockInWords.put(11,"eleven");
        clockInWords.put(12,"twelve");
        clockInWords.put(13,"thirteen");
        clockInWords.put(14,"fourteen");
        clockInWords.put(15,"quarter");
        clockInWords.put(16,"sixteen");
        clockInWords.put(17,"seventeen");
        clockInWords.put(18,"eighteen");
        clockInWords.put(19,"nineteen");
        clockInWords.put(20,"twenty");
        clockInWords.put(30,"half");
        clockInWords.put(21,"twenty one");
        clockInWords.put(22,"twenty two");
        clockInWords.put(23,"twenty three");
        clockInWords.put(24,"twenty four");
        clockInWords.put(25,"twenty five");
        clockInWords.put(26,"twenty six");
        clockInWords.put(27,"twenty seven");
        clockInWords.put(28,"twenty eight");
        clockInWords.put(29,"twenty nine");
        if(m == 0){
            return clockInWords.get(h)+" o' clock";
        }
        else if(m > 30){
            if(h != 12){
                if(m != 45)
                return clockInWords.get(60-m) + " minutes to " + clockInWords.get(h+1);
            else
                return clockInWords.get(15) + " to " + clockInWords.get(h+1);
            }
            else{
                if(m != 45)
                return clockInWords.get(60-m) + " minutes to " + clockInWords.get(1);
            else
                return clockInWords.get(15) + " to " + clockInWords.get(1);
            }
        }
        else{
            if(m==1)
                return clockInWords.get(m) +" minute past " + clockInWords.get(h);
            else if(m != 15 && m!= 30){
              //alternative method for 20 plus numbers....
                if(m>20)
                    return clockInWords.get(20) + " " + clockInWords.get((m%10)) + " minutes past " + clockInWords.get(h);
                else
                    return clockInWords.get(m) + " minutes past " + clockInWords.get(h);
            }
            else
                return clockInWords.get(m) + " past " + clockInWords.get(h);
            
        }
    }
//---------------------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
