package Factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int fact = 1;
        if(N>1){    
            for(int i=1;i<=N;i++){
                fact = fact*i;
            }
        }
        System.out.println(fact);
    }
}
