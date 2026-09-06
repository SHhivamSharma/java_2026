//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


import java.util.*;

public class Main {
    public static void main(String[] args) {
    int num = 5 ; 
    for (int i = 1 ; i <= num ; i++){
        int nsp  = num - i ; 
        int nst = (2*i) - 1;

        for (int j = 0 ; j < nsp ; j++){
            System.out.print(" ");
        }

        for(int j = 0 ; j < nst ; j++){
            if( j!= 0 && j%2 != 0){
                System.out.print(" ");
            }else{
                System.out.print(i);
            }
        }
        System.out.println();
    }
    }
}   