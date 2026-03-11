package day7;

public class Minimumelement {
    public static void main(String[] args) {
        int []nums={18,10,77,7,45};
        //Assume first element is max
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min){
                min=nums[i];//update max if current element is greater
            }
        }
        System.out.println("Minimum Element:"+min);
    }
}
