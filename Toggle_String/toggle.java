package Toggle_String;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = new char[s.length()];
        for(int i =0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                a[i] = Character.toLowerCase(s.charAt(i));
            }else{
                a[i] = Character.toUpperCase(s.charAt(i));
            }
            System.out.print(a[i]);
        }
    }
}
