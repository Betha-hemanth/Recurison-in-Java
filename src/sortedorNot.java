import java.util.*;
public class sortedorNot {
    static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 3, 14, 45, 87};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }


}
