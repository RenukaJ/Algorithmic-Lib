/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

/**
 * https://leetcode.com/problems/two-sum/
 * @author amoghantarkar
 */
import java.util.*;



public class TwoSum {
    
}


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
