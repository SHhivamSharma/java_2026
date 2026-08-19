//inverted half pyramid rotated 180
//       *
//      **
//     ***
//    ****
//   *****
//  ******
// *******

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 7;
      int nsp =  n-1;
      int nst = n - nsp;
      for(int i = 0 ; i < n ; i++){
        while(nsp > 0){
            System.out.print(" ");
            nsp--;
        }
        while(nst > 0){
            System.out.print("*");
            nst--;
        }
        nsp = n - i-2;
        nst =  n - nsp;
        System.out.println();
    }
}

// ------ solution 2 --------

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n = 5;
      for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= n-i ; j++){
            System.out.print(" ");
        }
        for(int j = 1 ; j <= i ; j ++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
} 