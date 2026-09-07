public class App {
    public static void main(String[] args) throws Exception {

        int arr[] = {2,7,11,15};
        int target = 18;
        int res[] =  twoSum(arr, target);

        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i] + " ");
        }

    }
    

    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public  static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int start = 0 ;
        int end = len - 1;
        while (start <= end){
            long sum = numbers[start] + numbers[end];
            if(sum == target ){
                return new int[] {start+1 , end+1 };
            }else if (sum > target){
                end--;
            }else{
                start++;
            }
        }
    return new int[] {};
        
    }
}
