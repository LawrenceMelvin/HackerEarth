package Zoos;

import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class zoos {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        if(t.length()<=20){
            int z_count= 0;
            int o_count = 0;
            for(int i=0;i<t.length();i++){
                if(t.charAt(i)=='z'){
                    z_count++;
                }else if(t.charAt(i)=='o'){
                    o_count++;
                }
            }
            if(o_count == 2*z_count){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}
