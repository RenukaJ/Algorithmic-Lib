package com.leetcode.strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renukajoshi
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() - 1; i>=0;i--){
            
            if(count == 0 && s.charAt(i) == ' ' ){
                 continue; 
            }else if(s.charAt(i) == ' '){
                return count;
            }else{
                count++;
            }
            
           
        }
        return count;
    }
}
