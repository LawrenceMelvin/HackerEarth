package Split_houses;

import java.util.Scanner;

public class houses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String village = sc.next();
        //char[] house = new char[n];
        for(int i=0;i<=village.length()-1;i++){
           // house[i] = village.charAt(i);
            if(i==village.length()-1){
                System.out.println("YES");
                village = village.replace('.', 'B');
                System.out.println(village);
            }else if(village.charAt(i)== 'H' && village.charAt(i+1)=='H'){
                System.out.println("NO");
                break;
            }
        }
        /*
        for(int j=0;j<house.length;j++){
            System.out.print(house[j] + " "); 
        }
         */
    }
}
