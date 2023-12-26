package Seven_Segment_Display;

import java.util.Scanner;

public class displaystr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //String inpString = "";
        for(int i=0;i<T;i++){
            String inpString = sc.next();
            int segment = 0;
            //System.out.println("The string is:");
            for(int j=0;j<inpString.length();j++){
                //System.out.print(inpString.charAt(j));
                if(inpString.charAt(j) == '0' || inpString.charAt(j) == '6' || inpString.charAt(j)=='9'){
                    segment = segment+6;
                }
                if(inpString.charAt(j)=='1'){
                    segment = segment+2;
                }
                if(inpString.charAt(j)=='2' || inpString.charAt(j)=='3' || inpString.charAt(j)=='5'){
                    segment = segment+5;
                }
                if(inpString.charAt(j)=='4'){
                    segment = segment+4;
                }
                if(inpString.charAt(j)=='7'){
                    segment = segment+3;
                }
                if(inpString.charAt(j)=='8'){
                    segment = segment+7;
                }
            }
            //System.out.println("Segment = "+segment);
            int high = 2;
            String str ="1";
            //int high_rem = (segment%high)-1;
            int high_quo = segment/high;
            int other = 0;
            if(segment%high != 0){
                high_quo = high_quo-1;
                other = 2*high_quo;
                other = segment-other;
            }
            String adde="";
            switch (other) {
                case 3:
                    adde = "7";
                    break;
                default:
                    break;
            }
            System.out.println(adde+str.repeat(high_quo));
        }
       // System.out.println("The String is:");
    }
}
