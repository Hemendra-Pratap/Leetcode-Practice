import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        LinkedList<Integer> res = new LinkedList<>();

        int idx = Arrays.binarySearch(arr, x);
        if (idx < 0) {
            idx = -idx - 1;
        }

        int left = idx - 1;
        int right = idx;

        while (k != 0) {
            if (left < 0) {
                res.addLast(arr[right++]);
            } else if (right >= arr.length) {
                res.addFirst(arr[left--]);
            } else {
                if (Math.abs(arr[left] - x) < Math.abs(arr[right] - x)) {
                    res.addFirst(arr[left--]);
                } else if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                    res.addLast(arr[right++]);
                } else {
                    if (arr[left] < arr[right]) {
                        res.addFirst(arr[left--]);
                    } else {
                        res.addLast(arr[right++]);
                    }
                }
            }
            k--;
        }

        return res;
    }
}
// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         ArrayList<Integer> res = new ArrayList<>();
//         int idx = Arrays.binarySearch(arr, x);

//         if(idx < 0){
//             idx = -idx -1; 
//         }

//         int left = idx-1;
//         int right = idx;
//         while(k != 0){
//             if(left < 0 ){
//                 res.add(arr[right++]);
//             }else if(right == arr.length){
//                 res.add(arr[left--]);
//             }else{
//                 if(Math.abs(arr[left]-x) < Math.abs(arr[right]-x)){
//                     res.add(arr[left]);
//                     left--;
//                 }else if(Math.abs(arr[left]-x) > Math.abs(arr[right]-x)){
//                     res.add(arr[right]);
//                     right++;
//                 }else{
//                     if(arr[left] < arr[right]){
//                         res.add(arr[left]);
//                         left--;
//                     }
//                     else{
//                         res.add(arr[right]);
//                         right++;
//                     }
//                 }
//             }

//             k--;
//         }

        
//         return res;
//     }
// }