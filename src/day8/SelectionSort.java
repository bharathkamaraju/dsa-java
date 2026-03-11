package day8;
import java.util.Arrays;
//Time->0(n^2) space->0(1)
public class SelectionSort {
    public static void SelectionSort(int []arr) {
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={77,18,45,17,10,63};
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
