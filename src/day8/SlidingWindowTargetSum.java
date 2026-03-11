package day8;

public class SlidingWindowTargetSum {
    public static void main(String[] args) {
        int  []arr={1,2,5,7,3,4,6};
        int k=3;//Windiw Sum
        int target=13;
        int sum=0;
        boolean found=false;
        //first window
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum==target){
            found=true;
        }
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if(sum==target)
            {
                found=true;
            }
        }
        if(found){
            System.out.println("Subarray Exists");
        }
        else{
            System.out.println("Subarray does not exists");
        }
        }


    }

