package Maximum_broder;

import java.util.Scanner;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class maxi {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ti=0;ti<t;ti++){
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            char[][] newArray = new char[rows][columns];
            for(int i=0;i<rows;i++){
                String cells = sc.next();
            // System.out.println(cells);
                for(int ci=0;ci<cells.length();ci++){
                        newArray[i][ci] = cells.charAt(ci);
                }
            }
           // System.out.println("The cell matrix is:\n");
            int max_black_cell_row_count = 0;
            for(int i=0;i<rows;i++){
                int black_cell_count = 0;
                for(int j=0;j<columns;j++){
                    if(newArray[i][j] == '#'){
                        black_cell_count++;
                    }
                   // System.out.print(newArray[i][j]);
                }
                if(max_black_cell_row_count < black_cell_count){
                    max_black_cell_row_count = black_cell_count;
                }
            }
            System.out.println(max_black_cell_row_count);
        }

    }
}
