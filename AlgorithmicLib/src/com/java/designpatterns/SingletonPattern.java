/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.designpatterns;

/**
 *
 * @author amoghantarkar,renukaj
 */
public class SingletonPattern {
 
     public static void main(String[]args){
         
         Singleton singleton = Singleton.getInstance();
         singleton.printPattern();
         
     }
}

class Singleton{
    
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return instance;
    }
    
    public static void printPattern(){
        System.out.println("Singleton object created..");
    }
    
    
    
}