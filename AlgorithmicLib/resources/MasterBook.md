
# Master Book of Code

## Description

Running Book containing some of the classic problems.

## Solutions


<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [Master Book of Code](#master-book-of-code)
	- [Description](#description)
	- [Solutions](#solutions)
		- [Two Sum](#two-sum)

<!-- /TOC -->

--------------------------
### Two Sum
https://leetcode.com/problems/two-sum/

```java

 class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i = 0; i< nums.length; i++){
          int complement = target - nums[i];
          if(map.containsKey(complement)){
              return new int[]{map.get(complement),i};
          }else{
              map.put(nums[i],i);
          }

      }
      throw new IllegalArgumentException("No two sum solution");
    }
}

```
