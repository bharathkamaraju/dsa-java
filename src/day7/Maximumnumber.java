package day7;

public class Maximumnumber {
    public static void main(String[] args) {
        int []nums={18,10,77,7,45};
        //Assume first element is max
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max=nums[i];//update max if current element is greater
            }
        }
        System.out.println("Maximum Element:"+max);
    }
}
