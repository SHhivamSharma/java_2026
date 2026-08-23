//0-1 Triangle
// 1 
// 0 1 
// 0 1 0 
// 1 0 1 0 
// 1 0 1 0 1 

//Floyd's Triangle -
import java.util.*;

public class Main {
    public static void main(String[] args) {
     int n = 5 ;
     int num = 1;
     for (int i = 0 ; i< n ; i++){
        for(int j = 0 ; j <= i ; j++){
            if(num == 1){
                System.out.print(num+ " ");
                num--;
            }else{
                System.out.print(num+ " ");
                num++;
            }
        }
        System.out.println();
     }
    }
}   