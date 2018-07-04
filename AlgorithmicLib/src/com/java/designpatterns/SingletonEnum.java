/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpatterns;

/**
 *
 * @author renukaj, amoghantarkar
 */
public enum SingletonEnum {
    INSTANCE;
    public void showMessage() {
        System.out.println("Single instantiated and called show messaged method.");
    }
}

class SingletonEnumDemo {
    public static void main(String[]args){
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.showMessage();
    } 
    
}
