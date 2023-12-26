package Seven_Segment_Display;
//This solution works if N in an integer
/*But if the input is given as String or the if the lenght of the 
number is greater than the integer type this code will not work
*/
import java.util.Scanner;

public class display {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0;i<T;i++){
            int segment = 0;
            int N = sc.nextInt();
            if(N == 0){
                segment = 6;
            }else{
                while (N>0) {
                int rem = N%10;
                switch (rem) {
                case 0:
                    segment = segment+6;
                    break;
                case 1:
                    segment = segment+2;
                    break;
                case 2:
                    segment = segment+5;
                    break;
                case 3:
                    segment = segment+5;
                    break;
                case 4:
                    segment = segment+4;
                    break;
                case 5:
                    segment = segment+5;
                    break;
                case 6:
                    segment = segment+6;
                    break;
                case 7:
                    segment = segment+3;
                    break;
                case 8:
                    segment = segment+7;
                    break;
                case 9:
                    segment = segment+6;
                    break;
                default:
                    break;
                }
                N = N/10;
            }
            }
            
           //System.out.println(segment);

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
           // System.out.println(other);
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
    } 
}
