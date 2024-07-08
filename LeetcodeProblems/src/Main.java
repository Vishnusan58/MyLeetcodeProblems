class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int numm: nums){
            if (even(numm)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int numm) {
        int numberofdiigit = digit(numm);
        return numberofdiigit % 2 == 0;
    }
    static int digit(int numm) {
        if(numm < 0){
            numm = numm * -1;
            return numm;
        }
        if(numm == 0){
            return 1;
        }
        int count =0;
        while(numm> 0){
            numm= numm/10;
            count ++;
        }
        return count;
    }



}