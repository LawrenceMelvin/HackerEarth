package Best_Index;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split("\\s+");
        long a[] = new long[s.length];
       // a[0] = Long.parseLong(s[0]);
        for(int i =0;i<s.length;i++){
            //s[i] = sc.next().split("\\s+");
            a[i] = Long.parseLong(s[i]);
        }
        long max = Long.MIN_VALUE;
        for(int j=0;j<a.length;j++){
            long addition = 0;
            int counter = 1;
            int b = j;
            while (b < a.length) {
                long next_add = 0;
                if(b>j){
                    counter++;
                    //System.out.println("Counter = "+counter);
                }else{
                    addition = addition+a[b];
                   // System.out.println("Addition = "+addition);
                }
                if(counter > 1 && (b+counter) <= a.length){
                    for(int k=0;k<counter;k++){
                        next_add = next_add + a[b];
                        b++;
                    }
                }
                else if((b+counter) > a.length){
                    break;
                }
                else{
                    b++;
                }
                addition = addition + next_add;
               //System.out.println("B = "+b);
            }
            //System.out.println("For index "+j+":"+addition);
            if(addition > max){
                max = addition;
            }
        }
        System.out.println(max);
    }
}
