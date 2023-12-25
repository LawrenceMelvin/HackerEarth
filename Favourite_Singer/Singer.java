import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Singer {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> contain = new ArrayList<Long>();
        long number_of_songs = sc.nextLong();
        for(long i=0;i<number_of_songs;i++){
            contain.add(sc.nextLong());
        }
        Collections.sort(contain);
        long val =0;
        long count = 1;
        HashMap<Long, Long> map = new HashMap<>();
        for(int i=0;i<contain.size();i++){
            if(map.containsKey(contain.get(i))){
                count++;
                map.put(contain.get(i),count);
            }else{
                count = 1;
                map.put(contain.get(i),count);
            }
        }
        int most_count = 0;
        Long map_vals = 0L;
        for(Map.Entry<Long,Long> entry : map.entrySet()){
            if(map_vals < entry.getValue()){
                map_vals = entry.getValue();
                most_count = 0;
            }
            if(map_vals == entry.getValue()){
                most_count++;
            }
        }
        System.out.println(most_count);
        }
}
