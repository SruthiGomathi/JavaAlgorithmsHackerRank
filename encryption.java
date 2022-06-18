/* https://www.hackerrank.com/challenges/encryption/problem

An English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let L be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:
[sqrt L] <= row <= column <= [sqrt L], where [x] is floor function and [x] is ceil funtion

Example
s= if man was meant to stay on the ground god would have given us roots
After removing spaces, the string is 54 characters long. sqrt 54 is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  
meanttos       
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots

Ensure rows x columns >= L that if multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. .
The encoded message is obtained by displaying the characters of each column, with a space between column texts. The encoded message for the grid above is:
imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
Create a function to encode a message.

Function Description
Complete the encryption function in the editor below.
encryption has the following parameter(s):
string s: a string to encrypt

Returns
string: the encrypted string s

Input Format
One line of text, the string s

Constraints
1 <= length of s <= 81
s contains characters in the range ascii[a-z] and space, ascii(32).

Sample Input
haveaniceday
 
Sample Output 0
hae and via ecy

Sample Input 1
feedthedog    

Sample Output 1
fto ehg ee dd

Sample Input 2
chillout

Sample Output 2
clu hlt io */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
//--------------------------------------------------------------------------------------------------------------
    public static String encryption(String s) {
    // Write your code here
        s = s.replaceAll(" ", "");
        double squareLength = Math.sqrt(s.length());
        float row = (float)Math.floor(squareLength);
        float column = (float) Math.ceil(squareLength);
        if(row*column < s.length()){
            ++row;
        }
        int charCount = 0;
        StringBuffer returnString = new StringBuffer();
        List<String> stringList = new ArrayList<>();
        for(int i=0;i<row;i++){
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<column && charCount<s.length();j++){
                sb.append(s.charAt(charCount));
                ++charCount;
            }
            stringList.add(sb.toString());
        }
        System.out.println(stringList +" " + stringList.size());
        for(int i=0;i<column;i++){
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<stringList.size();j++){
                if(i<stringList.get(j).length()){
                    sb.append(stringList.get(j).charAt(i));
                }
            }
            returnString.append(sb+" ");
        }
        return returnString.toString();
    }
//--------------------------------------------------------------------------------------------------------------
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
