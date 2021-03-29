/*This is a typical dynamic programming problem.
  The key of DP(dynaimc programming) is to seperate the original problem into sub-problems. This is four stages in DP
  1.Define the sub-problems
  2.(VITAL) Find out the recurrence relation among the sub-problems by array DP which contents the total results
  3.From bottom to top to solve the problem
  4.Try to optimize the results
*/
class Solution {
  public int rob(int[] nums) {
    int []dp=new int[nums.length+1];//The index of dp is the number of houses 
    dp[0]=0;//If there is no house return 0;
    dp[1]=nums[0];
    for(int k=2;k<=nums.length;k++){
      dp[k]=Math.max(dp[k-1],dp[k-2]+nums[k-1]);
    }
    return dp[nums.length];
  }
}
