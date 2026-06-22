package Review6;

class Solution {

        int low=0;
        int high=nums.length-1;
        int pivot=0;
        // int mid=(low+high)/2;
        
        while(pivot<=high){
            if(nums[pivot]==0){
            //swap
            int temp=nums[low];
            nums[low]=nums[pivot];
            nums[pivot]=temp;

            low++;
            pivot++;
            }

            else if(nums[pivot]==1){
                pivot++; 
            }
            else{     //pivot==2
                //swap
                int temp=nums[high];
                nums[high]=nums[pivot];
                nums[pivot]=temp;
                high--;
            }
        }
    }
}