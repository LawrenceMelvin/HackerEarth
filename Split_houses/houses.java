package Split_houses;

import java.util.Scanner;

public class houses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String village = sc.next();
        char[] house = new char[n];
        for(int i=0;i<village.length();i++){
            house[i] = village.charAt(i);
            if(house[i] == '.'){
                house[i] = 'B';
            }
        }
        for(int j=0;j<house.length;j++){
            System.out.print(house[j] + " "); 
        }
    }
}
