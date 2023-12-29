package Ali_and_Helping_innocent_people;

import java.util.Scanner;

public class people {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if((input.charAt(0)+input.charAt(1))%2 == 0){
            if(input.charAt(2)=='A'||input.charAt(2)=='E'||input.charAt(2)=='I'||input.charAt(2)=='O'||input.charAt(2)=='U'||input.charAt(2)=='Y'){
                System.out.println("invalid");
            }else{
                if((input.charAt(3)+input.charAt(4))%2 == 0){
                    if((input.charAt(4)+input.charAt(5))%2==0){
                        if((input.charAt(7)+input.charAt(8))%2==0){
                            System.out.println("valid");
                        }else{
                            System.out.println("invalid");
                        }
                    }else{
                        System.out.println("invalid");
                    }
                }else{
                    System.out.println("invalid");
                }
            }
        }else{
            System.out.println("invalid");
        }
    }
}
