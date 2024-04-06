public class MajorityElemnt {
    public int function(int [] nums){

        int count = 0;
        int candidate = 0;

        for(int num:nums){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1: 0;
        }

        count = 0;
        for(int num : nums){
            if(num == candidate){
                count++;
            }
        }

        return (count > nums.length /2)? candidate : 0;
    }
}
