package Palindromic_String;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length()-1;
        int i=0;
        int count = 0;
        while(l != 0){
            if(s.charAt(i) == s.charAt(l)){
                count++;
                i++;
                l--;
            }else if(l == s.length()/2){
                count++;
                break;
            }
            else{
                break;
            }
        }
        if(count == s.length()-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
