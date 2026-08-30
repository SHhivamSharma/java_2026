//solid rhombus pattern 

//         * * * * * 
//       * * * * * 
//     * * * * * 
//   * * * * * 
// * * * * * 



import java.util.*;

public class Main {
    public static void main(String[] args) {
     int n = 5 ; 
     for (int i = 1 ; i <= n ; i++){
        int nsp = n - i;
        for(int j = 0 ; j < nsp ; j++){
            System.out.print("  ");
        }
        for(int j = 0 ; j< n ; j++){
            System.out.print("* ");
        }
        System.out.println();
     }

    }
}   