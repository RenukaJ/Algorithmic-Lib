/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.strings;

/**
 *
 * @author renukajoshi,amoghantarkar
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i<j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }
            
        }
        return new int[]{0,0};
    }
}
