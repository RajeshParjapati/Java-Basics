package com.basic.algo.search;

import java.io.*;
import java.util.Stack;


class Result {

    /*
     * Complete the 'compareStrings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int compareStrings(String s1, String s2) {
    // Write your code here
    String s11="", s22="";
    
    s11= finalString(s1);
    s22= finalString(s2);
    
 
        if(s11.equalsIgnoreCase(s22)) {
        	System.out.println("from compare else if ==1  ");
            return 1;
        }else {
        	System.out.println("from compare  else == 0");
        	return 0;
        }

    }
    
    public static  String finalString(String s1){
        String s11="";
        Stack<Character> charStck = new Stack<>();
        
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)!='#'){
                charStck.push(s1.charAt(i));
            }
            if(s1.charAt(i)=='#' && charStck.size()>0){
                charStck.pop();
            }
        }
        for(Character c : charStck){
            s11 = s11+c.toString();
           // System.out.println(c.toString());
        }
        System.out.println("heelo");  
        System.out.println(s11);
        return s11;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 ="yq#pp##pp#"; //bufferedReader.readLine();

        String s2 ="ya#qqq###pp##p"; //bufferedReader.readLine();

        int result = Result.compareStrings(s1, s2);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
        System.out.println("result  : "+result);
    }
}