package Number_of_steps;

import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class steps {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = sc.nextInt();
        int min = a[0];
        for(int i=1;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i] < min){
                min = a[i];
            }
        }
        for(int j=0;j<n;j++){
            b[j] = sc.nextInt();
        }
        int count=0;
        boolean notequal = true;
        while(notequal){
            notequal = false;
            for(int k=0;k<n;k++){
                while(a[k] > min && b[k] != 0){
                    a[k] = a[k] - b[k];
                    count++;
                }
                //System.out.print(a[k]+" ");
                if(a[k] != min && a[k] < min && min >= 0){
                    min = a[k];
                    notequal = true;
                   // System.out.println("Min = "+min);
                }
                if(min < 0){
                   // System.out.println("Min is negative");
                    notequal = false;
                    count = -1;
                }
            }
        } 
       // System.out.println(min);
        System.out.println(count);
    }
}

