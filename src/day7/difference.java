package day7;

public class difference {
    public static void main(String[] args) {
        int []nums={18,10,77,7,45};
        //Assume first element is max and min
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max){
                max=nums[i];//update max if current element is greater
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("difference:"+(max-min));
    }
}
