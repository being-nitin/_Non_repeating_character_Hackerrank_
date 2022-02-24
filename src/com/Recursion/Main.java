package com.Recursion;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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