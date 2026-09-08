import java.util.*;
public class LSonMultipleTar {
    static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 8, 14, 45, 87};
        search(arr,8,0);
        System.out.println(list);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void search(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        search(arr,target,index+1);
    }
}
