/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.strings;

import java.util.Arrays;

/**
 *
 * @author renukajoshi,amoghantarkar
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
            
        for(int i = 0; i < nums.length; i +=2){
            sum += nums[i]; 
        }
        return sum;
    }
}
