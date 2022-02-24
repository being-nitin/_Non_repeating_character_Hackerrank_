package com.Recursion;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        shelly has been given a stream of characters and she has to find first non repeating character each time a character is inserted to the stream.
        Example:
        Input : aabc
        Output : a -1 b b
        Input Format
        a-z lowercase characters

        Constraints
        Should be memory efficient
        Output Format
        print -1 if queue is empty or print first non repeating character.

        Sample Input 0

        aac
        Sample Output 0
        a -1 c
         */

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        firstNonRepeat(str);
    }
    public static void firstNonRepeat(String str){
        int[] charCount = new int[26];
        Queue<Character> q = new LinkedList<Character>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            charCount[ch-'a']++;
            while(!q.isEmpty()){
                if(charCount[q.peek()-'a']>1){
                    q.remove();
                }
                else{
                    System.out.print(q.peek()+" ");
                    break;
                }
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }

        }
        System.out.println();
    }
}