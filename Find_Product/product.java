package Find_Product;

import java.util.Scanner;

public class product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double answer = 1;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            answer = (answer * arr[i])%(power(10,9)+7);
        }
       int result = (int)answer;
        System.out.println(result);
    }

    public static double power(int base,int exponent){
        if(exponent == 0){
            return 1;
        }else{
            return base * power(base, exponent-1);
        }
    }

}
