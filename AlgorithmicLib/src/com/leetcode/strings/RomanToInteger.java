/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.strings;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 * @author renukajoshi
 */
public class RomanToInteger {
    
    public int romanToInt(String s) {
        if(s.length() < 1) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int result;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        char prev = s.charAt(s.length()-1);
        int sum = map.get(prev);

        for(int i=s.length()-2; i>= 0; i--) {
            char current = s.charAt(i);
            int currentVal = map.get(current);
            
            boolean a = current == 'I' && (prev == 'V' || prev == 'X');
            boolean b = current == 'X' && (prev == 'L' || prev == 'C');
            boolean c = current == 'C' && (prev == 'D' || prev == 'M');
            
            if(a || b || c)
                sum -= currentVal;
            else
                sum += currentVal;
            
            prev = current;
        }
        return sum;
    }

}
