import java.util.*;
public class linearSerach {
    static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 3, 14, 45, 87};
        System.out.println(search(arr, 8, 0));
        System.out.println(searchlast(arr,3,arr.length-1));
        System.out.println(linearsearch(arr,14,0));
    }

    static int search(int[] arr, int target, int index) {
        if (target == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, target, index + 1);
    }

    static int searchlast(int[] arr, int target, int index) {
        if (target == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchlast(arr, target, index - 1);
    }
    static boolean linearsearch(int[] arr, int target, int index) {
        if (target == -1) {
            return false;
        }
        return target == arr[index] || linearsearch(arr,target,index+1);
    }
}